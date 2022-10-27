<%@page import="model.Dto.productDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Dao.productDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<div class="container">
			<table class="table ptable">	
				<tr>
					<th style=" width: 5%">제품이미지</th>
					<th  style=" width: 10%">번호</th>
					<th  style=" width: 10%">카테고리</th>
					<th  style=" width: 10%">제품명</th>
					<th  style=" width: 10%">가격</th>
					<th  style=" width: 10%">할인율</th>
					<th  style=" width: 10%">판매가[가격*할인율]</th>
					<th  style=" width: 10%">판매상태</th>	
					<th  style=" width: 10%">등록날짜</th>	
					<th  style=" width: 10%">비고</th>		
				</tr>
			</table>
	</div>
<!-- 부트스트랩 : 모달 -->
<!-- Button trigger modal -->
<button style="display: none;" type="button" class="updatemodalbtn btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
  Launch static backdrop modal
</button>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog  modal-dialog-centered">
    <div class="modal-content"><!-- 모달내용 -->
    
    
    
      <div class="modal-header"> <!-- 모달타이틀 -->
        <h1 class="modal-title fs-5" id="staticBackdropLabel">제품 수정 창</h1>
      </div>
     
      <div class="modal-body"> <!-- 모달 본문 -->
   		<!-- regist.jsp form 사용-->
			<form class="update">
				<input type="text" readonly="readonly" name = "pno" class="pno"> <br>
				제품명 : <input type="text" name ="pname" class="pname"><br>
				설명 : <textarea rows="" cols="" name ="pcomment" class="pcomment"></textarea><br>
				가격 : <input type="text" name="pprice" class="pprice"><br>
				할인율 : <input type="text" name="pdiscount" class="pdiscount"><br>
				카테고리 : <span class="categorybox"></span><br>
							
				제품 상태 :<input type="radio" value="0" name="pactive"> 준비중
						<input type="radio" value="1" name="pactive"> 판매중
						<input type="radio" value="2" name="pactive"> 재고없음 <br>
						상품대표이미지 : <input type="file" id="pimg" name="pimg"><br>
	
	</form>
	
      </div>
      
      <div class="modal-footer"> <!-- 모달푸터 -->
        <button type="button" class="modalclosebtn btn btn-secondary" data-bs-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-primary" onclick="updateproduct()">수정</button>
      </div>
    
    </div>
  </div>
</div>

<!------------------------  -->

<script type="text/javascript" src="/jspweb/js/admin/list.js"></script>
</body>
</html>