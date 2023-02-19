<?php
	include 'class.autoload.inc.php';	

  ?>

  <!DOCTYPE html>
  <html>
  <head>
  	<title></title>
  </head>
  <body>
  	<form>
  		<form class="modal-content animate" action="includes/print.inc.php" method="post">
			  	<h1 class="log_reg">Login</h1>
			    <div class="container">
			      <input type="text" name="name" placeholder="Username" required>
			      <input type="password" name="pass" placeholder="Password" required>
			      <button class="loginBtn" action="includes/print.inc.php" type="submit">Login</button>    
			    </div>
			  </form>
  	</form>
  
  </body>
  </html>