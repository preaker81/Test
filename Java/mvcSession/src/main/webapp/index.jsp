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
if (session.getAttribute("isLoggedIn") != null){
	response.sendRedirect("profile.jsp");
}
%>
<form action="<%=request.getContextPath() %>/SessionServlet" method="POST">
<input type="submit" value="Create a session"/>
</form>
</body>
</html>