<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Rates</title>
	<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="styles/style-rates.css" type="text/css" media="screen" />
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
			<li class="current"><a href="Rates.action">Rates</a></li>
			<li><a href="Prices.action">Our services/Prices</a></li>
			<li><a href="#">Log in</a></li>
		</ul>
	</nav>
	
	<section id="content">
		<h2>Rates</h2>
		<!-- 
		<s:iterator value="allRatings" status="rating">
			<article class="rate">
				<img src="#" alt="Rating Bar" />
				<p class="rateRating"><s:property value="rating"/></p>
				<p class="rateContent"><s:property value="comment"/></p>
				<p class="rateAuthor">Gorilla Monkey</p>
			</article>
		</s:iterator>
		-->
		
		<s:iterator value="allData" status="container">
			<article class="rate">
				<img src="#" alt="Rating Bar" />
				<p class="rateRating"><s:property value="rating.rating"/></p>
				<p class="rateContent"><s:property value="rating.comment"/></p>
				<p class="rateContent"><s:property value="service.name"/></p>
				<p class="rateAuthor"><s:property value="user.name"/> <s:property value="user.surname"/></p>
			</article>
		</s:iterator>
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