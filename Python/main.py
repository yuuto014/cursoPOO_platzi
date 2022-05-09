from car import Car
from account import Account

if __name__ == "__main__":
    print("hola mundo")

    car = Car("AMQ342", Account("Andres Herrera","109352693"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("ACR902", Account("Camila Herrera","178963209"))
    print(vars(car2))
    print(vars(car2.driver))