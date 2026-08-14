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
            process_input(input(), db_stuff)

    except mysql.connector.Error as err:
        print(f"debug it: {err}")
    finally:
        cursor.close()
        db_stuff.close()


def menu_stuff():
    print("Stupid tarcy's Database")
    print("-----------------------")
    print("1. List table contents")
    print("2. Add new record")
    print("3. Delete record")
    print("x. Advanced")
    print("")
    print("Input: ", end="")


def process_input(user_input: int, db: MySQLConnection):
    match user_input:
        case "1":
            list_stuff(db)
        case "2":
            add_stuff(db)
        case "3":
            del_stuff(db)
        case "x":
            advanced_stuff(db)
        case "0":
            exit(0)
        case _:
            print(f"Invalid input: {user_input}")


def list_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute("SELECT * FROM db_table ORDER BY ID")
    print("ID : Language Name : Current Level")
    for x in temp_cursor:
        print(f"{x[0] if x[0] is not None else "NULL":^2} : ", end="")
        print(f"{x[1] if x[1] is not None else "NULL":^13} : ", end="")
        print(f"{x[2] if x[2] is not None else "NULL":^13} : ", end="")
    print()

    temp_cursor.close()


def add_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_in_lang: str = input("\nEnter new Language: ")
    temp_in_lev: str = input("\nEnter Current Level: ")
    new_stuff: str = "INSERT INTO db_table (LanguageName, CurrentLevel) VALUES (%s, %s)"
    new_entry: tuple[str] = (temp_in_lang, temp_in_lev)

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
    process_advanced_input(input(), db)


def advanced_menu_stuff() -> None:
    print("Advanced stuff here")
    print("-------------------")
    print("1. Create Table")
    print("2. Create View")
    print("3. Truncate Table")
    print("r. Basic Menu")
    print("")
    print("Input: ", end="")


def process_advanced_input(user_input: int, db: MySQLConnection) -> None:
    match user_input:
        case "1":
            create_stuff(db)
        case "2":
            view_stuff(db)
        case "0":
            ...
        case "r":
            ...
        case _:
            print(f"Invalid input: {user_input}")


def create_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute(
        "CREATE TABLE IF NOT EXISTS db_table ( ID int AUTO_INCREMENT PRIMARY KEY, LanguageName varchar(255) NOT NULL, CurrentLevel varchar(255) NOT NULL, UNIQUE (LanguageName))"
    )

    db.commit()
    print(f"Table has been created")


def view_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute("SELECT * FROM db_table")


def truncate_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute("TRUNCATE TABLE db_stuff")


if __name__ == "__main__":
    load_dotenv()
    main()
# i get it, too lazy to modulize everything
