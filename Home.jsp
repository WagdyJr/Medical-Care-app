<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="CSS/styles.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Home</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<nav class="navbar navbar-expand-sm navbar-dark fixed-top bg-dark">
			  <a class="navbar-brand" href="#">Hospital Name</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>

			  <div class="collapse navbar-collapse" id="navbarsExample02">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#about">About Us</a>
		      </li>
		       <li class="nav-item">
		        <a class="nav-link" href="#contact">Contact Us</a>
		      </li>
		       <li class="nav-item">
		        <a class="nav-link" href="#">Blog</a>
		      </li>
		    </ul>
		  </div>
			<div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Sign in</button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			    <a class="dropdown-item" href="#" onclick="document.getElementById('signin').style.display='block'" style="width:auto;">Doctor</a>
			    <a class="dropdown-item" href="#" onclick="document.getElementById('signin').style.display='block'" style="width:auto;">Patient</a>
			  </div>
			</div>
			<div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle btn1" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Signup</button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			     <a class="dropdown-item" href="#" onclick="document.getElementById('docsignup').style.display='block'" style="width:auto;">Doctor</a>
			     <a class="dropdown-item" href="#" onclick="document.getElementById('patsignup').style.display='block'" style="width:auto;">Patient</a>
			  </div>
			</div>
			<!-- login form -->
			<div id="signin" class="modal">
			  <form class="modal-content animate" action="/action_page.php" method="post">
			    <div class="container">
			      <input type="text" placeholder="Username" required>
			      <input type="password" placeholder="Password" required>
			      <button class="loginBtn" type="submit">Login</button>    
			    </div>
			  </form>
			</div>
			<!-- end of form -->
			<div id="patsignup" class="modal">
	<form class="modal-content animate" action="/action_page.php" method="post">
      <div class="container">
      <input type="text" placeholder="First Name" required>
      <input type="text" placeholder="Last Name" required>
      <input type="email" placeholder="Email" required>
      <input type="password" placeholder="Password" required>
      <input type="password" placeholder="Confirm Password" required>
      <input type="text" placeholder="Phone Number" required>
      <input type="text" placeholder="Reigon" required>
      <input type="text" placeholder="Country" required>
      <input type="text" placeholder="Street" required>
      <button class="loginBtn" type="submit">Signup</button>    
    </div>
  </form>
</div>

<div id="docsignup" class="modal">
	<form class="modal-content animate" action="/action_page.php" method="post">
      <div class="container">
      <input type="text" placeholder="First Name" required>
      <input type="text" placeholder="Last Name" required>
      <input type="email" placeholder="Email" required>
      <input type="password" placeholder="Password" required>
      <input type="password" placeholder="Confirm Password" required>
      <input type="text" placeholder="Phone Number" required>
      <input type="text" placeholder="Department" required>
      <button class="loginBtn" type="submit">Signup</button>    
    </div>
  </form>
</div>
		</nav>
	</div><br>

	<div class="row">
		<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="Images/1.png" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="Images/2.png" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="Images/3.png" class="d-block w-100" alt="...">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	</div><br><hr>
</div>

<div class="container">
	<div class="row about">
		<div id="about">
		<h1 class="log">About Us</h1><br>
		<p>SevenHills Group has over two decades of experience in the healthcare sector, and is known for providing quality healthcare and valuable experience to all domestic and international patients. Our healthcare offerings are supported by a team of compassionate and dedicated medical professionals who have rich knowledge and experience in their respective domains.</p>
		</div>
	</div><hr><br>
	<div class="goal_vision">
		<div class="row">
			<div class="row">
				<div class="col-md-4">
					<h2>OUR VISION</h2>
					<p>Our Vision is to lead the healthcare industry in the Middle East effectively towards global standards</p>
				</div>
				<div class="col-md-2">
					<a href=""><img class="icon" src="https://img.icons8.com/ios/64/000000/visible.png"></a>
				</div>
				<div class="col-md-2">
					<a href=""><img class="icon" src="https://img.icons8.com/windows/64/000000/rocket.png"></a>
				</div>
				<div class="col-md-4">
					<h2>OUR MISSION</h2>
					<p>Our mission is to provide the healthcare industry in the Middle East by products and services of highest quality and latest technologies.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<h2>OBJECTIVES</h2>
					<ul>
						<li>Improve level of clients' satisfaction</li>
						<li>Increase the percentage of international patients </li>
						<li>Increase & sustain growth and establish new branches locally & in other countries</li>
					</ul>
				</div>
				<div class="col-md-2">
					<a href=""><img class="icon" src="https://img.icons8.com/pastel-glyph/64/000000/define-location.png"></a>
				</div>
				<div class="col-md-2">
					<a href=""><img class="icon" src="https://img.icons8.com/material-sharp/48/000000/conference-call.png"></a>
				</div>
				<div class="col-md-4">
					<h2>OUR TEAM</h2>
					<p>It takes a skilled, enthusiastic team to provide the high level of personalized service found at our Hospital. Regardless of their daily role, we believe that, ultimately, every team member contributes to the care and well-being of our patients and visitors.</p>
				</div>
			</div>
		</div><hr>
	</div>

	<div id="contact">
		<div class="row">
			<div class="col-md-4">
				<h8>Tel: 07775000</h8><br>
				<h8>Tel: 54879455</h8><br>
				<h8>FAX: +6594872356</h8><br>
				<h8>EMAIL: 7mada@yahoo.com</h8>
			</div>
			<div class="col-md-4">
				<h8><u>HEAD QUARTER</u></h8><br>
				<h8>hn7ot 3nwan hna</h8>
			</div>
			<div class="col-md-4">
				<h8><u>CONNECT WITH US</u></h8><br>
				<a href="#" class="fa fa-facebook fa2"></a>
				<a href="#" class="fa fa-twitter fa2"></a>
				<a href="#" class="fa fa-google fa2"></a><br>
				<a href="#" class="fa fa-linkedin fa2"></a>
				<a href="#" class="fa fa-youtube fa2"></a>
				<a href="#" class="fa fa-instagram fa2"></a>
			</div>
		</div>
	</div>
</div><br>
<button onclick="topFunction()"  id="myBtn" title="Go to top"><i style="font-size:20px" class="fa">&#xf062;</i></button>
<footer class="footer mt-auto py-3">
  <div class="container">
    <span class="text-muted">7mada © 2019 - 2020</span>
  </div>
</footer>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	<script src="JS/js.js"></script>
</body>
</html>