class InventoryTracker:
    def __init__(self, name: str, price: float, quantity: int) -> None:
        self.__name = name
        self.__price = price
        self.__quantity = quantity
        self.__discount_status = False

    def get_name(self) -> str:
        return self.__name
    
    def get_price(self) -> float:
        return self.__price
    
    def get_quantity(self) -> int:
        return self.__quantity

    def set_price(self, price: float) -> None:
        self.__price = price
        
    def restock_product(self, num: int) -> None:
        self.__quantity += num

    def sell_product(self, num: int) -> bool:
        if self.__quantity >= num:
            self.__quantity -= num
            return True
        return False

    def get_discount_status(self) -> bool:
        return self.__discount_status
    
    def set_discount_status(self, percent: float) -> None:
        if not self.__discount_status:
            self.__price -= (self.__price * percent)
            self.__discount_status = True