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
		<div>게시물 수 : <span class="totalsize"></span></div>
<!-- 		6.화면에 표시할 게시물 수 -->
		<div>
			<select class="listsize" onchange="blistsize()">
				<option value="5">5</option>			
				<option value="10">10</option>			
				<option value="15">15</option>			
				<option value="20">20</option>			
			
			</select>
		
		</div>
		
		<table class="btalbe table table-hover" >
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th>작성자</th> 
				<th> 작성일 </th> <th> 조회수 </th>
			</tr>
		
		</table>
		
			<a href="write.jsp">글쓰기</a>
			<div class="pagebox"><!3-- 페이징처리 -->
			
			
			
			
			
			</div>
			
			<div><!-- 4.검색처리 구역 -->
				
				<select class="key">
					<option value="b.btitle">제목</option>
					<option value="b.bcontent">내용</option>
					<option value="m.mid">작성자</option>
				</select>
					
					<input class="keyword" type="text" placeholder="검색어">
					<button type="button" onclick="bsearch()">검색</button>
				
			</div>
		
		
	</div>
	<!-- 부트스트랩 js -->
	<script src="../js/board/list.js" type="text/javascript"></script>

</body>
</html>