class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberX uberx = new UberX( "AMQ342",new Account("Andres Herrera", "1013254323"),"Chevrolet","Aveo");
        uberx.setPassenger(4);
        uberx.printDataCar();

        // UberPool uberPool = new UberPool("ACR902",new Account("Camila Herrera","100532659"),"Mazda","3");
        // uberPool.passenger = 3;
        // uberPool.printDataCar();
        UberVan uberVan = new UberVan("VDT235",new Account("Edison Buitrago", "746783245"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}