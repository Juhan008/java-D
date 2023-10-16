<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
if (request.getProtocol().equals("HTTP/1.1"))
	response.setHeader("Cache-Control", "no-cache");
%>
<html>
<head>
<meta charset="UTF-8">
<title>대전</title>
<link rel="stylesheet" href="../css/battlepage.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div><button class="myturn"></button></div>
		<div><button class="battlebar"></button></div>
		<div><button class="playerline"></button></div>
		<div><button class="mytop"></button></div>
		<div><button class="mymid"></button></div>
		<div><button class="mybot"></button></div>
		<div><button class="mynextower"></button></div>
		<div><button class="mynex"></button></div>
		<div><button class="emytop"></button></div>
		<div><button class="emymid"></button></div>
		<div><button class="emybot"></button></div>
		<div><button class="emynextower"></button></div>
		<div><button class="emynex"></button></div>
		
	</div>
</body>
</html>