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
		
		<div class="board">
				제목 : <input type="text" id="title">
				작성자 : <input type="text" id="writer">
				내용 : 	<input type="text" id="content">
				비밀번호 : <input type="password" id="pw"> <br>
		<button type="button" onclick="insert()">글작성</button>

	</div>
	
	
	
	
	<h3>게시판</h3>
		<h1>글보기</h1>
			<ul class="main">
				<li id = "number">순서 : </li>
				<li id = "title1">제목 : </li> 
				<li id = "content1">내용 : </li>
				<li id = "writer1" >작성자 : </li>
				<li id = "date" >작성일 : </li>
				<li id = "view"> 조회수 : </li>
			</ul>
		
	<script src="board.js" type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>