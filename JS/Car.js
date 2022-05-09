/*function Car(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}*/

//uso de class en vez de usar prototype

class Car {
    constructor(license, driver){
        this.license = license;
        this.driver = driver;
        this.id;
        this.passenger;
    }
    printDataCar = () => {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}