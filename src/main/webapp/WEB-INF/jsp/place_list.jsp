<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul> 
		<c:forEach var="par" items="${places}" var="p">

           <li>${p.id}</li>
			<li>${p.name}</li>
			<li>${p.type}</li>
			<li>${p.location}</li>
			<li>${p.url}</li>
			<li>${p.city.name}</li>

        </c:forEach>
			
		</ul>
</body>
</html>