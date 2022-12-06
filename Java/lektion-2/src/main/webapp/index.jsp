<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="imageServlet" method="GET">
			<input type="text" name="width" placeholder="Width" /> 
			<input type="text" name="height" placeholder="Height" />
			<input type="submit" name="submit"/>
		</form>
	</div>
	<img width="300px" height="300px" src="./images/img1.jpg">
</body>
</html>