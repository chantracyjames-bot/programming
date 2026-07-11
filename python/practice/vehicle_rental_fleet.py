from enum import Enum
from abc import ABC, abstractmethod

class VehicleType(Enum):
    CAR = 1
    TRUCK = 2
    MOTORCYCLE = 3
 
class Vehicle(ABC):
    def __init__(self, id: str, base_rate: float, type: VehicleType):
        self.id = id
        self.base_rate = base_rate
        self.type = type
        
    def get_id(self):
        return self.id
    
    def get_base_rate(self):
        return self.base_rate
    
    def get_type(self):
        return self.type
    
    @abstractmethod
    def calculcate_rental(day: int) -> float:
        pass

class Car(Vehicle):
    def __init__(self, id: str, base_rate: float, type: VehicleType, has_insurance: bool):
        super().__init__(id, base_rate, type)
        self.has_insurance = has_insurance
 
    def calculcate_rental(self, days: int) -> float:
        return self.base_rate * days
    
    def get_insurance(self) -> bool:
        return self.has_insurance


class Truck(Vehicle):
    def __init__(self, id: str, base_rate: float, type: VehicleType, cargo_capacity: double):
        super().__init__(id, base_rate, type)
        self.cargo_capacity = cargo_capacity
 
    def calculcate_rental(self, days: int) -> float:
        return self.base_rate * days
    
    def get_capacity(self) -> double:
        return self.cargo_capacity
    
test = [ 
    Car('C101', 50, VehicleType.CAR, True),
    Car('C102', 50, VehicleType.CAR, False),    
    Truck('T101', 90, VehicleType.TRUCK, 5.0)
]

def insurance_status(status: bool) -> str:
    if status:
        return "with Insurance"
    return "No Insurance"

def cargo_status(cargo: float) -> str:
    if cargo > 3.0:
        return "Heavy-duty Fee Applied"
    return "No Heavy-duty Fee"

days = 7

for i in range(len(test)):
    print(f'Vehicle ID: {test[i].get_id()} | Type: {test[i].get_type()} | Daily Base Rate: {test[i].get_base_rate()}')
    print(f'Rental Cost for {days} days {insurance_status(test[i].get_insurance()) if isinstance(test[i], Car) else cargo_status(test[i].get_capacity())}): {test[i].calculcate_rental(days)}')