<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add New Restaurant</h3>
	<form:form action="addRestaurant.htm" method="POST" modelAttribute="Restaurant" enctype="multipart/form-data">
	Restaurant Name: <form:input path="name" /><form:errors path="name" cssClass="error"></form:errors> <br>
	Type: <form:input path="type" /> </br>
	location: <form:input path="location" /> </br>
	Select Image Url: <input type="file" name="file"/>  
    <input type="submit" value="Upload File"/> </br>
	<label for="state">City:</label>
    	<!-- <div class="form-group"> -->
     	<select name="state_id">
		<c:forEach items="${cities }" var="c">
			<option value="${c.id }">${c.name }</option>
		</c:forEach>
	</select>

<input type="submit" value="Add" />
</form:form>
	
</body>
</html>