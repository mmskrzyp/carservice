<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>About us/Contact</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
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
			<li><a href="index.html">Home Page</a></li>
			<li><a href="contact.html">About us/Contact</a></li>
			<li><a href="rates.html">Rates</a></li>
			<li><a href="prices.html">Our services/Prices</a></li>
			<li><a href="#">Log in</a></li>
		</ul>
	</nav>
	
	<section id="content">
		<h2>Registration</h2>
		<s:form action="Registration">
			<fieldset>
				<a id="error_message"><s:property value="errorMessage" /></a>
				<h3>Fill in order to register (fields marked with * are required):</h3>
				<ol>
					<li>
						<label for=userToRegister.name>Name: *</label>
						<s:textfield name="userToRegister.name" placeholder="First name" required="" autofocus="" />
					</li>
					<li>
						<label for=userToRegister.surname>Surname: *</label>
						<s:textfield name="userToRegister.surname" placeholder="Surname" required="" />
					</li>
					<li>
						<label for=userToRegister.pesel>PESEL:</label>
						<s:textfield name="userToRegister.pesel" placeholder="PESEL" required="" />
					</li>
					<li>
						<label for=userToRegister.nip>NIP:</label>
						<s:textfield name="userToRegister.nip" placeholder="NIP" />
					</li>
					<li>
						<label for=userToRegister.phone>Phone number: *</label>
						<s:textfield name="userToRegister.phone" placeholder="Phone number"/>
					</li>
					<li>
						<label for=userToRegister.email>E-mail:</label>
						<s:textfield name="userToRegister.email" placeholder="example@domain.com" required="" />
					</li>
					<fieldset id=addressForm>
					<legend>Address</legend>
					<li>
						<label for=address.country>Country:</label>
						<s:textfield name="address.country" placeholder="e.g United States" required="" />
					</li>
					<li>
						<label for=address.city>City: *</label>
						<s:textfield name="address.city" placeholder="e.g New York" required="" />
					</li>
					<li>
						<label for=address.postalCode>Postal code: *</label>
						<s:textfield name="address.postalCode" placeholder="Postal code" required="" />
					</li>
					<li>
						<label for=address.street>Street:</label>
						<s:textfield name="address.street" placeholder="Street" required="" />					</li>
					<li>
						<label for=address.houseNumber>House number: *</label>
						<s:textfield name="address.houseNumber" placeholder="House number" required="" />
					</li>
					<li>
						<label for=address.apartmentNumber>Flat number:</label>
						<s:textfield name="address.apartmentNumber" placeholder="Apartment Number" />
					</li>
					</fieldset>
					<li>
						<label for=userToRegister.login>Login: *</label>
						<s:textfield name="userToRegister.login" placeholder="Login" required="" />
					</li>
					<li>
						<label for=userToRegister.password>Password: *</label>
						<s:textfield name="userToRegister.password" placeholder="Password" required="" />	
					</li>
					<li>
						<label for=userToRegister.password>Repeat password: *</label>
						<s:textfield name="userToRegister.password" placeholder="Password" required="" />							
					</li>
				</ol>
				<s:submit />
			</fieldset>
		</s:form>
	</section>
	
	<footer>
		<nav id="footerNavigation">
			<ul>
				<li><a href="index.html">Home Page</a></li>
				<li><a href="contact.html">About us/Contact</a></li>
				<li><a href="rates.html">Rates</a></li>
				<li><a href="prices.html">Our services/Prices</a></li>
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