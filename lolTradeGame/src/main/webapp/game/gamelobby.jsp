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
<title>게임대기실</title>
<link rel="stylesheet" href="../css/gamelobby.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div class="money">0000원</div>
		<div class="menu">
			<div class="gamestart">
				<button id="gamestart" value="default"
					onclick="location.href='/lolTradeGame/game/gameselect.jsp'">게임시작</button>
			</div>
			<div class="myinfo">
				<button id="myinfo" value="default"
					onclick="location.href='/lolTradeGame/game/myinfo.jsp'">내정보</button>
			</div>
			<div class="collection">
				<button id="collection" value="default"
					onclick="location.href='/lolTradeGame/game/collection.jsp'">가방</button>
			</div>
			<div class="shop">
				<button id="shop" value="default"
					onclick="location.href='/lolTradeGame/game/shop.jsp'">상점</button>
			</div>
		</div>
	</div>
</body>
</html>