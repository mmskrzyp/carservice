<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<s:form action="Welcome">
		<s:textfield name="userName" label="User Name"/>
		<s:submit />
	</s:form>
</body>
</html>