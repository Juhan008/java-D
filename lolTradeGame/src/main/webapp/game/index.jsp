<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임 로그인</title>
<link rel="stylesheet" href="../style/index.css">
<link rel="stylesheet" href="../style/login.css">
</head>
<body>
	<div id="root" class="bg">
		<div class="login">
			<form class="loginbox" action="main.jsp" method="post">
				<input class="logininfo" type="text" id="username" name="username"
					required value="아이디">
					 <input class="logininfo"
					type="password" id="password" name="password" required value="비밀번호">
				<input class="submit" type="submit" value="">
				<%--=response.sendRedirect("main.jsp") --%>
			</form>
		</div>
	<div class="login-video-div"><video class="login-video" autoplay muted  loop="20">
			<source src="../vdieo/npe-ft-intro-video.webm" type="video/webm">
		</video></div>
	</div>
</body>
</html>