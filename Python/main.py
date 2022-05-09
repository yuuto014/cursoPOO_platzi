from car import Car

if __name__ == "__main__":
    print("hola mundo")
    car = Car()
    car.license = "AMQ342"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "ACR902"
    car2.driver = "Camila Herrrera"
    print(vars(car2))