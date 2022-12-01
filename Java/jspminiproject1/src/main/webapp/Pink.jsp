<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=request.getParameter("page")%></title>
</head>
<body style="background-color: <%=request.getParameter("page")%>">
	<jsp:include page="./Header.jsp"></jsp:include>

	<p>
		My name is
		<%=request.getParameter("firstName")%>
		<%=request.getParameter("lastName")%>
		and this is a
		<%=request.getParameter("page")%>
		page.
		</p>

	<jsp:include page="./Footer.jsp"></jsp:include>
</body>
</html>