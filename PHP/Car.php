<?php
require_once('account.php');
class Car {
    public $id = integer;
    public $license = string;
    public $diver = Account("","");
    public $passenger = string;

    public function __construct($license, Account $driver){
        $this->license = $license;
        $this->driver = $diver;
    }

    public function printDataCar(){
        echo "Licencia: : .$this->license Driver: ".$this->driver->name;
    }
}
?>
