<?php

require_once('Car.php');
require_once('Account.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberVan.php');


$uberX = new UberX("CVB123", new Account("Joserph Camacho", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();

$uberPool = new UberPool("DFG123", new Account("Erika Gomez", "BUT587"), "Dodge", "Attitude");
$uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();
?>