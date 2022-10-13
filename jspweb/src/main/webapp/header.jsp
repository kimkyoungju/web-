<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">



<title>BIRTH쇼핑몰</title>
	<!-- 뷰포트 -->
	<meta name="viewport" content="width = device-width , inital-scale=1.0">
	<!-- 폰트 -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<!-- 사용자 정의 css호출 -->
	<link rel="stylesheet" href="/jspweb/css/header.css">

</head>
<body>
		
	<div class="webbox">
		<div class = "hd_top"> 
			<div> <!-- 로고 -->
				<span class="hd_title">
					<a href="/jspweb/index.jsp">BIRTHDAY APPLE SHOP</a>	
				</span>	
			</div>
			
			<!-- 세션 호출[jsp방식 = 템플릿마다 다름 (jsp vs 리액트] -->
			
			<%  
				//jsp 스크립트 태그 ( 태그안에 java문법 작성 가능)
				String loginid = (String)session.getAttribute("mid");
								//형변환 : 세션자료형 = object
			%>
				
			<ul class="hd_sub"> <!-- 상단 메뉴 -->
				 <!-- /* 자바시작 */ -->
					<% if(loginid == null){ %> <!-- // 세션이 없다로그인 안했네 -->
					<!-- 자바엔드 -->
					<li><a href="/jspweb/Member/login.jsp">로그인</a></li>
					<li><a href="/jspweb/Member/signup.jsp">회원가입</a></li>
				<!-- 	//세션이 존재한다 로그인 했다. -->
				<% 		
					}else{ 
				%>		
						<li> <%=loginid %>님 안녕하세요</li>
						<li> <a href="/jspweb/Member/logout.jsp">로그아웃</a></li>
						
				<%	}%>	
					<!-- 공통메뉴 -->
					<li><a href="/jspweb/Member/info.jsp">나의정보</a></li>
					<li><a href="/jspweb/board/list.jsp">고객센터</a></li>
				</ul>
			
		</div>	
		
		<ul class="hd_menu">
			 <li><a href="#">BIG SIZE!</a></li>
			 <li><a href="#">BIG ANTEASUB</a></li>
			 <li><a href="#">ANCHOVY SIM</a></li>
			 <li><a href="#">NO JUONSN</a></li>
			 <li><a href="#">1+1 이벤트</a></li>
			 <li><a href="#">케이스</a></li>
			 <li><a href="#">에어팟</a></li>
			 <li><a href="#">EVENT</a></li>
			 <li><a href="#">TO DAY</a></li>
			 <li><a href="#">OUT-FIT</a></li>
			 	<li class="searchbox">
			 		<span>
				 		<input>
					 	<i class="fas fa-search"></i>
					 </span>
					 		<i class="fas fa-shopping-cart"></i>
			 	</li>
			 
			 
		</ul>
			
	</div>

	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>
<!-- 

		<div> :레이아웃, 박스권,구역
		<span>

 -->