<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Home Page</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="styles/style-index.css" type="text/css" media="screen" />
	
</head>
<body>	
	<section id="content">
		<div id="companysLogo">
			<h1>Header, logo etc.</h1>
		</div>
		<article id="boxLogin" class="box">
			<form name="f" action="j_spring_security_check" method="POST">
				<fieldset>
					<ol>
						<li>
							<label for="j_username">Login:</label>
							<input name="j_username" placeholder="Login...." required autofocus />
						</li>
						<li>
							<label for="j_password">Password:</label>
							<input name="j_password" type="password" placeholder="Password..." required />
						</li>
					</ol>
					<input type="submit" name="login" value="Login">
					<br/>
					<a href="#">Forgot password?</a>
					&nbsp;||&nbsp;
					<a href="registration.jsp">Register</a>
				</fieldset>
			</form>
		</article>
		<article id="boxContact" class="box">
			<a href="contact.html">About us/Contact</a>
		</article>
		<article id="boxPrices" class="box">
			<a href="Prices.action">Our services/Prices</a>
		</article>
		<article id="boxRates" class="box">
			<a href="rates.html">Rates</a>
		</article>
	</section>
	
	<footer>
		<nav id="footerNavigation">
			<ul>
				<li><a href="index.html">Home Page</a></li>
				<li><a href="Contact.action">About us/Contact</a></li>
				<li><a href="rates.html">Rates</a></li>
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