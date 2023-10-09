<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임 로그인</title>
<link rel="stylesheet" href="../css/login.css">
</head>
<body>
<div class="bg">
	<div class="sc">
			<form action="main.jsp" method="post">
			   <p><label class="Text" for="username">아이디</label></p>
			    <p><input type="text" id="username" name="username" required></p>		
			    <p><label class="Text" for="password">비밀번호</label></p>
			    <p><input type="password" id="password" name="password" required></p>
			    <p><input type="submit" value="로그인"></p>
			    <%--=response.sendRedirect("main.jsp") --%>
			</form>
	</div>
</div>
</body>
</html>