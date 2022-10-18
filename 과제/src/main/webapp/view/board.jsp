<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<meta name="viewport" content="width = device-width , inital-scale=1.0">
<link rel="stylesheet" href="board.css"> 
</head>
<body>
	
	<div class="m1">
		
	<h1>게시판</h1>
	<table class="bbaord">
		<tr>
		<th>번호</th>	<th>제목 : </th> <th>작성자 : </th> <th>작성일 : </th><th>조회수 : </th>	
		</tr>
	</table>
	
	
	<h3>조회할 글 선택</h3>
	<input type="text" class="sview">
	<button type="button" onclick="view()">글조회</button>
	
	<div>
	<h3>게시판</h3>
		<h1>글보기</h1>
			<ul class="main">
				<li id = "num" class="num1">순서 : </li>
				<li id = "title">제목 : </li> 
				<li id = "content">내용 : </li>
				<li id = "writer" >작성자 : </li>
				<li id = "day" >작성일 : </li>
				<li id = "view"> 조회수 : </li>
			</ul>
		
		<button type="button" onclick="delet()">삭제</button>
		<button type="button" onclick="update()">수정</button>
	</div>
			
			<h3>글작성</h3>
		
		<div>
					제목 : <input type="text" id="title1"> <br>
					작성자 : <input type="text" id="writer1"><br>
					내용 : <textarea rows="20px" cols="20px" id="content1"></textarea><br>
					비밀번호 : <input type="password" id="pw1"> <br>
					<button type="button" onclick="insert()">글등록</button>
		</div>
	
	
	</div>
		
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="board.js" type="text/javascript"></script>


</body>
</html>