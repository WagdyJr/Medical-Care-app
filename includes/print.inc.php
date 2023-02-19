<?php
	
	include 'class.autoload.inc.php';

	$name = $_POST["name"];
	$pass = $_POST["pass"];

	$printc = new print($name, $pass);

	echo $printc->print();
 ?>