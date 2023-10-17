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
<title>내정보</title>
<link rel="stylesheet" href="../css/myinfo.css">
<script src="../script/main.js"></script>
</head>
<body>
	<div class="bg">
		<div class="myfag" value=""></div>
		<div class="menu"></div>
		<div class="money">0000원</div>
		<div>
			<button class="gamestart" id="gamestart" value=""
				onclick="location.href='/lolTradeGame/game/gameselect.jsp'">
			</button>
		</div>
		<div>
			<button class="home" id="home" value=""
				onclick="location.href='/lolTradeGame/game/main.jsp'"></button>
		</div>
		<div>
			<button class="myinfo" id="myinfo" value=""
				onclick="location.href='/lolTradeGame/game/myinfo.jsp'"></button>
		</div>
		<div>
			<button class="collection" id="collection" value=""
				onclick="location.href='/lolTradeGame/game/collection.jsp'"></button>
		</div>
		<div>
			<button class="shop" id="shop" value=""
				onclick="location.href='/lolTradeGame/game/shop.jsp'"></button>
		</div>

		<div class="recode" value="">
			<%
			for (int i = 1; i <= 20; i++) {
			%>
			<div class="recodesc" value="">
				<p>
					<%=i%></p>
			</div>
			<%
			}
			%>
		</div>
	</div>
</body>
</html>