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
<title>게임선택</title>
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/gameselect.css">
</head>
<body>

	<div id="root" class="bg">
		<div id="menubar"><jsp:include page="menubar.jsp"></jsp:include></div>
		<div id="contents" class="selectpaper">
			<div class="select-BestCategory">
				<button id="select-1" class="select-1" value=""
					onclick="BestCategory1()"></button>
			</div>
			<div class=stick-select></div>
			<div class="select-Subcategories">
				<div id="select1-radio" style="display: none;">
					<input type="radio" name="option" value="1">지역대회<br> <input
						type="radio" name="option" value="2">세계대회<br>
				</div>
			</div>
			<div class="decision-box">
				<button class="back-home" value=""
					onclick="location.href='/lolTradeGame/game/main.jsp'"></button>
				<button class="lobby-go" value=""
					onclick="location.href='/lolTradeGame/game/gamelobby.jsp'"></button>
			</div>
		</div>
	</div>
	<script src="../script/gameselect.js"></script>
</body>
</html>