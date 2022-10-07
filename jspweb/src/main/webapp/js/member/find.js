

function findid(){
	//1. 가져오기
	let mname = document.querySelector("#mname").value
	let memail = document.querySelector("#memail").value
	
	let findidconfirmbox = document.querySelector("#findidconfirmbox")
	
	
	//2. 서블릿에게 보내지
	$.ajax({
			url : "/jspweb/member/findid",/*통신경로*/		
			data :{"mname" : mname ,"memail" :memail}, /*보낼 데이터 : {"이름 ": 값,"이름 ": 값,"이름 ": 값,}*/
			success: function(받은데이터){
				if (받은데이터 !=='null'){
					findidconfirmbox.innerHTML = '회원 아이디 :' +받은데이터
				}else{
					findidconfirmbox.innerHTML = '동일한 회원정보가 없습니다.'
				}
			}
			
	});
}

function findpassword(){
	let mname = document.querySelector("#mname").value
	let mid = document.querySelector("#mid").value
	
	let findpasswordconfirmbox = document.querySelector("#findpasswordconfirmbox")
	
	
	$.ajax({
		url : "/jspweb/member/findpassword",
		data : {"mname" : mname, "mid" : mid},
		success : function(result){
			if(result ===''){
				findpasswordconfirmbox.innerHTML = "동일한 회원정보가 없습니다"
			}else{
				alert("회원정보 인증완료")
				alert("임시 비밀번호 :" + result)
			}
			
		}
	})
	
	
}