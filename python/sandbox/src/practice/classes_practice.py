class Drone():
    
    def __init__(self, model, __battery_level):
        status = "Idle"
        self.__battery_level = __battery_level
        print(status)
    @property
    def battery(self):
        print(f'{self.__battery_level}')
        
test_drone = Drone("Shadow-V2", "85%")
test_drone.battery()