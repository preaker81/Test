<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body style="background-color: white;">
	<jsp:include page="./Header.jsp"></jsp:include>

	<h1>Application Form</h1>

	<form action="./Forward.jsp" method="post">

		<label for="firstname">First Name</label>
		<br>
		<input type="text" name="firstName" />
		<br>
		<label for="lastName">Last Name</label>
		<br>
		<input type="text" name="lastName" />
		<br>
		<select name="page">
			<option value="red">Red Background</option>
			<option value="blue">Blue Background</option>
			<option value="pink">Pink Background</option>
		</select>
		<br>
		<input type="submit" value="Send" />
		<br>
	</form>

	<jsp:include page="./Footer.jsp"></jsp:include>
</body>
</html>