<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="/jspweb/css/chatting.css" rel="stylesheet"> 
</head>
<body>


<%@include file="../header.jsp" %>
	<!--  로그인 회원 아이디 숨기기 [ 헤더.jsp loginid 변수 존재 -->
	<input type="hidden" class="mid" value="<%=loginid%>">

	
		<div class="container">
		
				<div class="col-sm-6 offset-3 chattingbox"> <!-- 채팅 -->
				
					<div class="row">
						<div class="col-sm-4"> 
					
						</div>
						<div class="col-sm-8"> 
								
								<div class="contentbox my-3">
				
								</div>
		
			
				
				<!-- 채팅입력 -->
						<textarea rows="" cols="" class=" form-control msgbox" onkeyup="enterkey()"></textarea> <!-- 메시지 입력 상자 -->
							<!-- 이모티콘, 보내기 -->
							<div class="row">
								<div class="col-sm-2">
									<button class="dropdown-toggle" type="button" id="emobutton" data-bs-toggle="dropdown">
										이모티콘
									</button>
									
									<ul class="dropdown-menu" style="width: 400px; height: 200px;">
										<li><img src="/jspweb/img/imoji/emo1.gif" width="70px" onclick="emosend()"></li>
									</ul>
									
								</div>
								<div class="col-sm-3 offset-7">
									<button type="button" onclick="send()">보내기</button> <!--  메시지 보내는 버튼 -->
								</div>
							
							 </div>
						</div>	
					</div>
				</div><!-- 채팅 구역 end  -->
			</div><!--  컨테이너 end  -->
		
		<script src="../js/board/chatting.js" type="text/javascript"></script>	


	<!-- <div class="contentbox my-3">채팅창
				<div class="secontent my-3">
					<span class="date"> 오전 10 : 07 </span>
					<span class="content"> 나는 쌔삥 </span>
				</div>
				<div class="alarm"> 알람
					<span> 안태섭님이 중전마마 납시오</span>
				</div>
				<div class="row g-0 my-3"> 받을때 메세지
					프로필
					<div class="col-sm-1 mx-2">
						<img width="100%"; class="rounded-circle" alt="" src="/jspweb/img/2.jpg">
					</div>
					내용
					<div class="col-sm-9">
						<div class="recontent"> 
							<div class="names">심영섭</div>
							<span class="content"> 나는 영섭凸 </span>
							<span class="date"> 오전 10 : 08 </span>
						</div>
					</div>
				</div> -->
				


</body>
</html>