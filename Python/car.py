from account import Account

class Car:    
    id = int
    license = str
    driver = Account("","")
    passegenger = int

    def __int__(self,license,driver):
        self.license = license
        self.driver = driver