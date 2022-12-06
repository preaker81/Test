<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Them Cookies</title>
</head>
<body>
	<h1>Cookiemonster</h1>
	<h1>Your name is ${cookie["firstName"].getValue()}
		${cookie["lastName"].getValue()}</h1>
</body>
</html>