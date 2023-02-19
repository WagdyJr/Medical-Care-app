<?php
	
	
	class person
	{
		public $name;
		public $pass;
		function __construct(string $name, string $pass )
		{
			$this->name = name;
			$this->pass = pass;
		}

		public function print(){

			return $this->name;
		}
}
?>