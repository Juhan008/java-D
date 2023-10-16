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
<title>메인</title>
<link rel="stylesheet" href="../css/collection.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div class="money">0000원</div>
		<div class="menu">
			<div class="gamestart">
				<button id="gamestart" value=""
					onclick="location.href='/lolTradeGame/game/gameselect.jsp'"> </button>
			</div>
			<div class="home">
				<button id="home" value=""
					onclick="location.href='/lolTradeGame/game/main.jsp'"></button>
			</div>
			<div class="myinfo">
				<button id="myinfo" value=""
					onclick="location.href='/lolTradeGame/game/myinfo.jsp'"></button>
			</div>
			<div class="collection">
				<button id="collection" value=""
					onclick="location.href='/lolTradeGame/game/collection.jsp'"></button>
			</div>
			<div class="shop">
				<button id="shop" value=""
					onclick="location.href='/lolTradeGame/game/shop.jsp'"></button>
			</div>
		</div>
	</div>
</body>
</html>