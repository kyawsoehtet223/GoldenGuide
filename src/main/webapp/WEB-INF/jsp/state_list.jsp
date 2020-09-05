<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul> 
		<c:forEach var="par" items="${states}" var="s">

           <li>${s.id}</li>
			<li>${s.name}</li>

        </c:forEach>
			
		</ul>
	
	</div>

</body>
</html>