<?php
spl_autoload_register('muAutoLoader');

function myAutoLoader($className){
	
	$url = $_SERVER['HTTP_HOST'] . $_SERVER['REQUEST_URI']

	if (strpos($url, 'includes') !== false)
		$path = "../classes/";
	else
		$path = "classes/";
	
	$extension = ".class.php";

	include_once $path . $cLassName .$extension;



}