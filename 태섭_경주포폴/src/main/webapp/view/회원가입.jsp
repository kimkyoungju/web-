<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>


<form action="/�¼�_��������/member/signup" method="post" class="sign">

<h1>ȸ������</h1>

	<input type="text" value="�̸�" id="name" >
	
	<input type="text" value="���̵�" id="id" onkeyup="idc()">
	<div class="m"></div>
	<input type="text" value="��й�ȣ" id="pw" onkeyup="pwc()">
	<div class="m1"></div>
	
	<input type="text" value="��ȭ��ȣ" id="ph" onkeyup="phc()">
	<div class="m2"></div>
	<input type="text" value="�ּ�" id="ad">
	
	<input type="text" value="�߻�����" id="size" onkeyup="sizec()">
	<div class="m3"></div>
	<div class="signup">
	<button type="button" onclick="signup()" >�����ϱ�</button>
	<button type="reset">����ϱ�</button>
	</div> 


</form>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script type="text/javascript" src="../js/ȸ������.js"></script>
</body>
</html>