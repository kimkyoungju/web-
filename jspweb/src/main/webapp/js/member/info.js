


mlist();

function mlist(){
/*회원정보호출*/
$.ajax({
	
	url : "/jspweb/member/info" , 
 	success : function( result ) {
		// HTTP 스트림( 바이트단위 ) json형식의 문자타입을 JSON 타입으로 형변환 
		let member = JSON.parse( result )
		document.querySelector("#mno").innerHTML = member.mno
		document.querySelector("#mid").innerHTML = member.mid
		document.querySelector("#mname").value = member.mname
		document.querySelector("#mphone").value = member.mphone
		document.querySelector("#memail").value = member.memail
		//document.querySelector("#maddress").value = member.maddress
		document.querySelector("#mdate").innerHTML = member.mdate
		document.querySelector("#mpoint").innerHTML = member.mpoint
		
		document.querySelector("#sample4_postcode").value = member.maddress.split(",")[0]
			document.querySelector("#sample4_roadAddress").value = member.maddress.split(",")[1]
			document.querySelector("#sample4_jibunAddress").value = member.maddress.split(",")[2]
			document.querySelector("#sample4_detailAddress").value = member.maddress.split(",")[3]
		//memberlist();
	}
});

}


/*0000000000000000000모든회원 호출000000000000000000000*/

/*
function mmemberlist(){
$.ajax({
	url :"/jspweb/member/infolist",
	success : function( result ) {
		let memberlist = JSON.parse(result)
		//1. tag 가져오기
		
		let table = document.querySelector("#memberlisttable")
		
		//2. tag  값넣기
		let tag = '<tr> '+
					'<th>번호</th>'+
					'<th>아이디</th>'+
					'<th>이름</th>'+
					'<th>연락처</th>'+
					'<th>이메일</th>'+
					'<th>주소</th>'+
					'<th>날짜</th>'+
					'<th>포인트</th>'+
				
				'</tr>';		
		for(let i = 0; i< memberlist.length; i++){
			let m = memberlist[i]
			
			// 5. 해당 객체의 정보를 html출력
				tag +=
				'<th>번호</th>'+
					'<th>'+m.mno+'</th>'+
					'<th>'+m.mid+'</th>'+
					'<th>'+m.mname+'</th>'+
					'<th>'+m.mphone+'</th>'+
					'<th>'+m.memail+'</th>'+
					'<th>'+m.mdate+'</th>'+
					'<th>'+m.mpoint+'</th>'+
				'</tr>';		
			
			}
			//6.html 문자열을 table 에 넣어주기
			
			table.innerHTML = tag
			
		}
});	

}
*/
/*0000000000000000000회원탈퇴000000000000000000000*/


function viewdelete(){
	//1. tag가져온다
	let deletebox = document.querySelector("#deletebox")
	
	//2. tag에 넣을 html구성
	
	let tag = 	'<span>!정말 탈퇴 하시겠습니까?</span><input type="password" id="mpassword"><button onclick="mdelete()">확인</button>';
	
	//3.tag에 html 넣기
	
	deletebox.innerHTML = tag
}

function mdelete(){
	//1. tag 입력된 비밀번호 가져온다
	let mpassword = document.querySelector("#mpassword").value
	//2.ajax를 이용한 회원탈퇴 처리
	$.ajax({
		url :"/jspweb/member/delete",
		data: {"mpassword" : mpassword},
		success : function(result){alert(result)
			if(result=='true'){
				alert("탈퇴성공");
				location.href='/jspweb/Member/logout.jsp'
			}else{alert('동일하지 않은 비밀번호입니다.')}
		
		}
		
	})
	
	
	
	
}

let buttons =  document.querySelectorAll("button")

function updateaction(){
	let mname = document.querySelector("#mname")
	
	if(buttons[1].innerHTML ==="확인"){
		
		$.ajax({
			url :"/jspweb/member/update",
			data : {"mname":mname.value},
			success : function(re){
				if(re ==="true"){
					alert("수정성공")
				}else{alert("수정실패")
				}
				
			} 
			
		})
		
		buttons[1].innerHTML ="수정"
		mname.readOnly = true;
		location.reload();
	}else{
		alert('수정후 확인 버튼 누를경우 수정이 완료됩니다.')
		buttons[1].innerHTML ="확인"
		mname.readOnly = false;
	
	}
	
	
}





