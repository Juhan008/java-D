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
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/main.css">
</head>
<body>

<div id="root" class="bg">
<div id="menubar"><jsp:include page="menubar.jsp"></jsp:include></div>
		<div id="contents" class="homepaper" ></div>
	</div>
	
</body>
</html>