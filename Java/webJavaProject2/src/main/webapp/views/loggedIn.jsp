<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="model.Bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logged in</title>
</head>
<body>
	

	<%
	if (session.getAttribute("isLoggedIn") != null) {
		Bean user = (Bean)session.getAttribute("isLoggedIn");
		out.print("<h1>Welcome " + user.getUsername() + " to your profile!</h1>");
		%>
		
		<form action="<%=request.getContextPath() %>/views/loggedIn.jsp" name="favoriteThing" method="get">
			<input type="text" name="thing" placeholder="Favorite thing to do?" /> 
			<input type="submit" value="Send">
		</form>
		
		<%
		if (request.getParameter("thing") != null) {
			out.print("Your favorite thing to do is " + request.getParameter("thing"));
		}%>
		
		<br>
		
		<%
		out.print("<form action=\"" + request.getContextPath() + "/EndSessionServlet\" method=\"POST\">");
		out.print("<input type=\"submit\" value=\"Remove Session\" />");
		out.print("</form>");
	} else {
		out.print("<h1>Error</h1>");
		response.sendRedirect("../index.jsp");
	}
	%>
	
	<%
	response.setHeader("cache-control", "no-store");
	%>
</body>
</html>