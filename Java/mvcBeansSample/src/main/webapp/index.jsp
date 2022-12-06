<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/showController"
		method="get">
		<select name="show">
			<option disabled selected>-- Select an option --</option>
			<option value="dog">Dog</option>
			<option value="cat">Cat</option>
		</select> <input type="submit" value="Submit" />
	</form>
</body>
</html>