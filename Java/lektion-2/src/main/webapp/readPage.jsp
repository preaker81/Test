<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String fname = request.getParameter("fname");
	out.print("<p>" + fname + "</p>");

	String option = request.getParameter("stuff");
	out.print("<p>Your selected option is:" + option + "</p>");
	%>
</body>
</html>