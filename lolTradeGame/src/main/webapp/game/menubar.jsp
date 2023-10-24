<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴바</title>
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/menubar.css">
<script src="../script/menubar.js"></script>
</head>
<body>
	<div id="menubar">
		<div class="stick"></div>
		<div class="bg">
			<div class="meunbar">
				<%
				if (!request.getServletPath().equals("/game/gameselect.jsp")) {
				%>
				<button class="gamestart" value=""
					onclick="location.href='/lolTradeGame/game/gameselect.jsp'"></button>
				<%
				} else {
				%>
				<button class="gamestart-in" value=""
					onclick="location.href='/lolTradeGame/game/gameselect.jsp'"></button>
				<%
				}
				%>
				<%
				if (!request.getServletPath().equals("/game/main.jsp")) {
				%>
				<button class="home" id="home" value=""
					onclick="location.href='/lolTradeGame/game/main.jsp'">
					<div class="gradation-on">홈</div>
				</button>
				<%
				} else {
				%>
				<button class="home" id="home" value=""
					onclick="location.href='/lolTradeGame/game/main.jsp'">
					<div>
						<div class="tpoint"></div>
						<div class="gradation-in">홈</div>
					</div>
				</button>
				<%
				}
				%>
				<div class="construction1"></div>

				<%
				if (!request.getServletPath().equals("/game/myinfo.jsp")) {
				%>
				<button class="myinfo" value=""
					onclick="location.href='/lolTradeGame/game/myinfo.jsp'">
					<div class="gradation2-on">
						<div class="myinfo-btn"></div>
					</div>
				</button>
				<%
				} else {
				%>
				<button class="myinfo" id="home" value=""
					onclick="location.href='/lolTradeGame/game/myinfo.jsp'">
					<div>
						<div class="tpoint2"></div>
						<div class="in-myinfo-btn"></div>
						<div class="gradation-in2"></div>
					</div>
				</button>
				<%
				}
				%>
				<%
				if (!request.getServletPath().equals("/game/collection.jsp")) {
				%>
				<button class="collection" id="collection" value=""
					onclick="location.href='/lolTradeGame/game/collection.jsp'">
					<div class="gradation2-on">
						<div class="collection-btn"></div>
					</div>
				</button>
				<%
				} else {
				%>
				<button class="collection" id="collection" value=""
					onclick="location.href='/lolTradeGame/game/collection.jsp'">
					<div>
						<div class="tpoint2"></div>
						<div class="in-collection-btn"></div>
						<div class="gradation-in2"></div>
					</div>
				</button>
				<%
				}
				%>
				<div class="construction2"></div>
				<%
				if (!request.getServletPath().equals("/game/store.jsp")) {
				%>
				<button class="store" value=""
					onclick="location.href='/lolTradeGame/game/store.jsp'">
					<div class="gradation2-on">
						<div class="store-btn"></div>
					</div>
				</button>
				<%
				} else {
				%>
				<button class="store" value=""
					onclick="location.href='/lolTradeGame/game/store.jsp'">
					<div>
						<div class="tpoint2"></div>
						<div class="in-store-btn"></div>
						<div class="gradation-in2"></div>
					</div>
				</button>
				<%
				}
				%>
				<div class="construction3"></div>
				<div class="money">0000</div>
			</div>
			<div class="stick-bottom"></div>
		</div>
	</div>
</body>
</html>