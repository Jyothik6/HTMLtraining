<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String user=(String)request.getAttribute("user");



%>
<h3>welcome</h3>
<h3>${user}</h3>
</body>
</html>