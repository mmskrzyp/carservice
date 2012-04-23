<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Home Page</title>
	<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="style-mobile.css" type="text/css" media="handheld" />
</head>
<body>	
	<section id="content">
		<div id="companysLogo">
			<h1>Header, logo etc.</h1>
		</div>
		<article id="boxLogin" class="box">
			<s:form action="Welcome" id="sendMessageForm">
				<fieldset>
					<ol>
						<li>
							<label for=name>Login:</label>
							<s:textfield name="userName" placeholder="Login..." required="" autofocus=""/>
						</li>
						<li>
							<label for=password>Password:</label>
							<s:textfield name="password" type="password" placeholder="Password..." required="" />
						</li>
					</ol>
					<s:submit id="submit_login" />
					<br/>
					<a href="#">Forgot password?</a>
					&nbsp;||&nbsp;
					<a href="#">Register</a>
				</fieldset>
			</s:form>
		</article>
		<article id="boxContact" class="box">
			<a href="contact.html">About us/Contact</a>
		</article>
		<article id="boxPrices" class="box">
			<a href="prices.html">Our services/Prices</a>
		</article>
		<article id="boxRates" class="box">
			<a href="rates.html">Rates</a>
		</article>
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