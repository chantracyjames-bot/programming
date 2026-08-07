import os
import subprocess
from pathlib import Path
from github import Github
from github import Auth
from dotenv import load_dotenv

# will definitely break once a new language is added, *ehem js
# nvm, sql came first
EXTENSIONS: dict = {
    "Assembly": [".asm"],
    "Shell": [".sh"],
    "C": [".c", ".h"],
    "C++": [".cpp", ".cxx", ".hxx", ".hpp"],
    "CSS": [".css"],
    "Java": [".java"],
    "JavaScript": [".js"],
    "SQL": [".sql", ".db"],
    "HTML": [".html", ".htm"],
    "Markdown": [".md"],
    "Python": [".py"],
    "Rust": [".rs"],
}


# function to get the percentage and everything
def get_percentage():
    # creates a Github object
    git: Github = Github(auth=Auth.Token(os.getenv("TOKEN")))
    # retrieves a repostitory using the Github object
    repo = git.get_repo("chantracyjames-bot/programming")
    # retrieves the languages present in the repo
    languages: dict = repo.get_languages()
    # removes the 'url' entry, byproduct of the .get_languages() method
    languages.pop("url")
    # adds the 'Others' entry, making sure that unknown files are shown
    languages.update({"Others": 0})

    # gets the total lines and characters
    per_lang, total_stuff = get_lang_tally()

    # initializes some local variables
    total_count: float = sum(languages.values())
    # sums up the percentages reported by Github
    # note that the percentages that it returns is in bytes
    total_percent: float = 0
    bytes_count: float = 0
    # prints the header of the table
    print("----------------------------------------------")
    print(f"| {'Language':^10s} : {'Percent':^7s} : {'Lines':^7s} : {'Chars':^10s}|")
    print("----------------------------------------------")

    # loops the languages dictionanry
    for lang, cur_count in languages.items():
        # retrieves the true percentage of a language by dividiving by the total
        bytes_count = cur_count / total_count * 100
        # adds the current language's count to the total percentage
        total_percent += bytes_count  # should total to 100.00
        # prints the calculated count
        print(
            f"| {lang:^10s} : {bytes_count:^6.02f}% : {per_lang[lang]['lines']:^7,d} : {per_lang[lang]['chars']:^10,d}|"
        )

    # prints the bottom portion of the table
    print("----------------------------------------------")
    print(
        f"| {'Total':^10s} : {total_percent:.02f}% : {total_stuff['lines']:7,d} : {total_stuff['chars']:^10,d}|"
    )
    git.close()


# checks if the the extension of a file is in the EXTENSIONS dict
def get_language(file_stuff):
    ext = Path(file_stuff).suffix.lower()
    for lang, exts in EXTENSIONS.items():
        if ext in exts:
            return lang
    # contigency if it isn't present
    print(file_stuff)
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
            # per iteration
            chars_count = len(content)
            lines_count = content.count("\n") + (1 if content else 0)
            # per language count
            cur_stats[lang]["chars"] += chars_count
            cur_stats[lang]["lines"] += lines_count
            # total count
            total_stats["chars"] += chars_count
            total_stats["lines"] += lines_count
    # returns the calculated statistics
    return [cur_stats, total_stats]


# used to see if there are new languages
def debug():
    # creates a Github object
    git: Github = Github(auth=Auth.Token(os.getenv("TOKEN")))
    # retrieves a repostitory using the Github object
    repo = git.get_repo("chantracyjames-bot/programming")
    # retrieves the languages present in the repo
    languages: dict = repo.get_languages()

    # loop stuff
    for lang in languages.items():
        print(lang)


if __name__ == "__main__":
    os.chdir("/home/tarcy_arch/Documents/Programming")
    load_dotenv()
    get_percentage()
