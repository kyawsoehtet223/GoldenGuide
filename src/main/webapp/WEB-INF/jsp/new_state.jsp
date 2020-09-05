<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="addState.htm" method="POST" modelAttribute="State">
	State Name: <form:input path="name" /><form:errors path="name" cssClass="error"></form:errors> <br>
	
<input type="submit" value="Add" />
</form:form>
</body>
</html>