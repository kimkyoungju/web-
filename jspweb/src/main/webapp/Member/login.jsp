<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp"  %>
	<div class="webbox"> 
		<!-- <h3>로그인 페이지[form전송]</h3>
			<form action = "/jspweb/member/login" method="post">
				아이디 : <input type="text" name="mid"> <br>
				비밀번호 :   <input type="text" name="mpassword"><br>
				<input type="submit" value="로그인">
			</form> -->
		<div class="web1">	
		<h3>로그인 페이지[js ajax(비동기식)전송]</h3>
				<div class="main">
				아이디 : <input type="text" id="mid"> <br>
				비밀번호 :   <input type="text" id="mpassword"><br>
				<div id = "loginconfirmbox"></div>
				</div>
				<button type="button" onclick="login()">로그인</button>
					
					
				<ul class="sub">
					<li><a href="signup.jsp">회원가입</a></li>
					<li><a href="findid.jsp">아이디찾기</a></li>
					<li><a href="findpassword.jsp">비밀번호찾기</a></li>
				</ul>	

	</div>
	</div>

<script src="../js/member/login.js" type="text/javascript"></script>

</body>
</html>