<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookies</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/CookieServlet" method="post">
		<input type="text" name="firstName" placeholder="First Name" />
		<input type="text" name="lastName" placeholder="Last Name" />
		<input type="submit" value="Send" />
		<br>
	</form>
</body>
</html>