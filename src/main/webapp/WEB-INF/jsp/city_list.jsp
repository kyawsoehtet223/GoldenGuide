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
	<form:form action="addCity.htm" method="POST" modelAttribute="City" enctype="multipart/form-data">
	
</form:form>
		<ul> 
		<c:forEach var="par" items="${cities}" var="c">

           <li>${c.id}</li>
			<li>${c.name}</li>
			<li>${c.description}</li>
			<li>${c.url}</li>
			<li>${c.state.name}</li>

        </c:forEach>
			
		</ul>
	
	</div>
</body>
</html>