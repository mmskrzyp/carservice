<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>
	Witaj <% out.println(session.getAttribute("login")); %>
	</h1>
</body>
</html>