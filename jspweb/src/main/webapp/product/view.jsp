<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link  href="/jspweb/css/productview.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>




	<%@include file="../header.jsp" %>
	
			
	<%
	
		// 자바 작성 태그 [서블릿] 
			//1.경로에 있는 pno req요청
			//2.만약에 요청변수가 없을경우
			
				int pno  =  Integer.parseInt(request.getParameter("pno"));
				//2. 로그인된 회원정보 호출
				Object object = session.getAttribute("mid");
				String mid = null;
				if(object != null){ //로그인 했다
					mid = (String)object;
				}
	%>
<!-- 제품번호 -->	<input type="hidden" value="<%=pno%>" class="pno">
<!-- 회원아이디 -->		<input type="text" value="<%=mid%>" class="mid">
	
	<div class="container"> <!--b:  container -->
	
	<div  class="row">
		<!--대표이미지  -->
			<div class="col-md-8"><!--b:  col-md-6 : 12중에 6그리드 -->
				<img alt="" src="/jspweb/img/imo2.jpg" class="pimg">
			</div>
		
		
		
		<!-- 상품정보 -->
			<div class="col-md-4">
				<div class="infobox">
					<h4 class="pname"></h4>
					<div class="pcomment">
						</div>
					<!-- 가격 -->
					<div class="pricebox">
						<span class="pdiscount"></span>
						<span class="pprice"></span>
						<span class="psale"></span>
					</div>
					<!-- <div class="pricebox">
						<span>30,000원</span>
					
					</div> -->
					<!-- 사이즈종류 -->
					
					<div class="sizebox">
						<span >[FREE,XL,L,M,S,XS]</span>
					
					</div>
					<!-- 제품옵션 -->
					<table class="table info_t"> <!-- b -->
						<tr><td>배송구분</td> <td>2,500원 (70,000원 이상 구매시 무료)</td></tr>
						<tr><td>카드혜택</td> <td> 무이자할부 </td></tr>
						<tr><td>적립혜택</td> <td>3000(1%)</td></tr>
						<tr><td>색상</td> 
						
						
						<td>
							<select class="cselect">
								
							</select>
						
						</td></tr>
						<tr><td>사이즈</td> 
							<td>
						
							<select class="sselect">
							
							</select>
							</td>
							
						</tr>
						
					</table>
					<!-- 선택된 제품 목록 -->
					<table class="table select_t">
				
					
					</table>
						<!-- 선택된 제품들의 총 가격 -->
						<div class="row">
							<div class="col-md-6"> 총 상품금액</div>
							<div class="col-md-6 totalprice"></div>
						
						</div>
						<!-- 버튼 -->
						<div class="btnbox">
								<button id="btn1">바로 구매</button>
								<button id="btn2" class="btncart">장바구니</button>
								<button id="btn3" class="btnlike">찜 ◁</button> <!-- 로그인된 히원이 찜하기x -->
								<!-- <button>찜 ◀</button> 	
						 --></div>
					
				</div>
				
			</div>
		</div>		
		
	</div>





<script type="text/javascript" src="/jspweb/js/product/productview.js"></script>



</body>
</html>