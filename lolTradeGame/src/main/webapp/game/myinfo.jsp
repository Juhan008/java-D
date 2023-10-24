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
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/myinfo.css">
</head>
<body>
	<div id="root" class="bg">
		<div id="menubar"><jsp:include page="menubar.jsp"></jsp:include></div>
		<div class="infopage">
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
		<div class="myfag" value=""></div>
	</div></div>
</body>
</html>