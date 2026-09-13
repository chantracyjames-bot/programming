from abc import ABC, abstractmethod


class AbstractCalculator(ABC):
    @abstractmethod
    def print_menu(self) -> None:
        pass

    @abstractmethod
    def print_type_size(self) -> None:
        pass

    @abstractmethod
    def calc_1d(self) -> None:
        pass

    @abstractmethod
    def calc_2d(self) -> None:
        pass

    @abstractmethod
    def calc_3d(self) -> None:
        pass

    @abstractmethod
    def exit_program(self) -> None:
        pass

    @abstractmethod
    def index_in_bounds(self, index: int, upper_bound: int) -> bool:
        pass
