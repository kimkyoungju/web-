<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="/jspweb/css/dashboard.css" rel="stylesheet">
<body>



<div class="container">

	<h3 >제품등록</h3>
	<form action="" class="ti">
		제품명 : <input type="text" name ="pname"><br>
		설명 : <textarea rows="" cols="" name ="pcomment" ></textarea><br>
		가격 : <input type="text" name="pprice" ><br>
		할인율 : <input type="text" name="pdiscount" ><br>
		카테고리 : <button type="button" onclick="pcategoryview()">카테고리추가</button>
			<span class="pcategoryaddbox"><!--  카테고리 추가 -->
				
			</span>
			<div class="pcategorybox"> <!-- 카테고리 몰록구역 -->
			
			</div>
		
		상품대표이미지 : <input type="file" id="pimg" name="pimg"><br>
		<button type="button" onclick="regist()">등록</button>
		<button type="reset">취소</button>
	</form>
	
	<div> <!-- 등록된 첨부파일[이미지만 가능] 미리보기 -->
		<img alt="" src="" id="pimgpre">
	</div>
	
</div>


<script type="text/javascript" src="../js/admin/regist.js"></script>

</body>
</html>