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
		
	<!-- 부트스트랩 css -->	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
		
</head>
<body>
		
	<div class="webbox">
		<div class = "hd_top"> 
			<div> <!-- 로고 -->
				<span class="hd_title">
					<a class="nav-link" href="/jspweb/index.jsp">BIRTHDAY APPLE SHOP</a>	
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
					<%if(loginid == null){%> <!-- // 세션이 없다로그인 안했네 -->
					<!-- 자바엔드 -->
					<li><a class="nav-link" href="/jspweb/Member/login.jsp">로그인</a></li>
					<li><a class="nav-link" href="/jspweb/Member/signup.jsp">회원가입</a></li>
				<!-- 	//세션이 존재한다 로그인 했다. -->
				
				<% }else if(loginid.equals("admin")){ %>
					<li> <a class="nav-link" href="/jspweb/admin/dashboard.jsp">관리자</a></li>   <!-- 관리자 페이지 -->
				<% 		
					}else{ 
				%>		
						<li> <%=loginid%>님 안녕하세요</li>
						<li> <a class="nav-link" href="/jspweb/Member/logout.jsp">로그아웃</a></li>
						
				<%	}%>	
					<!-- 공통메뉴 -->
					<li><a class="nav-link" href="/jspweb/Member/info.jsp">나의정보</a></li>
					<li><a class="nav-link" href="/jspweb/board/list.jsp">고객센터</a></li>
				</ul>
			
		</div>	
		
		<ul class="hd_menu">
			 <li><a class="nav-link" href="#">BIG SIZE!</a></li>
			 <li><a class="nav-link" href="#">BIG ANTEASUB</a></li>
			 <li><a class="nav-link" href="#">ANCHOVY SIM</a></li>
			 <li><a class="nav-link" href="#">NO JUONSN</a></li>
			 <li><a class="nav-link" href="#">1+1 이벤트</a></li>
			 <li><a class="nav-link" href="#">케이스</a></li>
			 <li><a class="nav-link" href="#">에어팟</a></li>
			 <li><a class="nav-link" href="#">EVENT</a></li>
			 <li><a  class="nav-link" href="/jspweb/board/api.jsp">공공데이터</a></li>
			 <li><a class="nav-link" href="/jspweb/board/chatting.jsp">채팅방</a></li>
			 	<li class="searchbox">
			 		<span>
				 		<input>
					 	<i class="fas fa-search"></i>
					 </span>
					 	<a href="/jspweb/js/product/cart.jsp"><i class="fas fa-shopping-cart"></i></a>
			 	</li>
			 
			 
		</ul>
			
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>

	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>
<!-- 
헤더파일 [ 모든페이지에서 호툴되는 파일]
	경로 ㅣ 
		/ :  최상위 경로 = localhost : 8080
		
		
	
 --><!-- 

		<div> :레이아웃, 박스권,구역
		<span>

 -->