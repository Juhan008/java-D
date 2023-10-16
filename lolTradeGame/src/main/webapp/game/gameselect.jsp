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
<link rel="stylesheet" href="../css/gameselect.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div class="menu">
			<div class="main">
				<button id="main" value="default"
					onclick="location.href='/lolTradeGame/game/main.jsp'">홈</button>
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
				<div class="money">0000원</div>
			</div>
		</div>
		<div class="domestic">
			<button id="shop" value="default"
				onclick="location.href='/lolTradeGame/game/gamelobby.jsp'">지역
				대회</button>
		</div>
		<div class="international">
			<button id="shop" value="default"
				onclick="location.href='/lolTradeGame/game/gamelobby.jsp'">세계
				대회</button>
		</div> 
		<div class="selectIocon"></div>
	</div>
</body>
</html>