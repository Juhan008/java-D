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
<title>게임로비</title>
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/gamelobby.css">
</head>
<body>
	<div id="root" class="bg">
		<div id="menubar"><jsp:include page="menubar.jsp"></jsp:include></div>
		<div id="contents" class="lobbypaper">
			<div class="champion">
			<div class="top"></div>
			<div class="jungle"></div>
			<div class="mid"></div>
			<div class="adc"></div>
			<div class="supp"></div>
			</div>
			<div class="go-action">
			<button class="back-select" value=""
				onclick="location.href='/lolTradeGame/game/gameselect.jsp'"></button>
			<button class="start-go" value=""
				onclick="location.href='/lolTradeGame/game/battlepage.jsp'"></button>
		</div></div>
	</div>

</body>
</html>