import os
import subprocess
from pathlib import Path
from github import Github
from github import Auth
from dotenv import load_dotenv

# will definite break once a new language is added, *ehem js
EXTENSIONS: dict = {
    "Assembly": [".asm"],
    "Shell": [".sh"],
    "C": [".c", ".h"],
    "C++": [".cpp", ".cxx", ".hxx", ".hpp"],
    "Java": [".java"],
    "HTML": [".html", ".htm"],
    "Markdown": [".md"],
    "Python": [".py"],
    "Rust": [".rs"],
}


# function to get the percentage and everything
def get_percentage():
    # creates a Github object
    git_stuff = Github(auth=Auth.Token(os.getenv("TOKEN")))
    # retrieves a repostitory using the Github object
    repo = git_stuff.get_repo("chantracyjames-bot/programming")
    # retrieves the languages present in the repo
    languages: dict = repo.get_languages()
    # removes the url entry, byproduct of the .get_languages() method
    languages.pop("url")
    languages.update({"Others": 0})

    # gets the total lines and characters
    per_lang, total_stuff = get_lang_tally()

    # initializes some local variables
    total_count: float = sum(
        languages.values()
    )  # sums up the percentages reported by Github
    # note that the percentages that it returns is in bytes
    total_percent: float = 0
    bytes_count: float = 0
    # prints the header of the table
    print(f"{'Language':^10s}: {'Percent':^7s} : {'Lines':^7s} : {'Text':^7s}")
    print("------------------------------------------")

    # loops the languages dictionanry
    for lang, cur_count in languages.items():
        # retrieves the true percentage of a language by dividiving by the total
        bytes_count = cur_count / total_count * 100
        # prints the calculated cound
        print(
            f"{lang:^10s}: {bytes_count:6.02f}% : {per_lang[lang]["lines"]:^7,d} : {per_lang[lang]["chars"]:,d}"
        )
        # adds the current language's count to the total percentage
        total_percent += bytes_count  # should total to 100.00

    # prints the bottom portion of the table
    print("------------------------------------------")
    print(
        f'{'Total':^10s}: {total_percent:.02f}% : {total_stuff["lines"]:7,d} : {total_stuff["chars"]:,d}'
    )
    git_stuff.close()


# checks if the the extension of a file is in the EXTENSIONS dict
def get_language(file_stuff):
    ext = Path(file_stuff).suffix.lower()
    for lang, exts in EXTENSIONS.items():
        if ext in exts:
            return lang
    # contigency if it isn't present
    return "Others"


# used to get the count of lines and characters
def get_lang_tally():
    # retrieves the terminal output of the 'git ls-files' command
    term_output = subprocess.run(
        ["git", "ls-files"], capture_output=True, text=True, check=True
    )
    # splits each line stored inside of term_output
    files: lists = term_output.stdout.splitlines()

    # initializes some variables
    total_stats: dict = {"chars": 0, "lines": 0}
    cur_stats: dict = {
        lang: {"chars": 0, "lines": 0} for lang in list(EXTENSIONS.keys()) + ["Others"]
    }

    # loops through the file provided by the files lists
    for file_stuff in files:
        # checks using the get_language() function if the file is present inside the EXTENSIONS dict
        lang: str = get_language(file_stuff)
        with open(file_stuff, "r", encoding="utf-8") as file:
            content = file.read()
            chars_count = len(content)
            lines_count = content.count("\n") + (1 if content else 0)
            cur_stats[lang]["chars"] += chars_count
            cur_stats[lang]["lines"] += lines_count
            total_stats["chars"] += chars_count
            total_stats["lines"] += lines_count
    # returns the calculated statistics
    return [cur_stats, total_stats]


if __name__ == "__main__":
    os.chdir("/home/tarcy_arch/Documents/Programming")
    load_dotenv()
    get_percentage()


# old way to get the tally of the total count of lines and characters
# kept for preservation's sake (All Hail The Amber Lord)
def get_total():
    # retrieves the terminal output of the 'git ls-files' command
    term_output: str = subprocess.run(
        ["git", "ls-files"], capture_output=True, text=True, check=True
    )
    # splits each line stored inside of term_output
    tracked_stuff = term_output.stdout.splitlines()

    # some local variables
    temp: str
    total_lines: int = 0
    total_text: int = 0

    # through the contents inside of the tracked_stuff list
    for file_stuff in tracked_stuff:
        # converts the value of file_stuff into a Path object
        path_stuff = Path(file_stuff)
        # queries of the path is actually an object
        if path_stuff.is_file():
            try:
                with open(path_stuff, "r", encoding="utf-8") as f:
                    total_lines += sum(1 for _ in f)
                with open(path_stuff, "r", encoding="utf-8") as f:
                    total_text += len(f.read())
            except Exception as err:
                pass
    # returns the inaccurate but good stuff
    return [total_lines, total_text]
