<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>User repairs</title>
<link rel="stylesheet" href="styles/style.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="styles/style-protected.css" type="text/css"
	media="screen" />
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
			<li><a href="UserData.action">User data</a></li>
			<li class="current"><a href="UserRepairs.action">Repairs</a></li>
			<li><a href="user-help.html">Help</a></li>
		</ul>
	</nav>

	<section id="content" class="protected">
		<h2>
			<s:property value="userNames" />
		</h2>
		<s:iterator value="allUserCars">
			<table>
				<h3>
					<s:property value="brand" />
					<s:property value="model" />
				</h3>
				<tr>
					<th>Service</th>
					<th>Date</th>
				</tr>
				<tr>
					<td><s:property value="productionYear" /></td>
					<td><s:property value="regNumber" /></td>
				</tr>
			</table>
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