/*

	
	콜백함수 : 함수실행 결과에 따른 인수를 다른 콜백함수로 전달
	
	함수명()
	function(인수){ㄴ}
	인수=>{}
	
	- 콜백함수:함수 1에서 실행된 반환결과를 콜백함수에게 인수로 전달
	
	1.함수1(콕백함수2(인수))
	2.함수1(인수=> function(인수){})
	3.함수1(인수=> {})
	-활용
	 .addEventListener('이벤트명',함수호출[1~3])
	 		: 이벤트 실행결과 정보를 반환
	 .forEach(인수=> {코드})
 */

 let productlist = null;
 let cselect = document.querySelector(".cselect")// 카테고리 선택상자
 let pselect = document.querySelector(".pselect")// 제품선택상자
 let rows = document.querySelectorAll(".rows") // 제품등록 td행

 //카테고리에서  선택을 클릭했을때  제품출력 메소드 호출 
 //cselect.addEventListener('click' ,function(인수){ } )
 //cselect.addEventListener('click' ,인수=>{})

 cselect.addEventListener('click' , e =>{
	
	let pcno = e.currentTarget.value  //선택된 카테고리 번호
	getproduct(pcno); //선택된 카테고리 번호 인수로 전달 제품출력
	
})
 // 제품목록에서 선택을 했을때 재고 등록 html구성
 pselect.addEventListener('click' , e =>{
	
	let pno = e.currentTarget.value  //선택된 카테고리 번호
	productlist.forEach(p=>{
		
		if(p.pno == pno){//해당 제품의 번호와 선택된 번호와 같으면
			rows[0].innerHTML = p.pcno
			rows[1].innerHTML = p.pno
			rows[2].innerHTML = p.pname
			getstock();
		}
		
	})

})
 
/*1 페이지 열리면 모든 카테고리 select넣어주기 */
getcategory()

function getcategory(){
	$.ajax({
		url : "/jspweb/board/pcategory",
		type : 'get',
		success : function(re){
			let json = JSON.parse(re)
			console.log(json)
			//배열 혹읜 리스트 [ 객체 ].forEach(반복변수명[아무거나],인덱스, 배열객체명=> {실행코드})	
			let html = ''
			json.forEach( c =>{
				
				html +=`<option value = ${c.pcno}>${c.pcname}</option>`
				
			})
			cselect.innerHTML = html
		
		}
		
		
	})
}

//2 선택된 카테고리별 제품리스트를 select넣어주기

function getproduct(pcno){
	
	$.ajax({
		url : "/jspweb/admin/regist",
		data : {"type" : 1, "option" : "all"},
		type : 'get',
		success : function(re){
			productlist = JSON.parse(re)
			let html = ''
			productlist.forEach( p =>{
				if(p.pcno == pcno){ // 해당제품의 카테고리 번호와 선택된 카테고리 번호와 같으면
				html +=`<option value = ${p.pno}>${p.pname}</option>`
				}
			})
			pselect.innerHTML = html
			}
		})
	
	}


function setstock(){
	//1. 등록할 데이터 구성 [객체화]한다.
	console.log("실행")
	let psdata = {
		psize : document.querySelector(".psize").value,
		pcolor : document.querySelector(".pcolor").value,
		pstock: document.querySelector(".pstock").value,
		pno : rows[1].innerHTML
	}
	console.log(psdata)
	//2.통신
	$.ajax({
		url : "/jspweb/admin/stock",
		type : 'post',
		data : psdata,
		
		success : re =>{
			if(re=='true'){
				alert("재고등록성공");
				getstock();
				
			}else{
				alert('재고실패');
			}
		}
		
		
		
	})
}
//4. 제품별 재고 출력
 // 제품을 클릭했을때 제품 재고 메소드 호출
function getstock(){
	$.ajax({
		url : "/jspweb/admin/stock",
		data : {"pno" : rows[1].innerHTML },
		success : re =>{
			let json = JSON.parse(re)
			let html = 
				 '<tr>'+
'						<th>사이즈</th>'+
'						<th>색상</th>'+
'						<th>재고</th>'+
'						<th>비고</th>	'+
'					</tr>';
			for(let  i  = 0 ; i<json.length ; i++){
				 html +=  '<tr>'+
		'						<th>'+json[i].psize+'</th>'+
		'						<th>'+json[i].pcolor+'</th>'+
		'						<th>'+json[i].pstock+'</th>'+
		'						<th>-</th>'+
		
							'</tr>'
		}
			
			document.querySelector('.cc').innerHTML = html;
			
		}
		
	})
}