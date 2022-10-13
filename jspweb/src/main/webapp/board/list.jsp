<%@page import="model.Dao.BoardDao"%>
<%@page import="model.Dto.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../../header.jsp"  %>
	
	<div class="webbox">
		<a href="write.jsp">글쓰기</a>
		
		<!-- jsp로 테이블 표시 -->
		<%-- <table>
			<tr>
				<th>번호</th><th>제목</th><th>작성자</th>
			</tr>
			<tr>
			
			<% // 스크립트 태그 : html에 java 작성할수 있는공간
			
			ArrayList<BoardDto>list = BoardDao.getInstance().getlist();
			
			
			for(int i = 0; i<list.size(); i++){
				%>
				<tr>
					<td> <%= list.get(i).getBno() %></td>
					<td> <%= list.get(i).getBtitle() %></td>
					<td> <%= list.get(i).getMno() %></td>
				</tr>
			<%	
			}
			%>
		</table> --%>
		<table class="btalbe">
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th>작성자</th> 
				<th> 작성일 </th> <th> 조회수 </th>
			</tr>
		</table>
		
		
		
		
	</div>
	
	<script src="../js/board/list.js" type="text/javascript"></script>

</body>
</html>