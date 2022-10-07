<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>비회원제 게시판</h1>



	
	
	<form action = "/과제/view/boardin"  method = "get">
	
		글순서 :
		제목 : <input type="text" name = "title">
		내용 : 	<input type="text" name = "content">
		비밀번호 : <input type="password" name = "pw"> <br>
		<input type="submit" value="등록">
		작성일 : 
		조회수 :
	</form>
	



</body>
</html>