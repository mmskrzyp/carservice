<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>User repairs</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="styles/style-protected.css" type="text/css" media="screen" />
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
			<li><a href="#">Log out</a></li>
		</ul>
	</nav>
	
	<section id="content">
		<h2><s:property value="user.name"/> <s:property value="user.surname"/></h2>
		<p>dashboard</p>
		<div class="dashboardAction">
			<h3><a href="user-data.html">My Profile</a></h3>
		</div>
		<div class="dashboardAction">
			<h3><a href="user-repairs.html">My Repairs</a></h3>
		</div>
		<div class="dashboardAction">
			<h3><a href="user-help.html">Help</a></h3>
		</div>
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