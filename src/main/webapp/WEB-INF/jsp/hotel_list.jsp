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
		<c:forEach var="par" items="${hotels}" var="h">

           <li>${h.id}</li>
			<li>${h.name}</li>
			<li>${h.rate}</li>
			<li>${h.location}</li>
			<li>${h.url}</li>
			<li>${h.city.name}</li>

        </c:forEach>
			
		</ul>
</body>
</html>