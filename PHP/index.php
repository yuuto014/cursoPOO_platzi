<?php
require_once("car.php");
require_once("account.php");

$car = new Car("ASE264",new Account("Camila Rojas","1034562342"));
$car->printDataCar();
?>