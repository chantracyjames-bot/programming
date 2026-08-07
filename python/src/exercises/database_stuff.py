import mysql.connector
from mysql.connector import Error


def main() -> None:
    try:
        # change host, user, and password to you setup
        db_stuff: MySQLConnection = mysql.connector.connect(
            host="127.0.0.1", user="tarcy", password="ruminate"
        )

        cursor: MySQLCursor = db_stuff.cursor()
        # change this to your database
        cursor.execute("USE learning")

        print('Stupid tarcy\'s Database ("q" is exit)')
        print("-------------------------------------")

        list_stuff(db_stuff)
    except mysql.connector.Error as err:
        print(f"debug it: {err}")
    finally:
        cursor.close()
        db_stuff.close()

def menu_stuff():
    print("wip")


def list_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_cursor.execute("SELECT * FROM programming_view")
    print(f"{'Entry'} : {'Language':^12s}")
    for entry, lang in temp_cursor:
        print(f"{entry:^5d} : {lang:^12s}")

    temp_cursor.close()


def add_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_in: str = input("Enter new Language: ")
    new_stuff: str = "INSERT INTO programming (LanguageName) VALUES (%s)"
    new_entry: tuple[str] = (temp_in,)

    temp_cursor.execute(new_stuff, new_entry)
    db.commit()
    print(f"dunno why i suck: {temp_cursor.lastrowid}\n")
    temp_cursor.close()


def del_stuff(db: MySQLConnection) -> None:
    temp_cursor: MySQLCursor = db.cursor()
    temp_in: str = input("Enter ID to drop: ")
    rm_stuff: str = "DELETE FROM programming WHERE EntryName=(%s)"
    rm_entry: tuple[str] = (rm_stuff,)

    temp_cursor.execute(rm_stuff, rm_entry)
    db.commit()
    print(f"dunno why i suck: {temp_cursor.lastrowid}\n")
    temp_cursor.close()


if __name__ == "__main__":
    main()
