<%@page import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="edu.pk.carservice.session.SessionKeysConstants"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>
		Witaj <% out.println(SecurityContextHolder.getContext().getAuthentication().getName()); %>
	</h1>
</body>
</html>