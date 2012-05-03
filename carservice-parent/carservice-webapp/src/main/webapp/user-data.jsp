<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>User data</title>
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
			<li><a href="user-repairs.html">Repairs</a></li>
			<li><a href="user-help.html">Help</a></li>
		</ul>
	</nav>
	
	<section id="content" class="protected">
		<h2><s:property value="userNames"/></h2>
		<p>Cupcake ipsum dolor sit amet wypas topping halvah liquorice. Topping danish croissant tart powder. Marzipan jelly-o oat cake ice cream I love icing marshmallow tiramisu carrot cake. Caramels chocolate bar chocolate jujubes I love. Cheesecake fruitcake fruitcake souffle jelly beans. Bear claw cupcake chocolate bar gingerbread dessert carrot cake tart jujubes. Muffin cheesecake macaroon candy oat cake lemon drops cotton candy. Wafer sweet jujubes souffle apple pie. Gummi bears macaroon sweet carrot cake caramels chocolate bar sweet. Pie toffee bear claw danish chocolate.</p>
		<table>
			<tr>
				<td class="fieldValue" colspan=2><s:property value="user.name"/> <s:property value="user.surname"/></td>
			</tr>
			<tr>
				<td class="fieldName">e-mail:</td><td class="fieldValue"><s:property value="user.email"/></td>
			</tr>
			<tr>
				<td class="fieldName">phone:</td><td class="fieldValue"><s:property value="user.phone"/></td>
			</tr>
			<tr>
				<td class="fieldName">address:</td><td class="fieldValue"><s:property value="inlineFormattedAddress"/></td>
			</tr>
		</table>
		<div id="cars">
			<h3>Cars:</h3>
			<table>
				<tr>
					<th>Car</th>
					<th>Year</th>
					<th>Registration number</th>
				</tr>
				<s:iterator value="allUserCars">
					<tr>
						<td><s:property value="brand"/> <s:property value="model"/></td>
						<td><s:property value="productionYear"/></td>
						<td><s:property value="regNumber"/></td>
					</tr>
				</s:iterator>
			</table>
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