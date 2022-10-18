<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


 <!-- 썸머노트 css -->
<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">


</head>
<body>


		<%@include file="../header.jsp" %> <!-- jsp다른파일 옮길때 -->
		
		
		<!-- 로그인일 경우에만 페이지 로드 -->
		<% if(loginid==null) response.sendRedirect("/jspweb/Member/login.jsp"); %>
		
		
		<div class="webbox">
			<h3> 글쓰기 </h3> 
			  <!-- from -->
				<!-- <form method="get"  action="/jspweb/board/write">
					제목 : <input type="text" name="btitle"> <br>
					내용 : <input type="text" name="bcontent"> 
					<button type="submit">쓰기</button>
				</form> -->
				<form enctype="application/x-www-form-urlencoded">
					제목 : <input type="text"  name="btitle" class="btitle"> <br>
					<textarea id="summernote" name="bcontent" class="bcontent"></textarea>
					첨부파일 : <input type="file" name= bfile  class="bfile"><br>
		
					<div class="oldbfilebox" id="oldbfilebox"></div>		
			
					<!-- form안에서 button 사용시에는 type 필수 넣기 -->
					<button type="button" onclick="bupdate()">수정</button>
				</form>
		</div>

	<!-- 썸머노트api js -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<script src="lang/summernote-ko-KR.js"></script>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

	<script src="../js/board/write.js" type="text/javascript"></script>


</body>
</html>