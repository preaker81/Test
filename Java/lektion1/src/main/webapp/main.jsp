<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lektion 1</title>
</head>
<body>


	<%!String name = "Grit";%>
	<%!int day = 1;%>
	<%!String textColor = "red";%>

	<h1 style="color:<%=textColor%>">
		Hello
		<%=name%></h1>
	<%
	if (day == 1 || day == 7) {
	%>
	<p>Today is weekend</p>
	<%
	}
	%>

	<p>
		<%
		switch (day) {
		case 1:
			out.println("Today is weekend");
			break;
		}
		%>
	</p>

<jsp:include page="./JSPinclude.jsp"></jsp:include>

	<form action="anotherJSPPage.jsp" method="POST">
		<input type="text" name="name" />
		<input type="submit" value="Skicka" />
	</form>
	
	<a href="./anotherJSPPage.jsp">Click me</a>
	
	<jsp:element name="a">
		<jsp:attribute name="href">./anotherJSPPage.jsp</jsp:attribute>
		<jsp:body>Click me</jsp:body>
	</jsp:element>
</body>

</html>