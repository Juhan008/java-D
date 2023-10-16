<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
if (request.getProtocol().equals("HTTP/1.1"))
	response.setHeader("Cache-Control", "no-cache");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임 로그인</title>
<link rel="stylesheet" href="../css/login.css">
</head>
<body>
<div class="bg">
			<form action="main.jsp" method="post">
			    <p><input class="id" type="text" id="username" name="username" required value="아이디"></p>
			    <p><input class="password"type="password" id="password" name="password"  required value="비밀번호"></p>
			    <p><input class="submit" type="submit" value=""></p>
			    <%--=response.sendRedirect("main.jsp") --%>
			</form>
			
</div>
</body>
</html>