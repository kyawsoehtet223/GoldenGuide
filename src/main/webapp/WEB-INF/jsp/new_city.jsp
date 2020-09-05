<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add New City</h3>
	<form:form action="addCity.htm" method="POST" modelAttribute="City" enctype="multipart/form-data">
	City Name: <form:input path="name" /><form:errors path="name" cssClass="error"></form:errors> <br>
	Description: <form:input path="description" /> </br>
	Select Image Url: <input type="file" name="file"/>  
    <input type="submit" value="Upload File"/> </br>
	<label for="state">State:</label>
    	<!-- <div class="form-group"> -->
     	<select name="state_id">
		<c:forEach items="${states }" var="s">
			<option value="${s.id }">${s.name }</option>
		</c:forEach>
	</select>

<input type="submit" value="Add" />
</form:form>
</body>
</html>