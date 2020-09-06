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
		<c:forEach var="par" items="${restaurant}" var="r">

           <li>${r.id}</li>
			<li>${r.name}</li>
			<li>${r.type}</li>
			<li>${r.location}</li>
			<li>${r.city.name}</li>

        </c:forEach>
			
		</ul>
</body>
</html>