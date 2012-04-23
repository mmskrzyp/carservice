<%@page import="edu.pk.carservice.session.SessionKeysConstants"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>
		Witaj <% out.println(session.getAttribute(SessionKeysConstants.LOGIN)); %>
	</h1>
</body>
</html>