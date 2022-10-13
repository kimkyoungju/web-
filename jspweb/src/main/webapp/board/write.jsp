<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				
				제목 : <input type="text" > <br>
				내용 : <input type="text" > <br>
				첨부파일 : <input type="file" ><br>
				<button onclick="bwrite()">쓰기</button>
				
		</div>

	<script src="../js/board/write.js" type="text/javascript"></script>


</body>
</html>