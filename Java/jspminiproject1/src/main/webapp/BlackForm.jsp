<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:black;">
<jsp:include page="./Header.jsp"></jsp:include>

<p>
	My name is
	<%=request.getParameter("firstName")%>
	<%=request.getParameter("lastName")%></p>

<jsp:include page="./Footer.jsp"></jsp:include>
</body>
</html>