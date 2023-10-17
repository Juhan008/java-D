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
<title>메뉴바</title>
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/menubar.css">
<script src="../script/main.js"></script>
</head>
<body>
<div id="menubar">
<div class="stick"></div>
<div class="bg">
<div class="meunbar">
		<div class="money">0000원</div>
			<button class="gamestart" id="gamestart" value=""
				onclick="location.href='/lolTradeGame/game/gameselect.jsp'">
			</button>

			<button class="home" id="home" value=""
				onclick="location.href='/lolTradeGame/game/main.jsp'"></button>
		
		
			<button class="myinfo" id="myinfo" value=""
				onclick="location.href='/lolTradeGame/game/myinfo.jsp'"></button>
		
		
			<button class="collection" id="collection" value=""
				onclick="location.href='/lolTradeGame/game/collection.jsp'"></button>
		
	
			<button class="shop" id="shop" value=""
				onclick="location.href='/lolTradeGame/game/shop.jsp'"></button>
		</div>
	</div>
	</div>
</body>
</html>