<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
if (request.getProtocol().equals("HTTP/1.1"))
	response.setHeader("Cache-Control", "no-cache");
int turn = 1;
%>
<html>
<head>
<meta charset="UTF-8">
<title>대전</title>
<link rel="stylesheet" href="../style/battlepage.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div class="myturn"></div>
		<div class="battlebar"></div>
		<div class="playerline"></div>
		<div class="turn"></div>
		<div><button class="mytop" value=""></button></div>
		<div><button class="mymid" value=""></button></div>
		<div><button class="mybot" value=""></button></div>
		<div><button class="mynextower" value=""></button></div>
		<div><button class="mynex" value=""></button></div>
		<div><button class="emytop" value=""></button></div>
		<div><button class="emymid" value=""></button></div>
		<div><button class="emybot" value=""></button></div>
		<div><button class="emynextower" value=""></button></div>
		<div><button class="emynex" value=""></button></div>
	<div><p class=messege></div>
	</div>
	
</body>
</html>