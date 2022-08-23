from car import Car
from account import Account

if  __name__ == "__main__":
    print("Hola mundo")

    carA = Car("AMS234", Account("Joserph Camacho", "ANDA876"))
    print(vars(carA))
    print(vars(carA.driver))
    