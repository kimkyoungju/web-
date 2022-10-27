/**
 * 
 */
 
 
 getproduct()
 function getproduct(){
	
	$.ajax({
		url: "/jspweb/admin/regist",
		data  : {"type" : 1},
		type :"get",
		success : function(re){
			let json = JSON.parse(re)
			console.log(json)
			
			let img ='';
			let html ='';
//			json.forEach(p =>{
//				//반복변수명에 인덱스객체 하나씩 대입 
//				html +=  
//			})
//			json.foreach(반복변수명 => {실행문 }) : 인덱스 존재하는 객체에 한해 사용가능
			for(let i = 0; i < json.length; i++){
					img = '/jspweb/admin/pimg/'+json[i].pimg;
					console.log(img)
					html += '<tr>'+
								'<td><img src ="'+img+'" width ="100%"></td>'+
								'<td>'+json[i].pno+'</td>'+
								'<td>'+json[i].pcno+'</td>'+
								'<td>'+json[i].pname+'</td>'+
								'<td>'+json[i].pprice+'</td>'+
								'<td>'+json[i].pdiscount+'</td>'+
								'<td>'+json[i].pprice*json[i].pdiscount+'</td>'+
								'<td>'+json[i].pactive+'</td>'+
								'<td>'+json[i].pdate+'</td>'+
								'<td>'+
									'<button type ="button" onclick="updatemodal('+json[i].pno+')">수정</button>'+
									'<button type ="button" onclick="deleteprodcut('+json[i].pno+')">삭제</button>'+
								'</td>'+
							'</tr>';
			}
			document.querySelector('.ptable').innerHTML += html;
			
			/*
			for(let i = 0 ; i<json.lengtd; i++){
				html += '<tr>'+
								'<td>'+json[i].pname+"</td>"+
								'<td>'+json[i].pimg+"</td>"+
						'</tr>'	
						
						'<img src="'+img+'">'
			}
			console.log(html)
			html = document.querySelector('.table')
	*/
		}
		
	})
}


//1. 모달싱행
function updatemodal(pno){

	document.querySelector(".updatemodalbtn").click() // 해당 css해당버튼을 클릭하는 이벤트
	//2. 해당 모달에 기존 내용물 채워주기
		
		//2-1 : 해당 pno 의 제품 번호 호ㅓ출



	$.ajax({
		url : "/jspweb/admin/regist",
		data : {"type" : 2, "pno" : pno},	// 타입이 : 1이면 개별 제품 호출 
		type : "get",
		success : function(re){
			
			let json = JSON.parse(re)
			console.log(re)
			console.log(json)
				
			document.querySelector('.pno').value  = json.pno
			document.querySelector('.pname').value  = json.pname			
			document.querySelector('.pcomment').value  = json.pcomment	
			document.querySelector('.pprice').value  = json.pprice	
			document.querySelector('.pdiscount').value  = json.pdiscount	
			
			}
		
	})
	
}

///2 수정
function updateproduct(){
	console.log(11)
	
	//1.수정할 정보
	let form = document.querySelector(".update")
	let formdata = new FormData(form)
	console.log(formdata)
	console.log(form)
	
	//2. 수정할 대상 
		//form data 속정 추가
		//formdata.set('속성명' : 데이터 )
	
	
	
	$.ajax({
		url : "/jspweb/admin/regist",
		type : "put",
		data : formdata,
		processData : false,
		contentType : false,
		success : function(re){
			if(re == 'true'){
				alert("수정완료")
				//1. 모달 닫기
				document.querySelector(".modalclosebtn").click()
				 //2. 모달 새로고침
				 pagechage('list.jsp');
				}else {
					alert("실팽")
				}
			
		}
		
	})
}

//카테고리 추가

getpcategory()
function getpcategory(){
 	
 	document.querySelector('.categorybox').innerHTML
 	
 	
 	
 	$.ajax({
		url :"/jspweb/board/pcategory",
		type : "get", 
		success : function(re){
			let json = JSON.parse(re)
			console.log(json)
			
			let html = '';
			for(let i = 0; i<json.length; i++){
				let category = json[i];
				html += '<input type ="radio" name="pcno" value ='+category.pcno+'>'+category.pcname;
			}
			document.querySelector('.categorybox').innerHTML = html;
		}
})
		
}


//3 삭제

function deleteprodcut(pno){
	if(confirm("정말삭제할까요?")){
	
	$.ajax({
		
		url :"/jspweb/admin/regist",
		data : {"pno" :pno}, /*톰캣서버의 기본설정값은 get ,psot 방식만 객체[BODY]전송 사용가능해서 보내는거*/ 
		type : 'delete',
		success : function(re){
			//server프로젝트 폴더 클릭 -> server.xml 
			//    <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443" parseBodyMethods="POST,GET,DELETE,PUT,PATCH"/>

			if(re==='true'){alert("삭제성공");  pagechage('list.jsp')}
				//pagechage : dashboard.jsp 내 dashboard.js가 포함되어 있기때문에
			else{alert("삭제실패")}
		}
	})
	
	
	
	}
}


