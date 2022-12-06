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
if(session.getAttribute("isLoggedIn") != null){
	out.print("<h1>Welcome to your profile!!</h1>");
	out.print("<form action=\"" + request.getContextPath() + "/RemoveSessionServlet\" method=\"POST\">");
	out.print("<input type=\"submit\" value=\"Remove Session\" />");
	out.print("</form>");
}else{
	out.print("<h1>Error</h1>");
	response.sendRedirect("index.jsp");
}
%>

</body>
</html>