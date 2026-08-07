import os
import mysql.connector
from mysql.connector import Error
from dotenv import load_dotenv


def main() -> None:
    try:
        # change host, user, and password to you setup
        db_stuff: MySQLConnection = mysql.connector.connect(
            host=str(os.getenv("MYSQL_HOSTNAME")),
            user=str(os.getenv("MYSQL_USERNAME")),
            password=str(os.getenv("MYSQL_PASSWORD")),
        )
        # change this to your database
        cursor: MySQLCursor = db_stuff.cursor()
        cursor.execute("USE learning")

        while True:
            menu_stuff()
            process_input(int(input()), db_stuff)

    except mysql.connector.Error as err:
        print(f"debug it: {err}")
    finally:
        cursor.close()
        db_stuff.close()


def menu_stuff():
    print('Stupid tarcy\'s Database ("0" is exit)')
    print("-------------------------------------")
    print("1. List table contents")
    print("2. Add new record")
    print("3. Delete record")
    print("-1. Advanced")
    print("")
    print("Input: ", end="")


def process_input(user_input: int, db: MySQLConnection):
    match user_input:
        case 1:
            list_stuff(db)
        case 2:
            add_stuff(db)
        case 3:
            del_stuff(db)
        case -1:
            advanced_stuff(db)
        case 0:
            exit(0)
        case _:
            print(f"Invalid input: {user_input}")


def list_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute("SELECT * FROM programming_view ORDER BY EntryNumber")
    print(f"\n{'Entry'} : {'Language':^12s}")
    print("---------------------")
    for entry, lang in temp_cursor:
        print(f"{entry:^5d} : {lang:^12s}")
    print()

    temp_cursor.close()


def add_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_in: str = input("\nEnter new Language: ")
    new_stuff: str = "INSERT INTO programming (LanguageName) VALUES (%s)"
    new_entry: tuple[str] = (temp_in,)

    temp_cursor.execute(new_stuff, new_entry)
    db.commit()
    print(f"dunno why i suck: {temp_cursor.lastrowid}\n")
    temp_cursor.close()


def del_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_in: str = input("\nEnter ID to drop: ")
    rm_stuff: str = "DELETE FROM programming WHERE EntryNumber=(%s)"
    rm_entry: tuple[str] = (temp_in,)

    temp_cursor.execute(rm_stuff, rm_entry)
    db.commit()
    print(f"dunno why i suck: {temp_cursor.lastrowid}\n")
    temp_cursor.close()


def advanced_stuff(db: MySQLConnection) -> None:
    advanced_menu_stuff()
    process_advanced_input(int(input()), db)


def advanced_menu_stuff() -> None:
    print('Advanced stuff here ("0" means go back)')
    print("---------------------------------------")
    print("1. Create Table")
    print("2. Truncate Table")
    print("3. Delete Table")
    print("")
    print("Input: ", end="")


def process_advanced_input(user_input: int, db: MySQLConnection):
    match user_input:
        case 1:
            ...
        case 2:
            ...
        case 3:
            ...
        case -1:
            ...
        case 0:
            ...
        case _:
            print(f"Invalid input: {user_input}")


if __name__ == "__main__":
    load_dotenv()
    main()
# i get it, too lazy to modulize everything
