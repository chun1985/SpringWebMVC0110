<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Start</title>
</head>
<body>
<br><h1>Spring Start</h1>   
<p><form action = "Start.jsp" method = "post">
<input type="radio" name ="spring" value="1" checked >hello<br>
<input type="radio" name ="spring" value="2-1">path1&nbsp;
<input type="radio" name ="spring" value="2-2">path2<br>
<input type="radio" name ="spring" value="3">body<p>
<input type = "submit" value = "submit">
</form><p>
<form action = "user" method = "get">
parameter<br>
user name:&nbsp;<input type = "text" name = "name" size = "5">
<input type = "submit" value = "submit">
</form>
<%
String spring = request.getParameter("spring");
if("1".equals(spring)){%>
	<jsp:forward page="/hello"></jsp:forward>
<%}else if("2-1".equals(spring)){%>
	<jsp:forward page="web/fe/default/en/document/8080/spring-mvc-for-beginners"></jsp:forward>
<%}else if("2-2".equals(spring)){%>
    <jsp:forward page="web/fe/default/tw/document/8080/spring-mvc"></jsp:forward>
<%}else if("3".equals(spring)){%>
	<jsp:forward page="saveResult"></jsp:forward>
<%}%>
</body>
</html>