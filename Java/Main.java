class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car();
        car.license = "AMQ342";
        car.driver = "Andres herrrera";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "ACR902";
        car2.driver = "Camila herrrera";
        car2.passegenger = 3;
        car2.printDataCar();
    }
}