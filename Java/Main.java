class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car( "AMQ342",new Account("Andres Herrera", "1013254323"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("ACR902",new Account("Camila Herrera","100532659"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
}