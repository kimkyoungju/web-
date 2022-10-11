<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- 헤더페이지호출 -->
		<%@include file="../header.jsp" %>
		
		<!-- 세션을 이용한 페이지제어 -->
		<%  
			/* header.jsp 파일의 변수 호출 */
			if(loginid == null){response.sendRedirect("login.jsp");}
		%>
		<!-- 본문 -->
		<div class="webbox">
			<h3>회원 정보</h3>
			
			<button onclick="viewdelete()">회원탈퇴</button>
			<div id="deletebox">
					
				
			</div>
			
			<table>
				<tr> 
					<td>회원번호</td> <td id = "mno"><%=loginid %></td>
				</tr>
				<tr> 
					<td>아이디</td> <td id = "mid"><%=loginid %></td>
				</tr>
				<tr> 
					<td>이름</td> <td id = "mname"><%=loginid %></td>
				</tr>
				<tr> 
					<td>전화번호</td> <td id = "mphone"><%=loginid %></td>
				</tr>
				<tr> 
					<td>이메일</td> <td id = "memail"><%=loginid %></td>
				</tr>
				<tr> 
					<td>주소</td> <td id = "maddress"><%=loginid %></td>
				</tr>
				<tr> 
					<td>가입날짜</td> <td id = "mdate"><%=loginid %></td>
				</tr>
				<tr> 
					<td>포인트</td> <td id = "mpoint"><%=loginid %></td>
				</tr>
				
			</table>
		</div>
		
		<div class="webbox">
			<h3>회원 목록</h3>
			
			
			
			<table id="memberlisttable">
				<tr> 
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>연락처</th>
					<th>이메일</th>
					<th>주소</th>
					<th>날짜</th>
					<th>포인트</th>
					<th>번호</th>
				</tr>		
			</table>
		
		</div>
		
		
		
			<script src ="../js/member/info.js" type="text/javascript" ></script>
		

</body>
</html>