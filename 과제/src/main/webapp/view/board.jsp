<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<meta name="viewport" content="width = device-width , inital-scale=1.0">

</head>
<body>
	
		
		
	<h1>게시판</h1>
	<table class="bbaord">
		<tr>
			<th>제목 : </th> <th>작성자 : </th> <th>작성일 : </th><th>조회수 : </th>	
		</tr>
	</table>
	

	<h3>글작성</h3>
		
		<div>
					제목 : <input type="text" id="title"> <br>
					작성자 : <input type="text" id="writer"><br>
					내용 : <textarea rows="20px" cols="20px" id="content"></textarea><br>
					비밀번호 : <input type="password" id="pw"> <br>
			
		</div>
			
		<button type="button" onclick="insert()">글등록</button>
	
	
	<h3>조회할 글 선택</h3>
	<input type="text">
	<button type="button" onclick="view()">글조회</button>
	

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
		<h2>삭제하기</h2>	
		<button type="button" onclick="delete()">삭제</button>	
		
	<script src="board.js" type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>