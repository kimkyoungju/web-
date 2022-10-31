<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/jspweb/css/dashboard.css" rel="stylesheet">
	<!-- 부트스트랩 css -->	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>

 	<!-- 관리자 페이지 -->
 	<!-- 만약에 세션이 없거나 관리자가 아니면 -->
 	<% String mid = (String)session.getAttribute("mid") ;
 			if(mid == null || !mid.equals("admin")){
 				response.sendRedirect("../index.jsp");
 			}
 			
 	%>
 		<!-- marquee : 텍스트 슬라이드(전광판) /scrollamount :속도-->
 		<marquee scrollamount="10"> 공지사항 표시되는 위치 </marquee>
 		
 		<!-- 사이드바  열고 닫기-->
		<div class="sidebar">
			<h3>ADMIN MENU</h3>
			<ul class="side_menu">
				<li class="side_witem"><a onclick="pagechage('regist.jsp')">제품등록</a>
				<li class="side_item"><a onclick="pagechage('list.jsp')">제품목록</a>
				<li class="side_item"><a onclick="pagechage('stock.jsp')">재고관리</a>
				
				<li class="side_item"><a href="#">주문관리</a>
				<li class="side_item"><a href="#">매출관리</a>
				
				<li class="side_item"><a href="#">회원목록</a>
				
				<li class="side_item"><a href="#">배송관리</a>
				<li class="side_item"><a href="/jspweb/Member/logout.jsp">로그아웃</a>
			</ul>
		</div>
		
		<!-- 본문페이지가 보이는 div입니다 -->
		<div id="mainbox">
			<!-- 사이드바에서 페이지전환 -->
		</div>
		
		
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		
		<script type="text/javascript" src="../js/admin/dashboard.js"></script>

</body>
</html>