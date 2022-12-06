<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward</title>
</head>
<body style="background-color: white;">
	<h1>You are stuck on a forwarding page, please go back and try
		again.</h1>

	<% if (request.getParameter("page").equals("red")) {%>
	<jsp:forward page="./Red.jsp" />
	<%}%>

	<%if (request.getParameter("page").equals("blue")) {%>
	<jsp:forward page="./Blue.jsp" />
	<%}%>

	<%if (request.getParameter("page").equals("pink")) {%>
	<jsp:forward page="./Pink.jsp" />
	<%}%>

	<jsp:forward page="./Main.jsp" />
</body>
</html>