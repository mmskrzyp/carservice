<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>User data</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="styles/style-protected.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="styles/style-registration.css" type="text/css" media="screen" />
</head>
<body>
	<header>
		<div id="companysLogo">
			<h1>Header, logo etc.</h1>
		</div>
	</header>
	
	<nav id="mainNavigation">
		<ul>  
			<li><a href="Index.action">Home Page</a></li>
			<li><a href="Contact.action">About us/Contact</a></li>
			<li><a href="Rates.action">Rates</a></li>
			<li><a href="Prices.action">Our services/Prices</a></li>
			<li><a href="#">Log out</a></li>
		</ul>
	</nav>
	
	<nav id="protectedNavigation">
		<ul>  
			<li class="current"><a href="UserData.action">User data</a></li>
			<li><a href="UserRepairs.action">Repairs</a></li>
			<li><a href="user-help.html">Help</a></li>
		</ul>
	</nav>
	
	<section id="content" class="protected">
		<h2>Add new car</h2>
		<s:form action="AddCar">
			<fieldset>
				<a id="error_message"><s:property value="errorMessage" /></a>
				<h3>Fill in order to add a new car (fields marked with * are required):</h3>
				<ol>
					<li>
						<label for=carData.brand>Brand: *</label>
						<s:textfield name="carData.brand" placeholder="Brand" required="" autofocus="" />
					</li>
					<li>
						<label for=carData.model>Model: *</label>
						<s:textfield name="carData.model" placeholder="Model" required="" />
					</li>
					<li>
						<label for=carData.productionYear>Production year: *</label>
						<s:textfield name="carData.productionYear" placeholder="Production year" required="" />
					</li>
					<li>
						<label for=carData.engine>Engine:</label>
						<s:textfield name="carData.engine" placeholder="Engine" />
					</li>
					<li>
						<label for=carData.mileage>Mileage:</label>
						<s:textfield name="carData.mileage" placeholder="Mileage"/>
					</li>
					<li>
						<label for=carData.regNumber>Registration number: *</label>
						<s:textfield name="carData.regNumber" placeholder="Registration number" required="" />
					</li>
					<li>
						<label for=carData.chassisNumber>Chassis number: *</label>
						<s:textfield name="carData.chassisNumber" placeholder="Chassis number" required="" />
					</li>
				</ol>
				<s:submit />
			</fieldset>
		</s:form>
	</section>
	
	<footer>
		<nav id="footerNavigation">
			<ul>
				<li><a href="Index.action">Home Page</a></li>
				<li><a href="Contact.action">About us/Contact</a></li>
				<li><a href="Rates.action">Rates</a></li>
				<li><a href="Prices.action">Our services/Prices</a></li>
			</ul>
		</nav>
		<nav id="socialFeedsNavigation">
			<ul>
				<li id="mail"><a href="#">e-mail</a></li>
				<li id="rss"><a href="#">RSS</a></li>
				<li id="twit"><a href="#">Twitter</a></li>
				<li id="g"><a href="">Google+</a></li>
				<li id="fb"><a href="#">Facebook</a></li>
				<li id="li"><a href="#">LinkedIn</a></li>
			</ul>
		</nav>
		<img src="#" alt="CarService Engin Logo" id="carServiceEnginLogo" />
	</footer>
</body>
</html>