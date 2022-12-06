<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showImage</title>
</head>
<body>
	<%
	String imageFileName = request.getParameter("image");
	out.print("<img src=\"" + imageFileName + "\"/>");
	%>

</body>
</html>