<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Bean Parameter</title>
</head>
<body>
	<h1>Test Bean Parameter</h1>
	<jsp:useBean id='person' type='example.PersonBean'
		class='example.EmployeeBean' />
	<!--We know we can do it with a combination of standart action and scripting: -->
	<%
		person.setFirstName(request.getParameter("userName"));
	%>
	<jsp:getProperty name='person' property='firstName' />
	<!-- We can even do it with scripting INSIDE a standart action: -->
	<jsp:setProperty name='person' property='lastName'
		value='<%=request.getParameter("lName")%>' />
	<!-- Now we use scriplet to show :-->
	<%=person.getLastName()%>
	<hr>
	<h2>Same this we can do in easier way using param attribute:</h2>
	<jsp:setProperty name='person' property='startYear' param='year' />
	<h3>
		<jsp:getProperty name='person' property='startYear' />
	</h3>
</body>
</html>