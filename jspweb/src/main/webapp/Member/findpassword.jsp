<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>

	<%@include file="../header.jsp"  %>
	<div class="webbox">
		<div class="web1">
			<h3> 비밀번호찾기</h3>
			이름 : <input type="text" id = mname>	<br>
			아이디 : <input type="text" id = mid>	<br>
			<div id = findpasswordconfirmbox></div>
			<button type="button" onclick="findpassword()">비밀번호찾기</button>
		</div>
	</div>
	<script src="../js/member/find.js" type="text/javascript"></script>
	

</body>
</html>