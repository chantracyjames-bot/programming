import datetime
from abc import ABC, abstractmethod

class Borrowable(ABC):
    @abstractmethod
    def calculate_overdue(self, days_late: int) -> float:
        pass


class Books(Borrowable):
    def __init__(self, title: str):
        self.__title: str = title
        
    def borrow_item(self) -> None:
        my_obj: datetime = datetime.datetime.now()
        formatted_date: str = datetime.datetime.ctime(my_obj)
        print(f'Success! "{self.__title}" has been checked out on {formatted_date}')
        
    def calculate_overdue(self, days_late: int) -> float:
        return days_late * 0.5

class DVD(Borrowable):
    def __init__(self, title: str):
        self.__title: str = title
        
    def borrow_item(self) -> None:
        my_obj: datetime = datetime.datetime.now()
        formatted_date: str = datetime.datetime.ctime(my_obj)
        print(f'Success! "{self.__title}" has been checked out on {formatted_date}')
        
    def calculate_overdue(self, days_late: int) -> float:
        return days_late * 2.0

book_obj = Books('idkman')
dvd_obj = DVD('lumbago')

while(True):
    print("--- Welcome to the Library Portal --- \n1. Borrow an Item\n2. Return an Item\nChoose an option: ", end= '')
    tmp: int = input()
    match tmp:
        case '1':
            print("What would you like to borrow? (1 for Book or 2 for DVD)\nInput: ", end= '')
            tmp: int = input()
            book_obj.borrow_item() if tmp == '1' else dvd_obj.borrow_item() if tmp == '2' else print('Invalid Option')
        case '2':
            print("Which item are you returning? (1 for Book or 2 for DVD): ", end= '')
            tmp: int = input()
            print('How many days late is it?:', end= '')
            days_late: int = input()
            if tmp == '1':
                print(f'The overdue fee for the Book is ${book_obj.calculate_overdue(days_late)}')
            elif tmp == '2':
                print(f'The overdue fee for the DVD is ${book_obj.calculate_overdue(days_late)}')
            else:
                print('Invalid Option.')
        case _:
            print('Invalid Option.')
    print('-----------------------------------------')