<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="model.ImageBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showImage</title>
</head>
<body>
	<%
	ImageBean imageBean = (ImageBean) request.getAttribute("ImageBean");
	out.println("<h1>" + imageBean.getWhatToShow() + "</h1>");
	out.print("<img src=\" " + imageBean.getWhatToShow() + "\"/>");
	%>

</body>
</html>