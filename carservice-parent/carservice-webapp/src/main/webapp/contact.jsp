<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>About us/Contact</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="styles/style-contact.css" type="text/css" media="screen" />
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
			<li class="current"><a href="contact.html">About us/Contact</a></li>
			<li><a href="rates.html">Rates</a></li>
			<li><a href="prices.html">Our services/Prices</a></li>
			<li><a href="#">Log in</a></li>
		</ul>
	</nav>
	
	<section id="content">
		<h2>About us/Contact</h2>
		<p id="aboutUs"><s:property value="workshopModel.description"/></p>
		
		<iframe id="map" src="<s:property value="googleMapsUrl" />"></iframe>
		
		<p>
			<img src="images/house.png" style="float:left;margin-right:15px;" alt="House icon" />
			<s:property value="inlineFormattedAddress" />
		</p>
		<p>
			<img src="images/phone.png" style="float:left;margin-right:15px;" alt="Phone icon" />
			<a href="calto:<s:property value="workshopModel.phoneNumber"/>">
			<s:property value="workshopModel.phoneNumber" /></a>
		</p>
		<form id="sendMessageForm">
			<fieldset>
				<h3>Send us a message:</h3>
				<ol>
					<li>
						<label for=name>Name:</label>
						<input id=name name=name type=text placeholder="First and last name" required autofocus>
					</li>
					<li>
						<label for=email>E-mail:</label>
						<input id=email name=email type=email placeholder="example@domain.com" required>
					</li>
					<li>
						<label for=subject>Subject:</label>
						<input id=subject name=subject type=text placeholder="Subject...">
					</li>
					<li>
						<label for=message>Message:</label>
						<textarea id=message name=message rows=5 placeholder="Your message..." required></textarea>
					</li>
				</ol>
				<button type=submit>Send message</button>
			</fieldset>
		</form>
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