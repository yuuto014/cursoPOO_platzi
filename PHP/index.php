<?php
require_once("car.php");
require_once("account.php");
require_once("uberX");
require_once("uberPool");

$uberX new UberX("CVB134",new Account("Andres Herrera","1025462674"),"Chevrolet","Spark");
$uberX->printDataCar();

$uberPool = new UberPool("CVB134",new Account("Andrea Ferrant","1023744589"),"Chevrolet","Spark");
$uberPool ->printDataCar();


// $car = new Car("ASE264",new Account("Camila Rojas","1034562342"));
// $car->printDataCar();

?>