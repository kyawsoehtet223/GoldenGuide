<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="add_city_images.htm" method="POST" modelAttribute="cityimages" enctype="multipart/form-data">
	Select Image Url: <input type="file" name="file"/>  
    <input type="submit" value="Upload File"/> </br>
	<label>City:</label>
     	<select name="city_id">
		<c:forEach items="${cities }" var="c">
			<option value="${c.id }">${c.name }</option>
		</c:forEach>
	</select>

<input type="submit" value="Add" />
</form:form>
</body>
</html>