/**
 * 
 */
 
 
 /*
 
 	JS반복문
 		1.for(let i = 0; 배열명.length; i++){}
 			i : 반복변수 [인덱스용] 
 		2.배열명.forEach( ()=>{})	
 			value : 배열내 데이터 반복변수
 			index : 인덱스
 			array : 배열
 		3.for(value of 배열명){}
 			//배열에서 순서대로 데이터 반복변수에 대입
 		4.for(index in 배열명){}
 			//배열에서 순서대로 인덱스 반복변수에 대입
 		//1.배열에 객체 추가
 	배열.push(객체)
 	//2. 배열내 해당 인덱스에 객체 삭제
 	배열.splice (인덱스 , 1)
 */
 
 
 ///////////////////////////////공통변수
 let stock = null
 let product =null
 let color = null
 let psale = 0 // 할인율 적용된 판매가
 let productlist = [] // 선택된 제품 옶션[색상,사이즈,개수] 리스트 선언
///////////// //링크로 해당 게시물 보내기
 let pno = document.querySelector(".pno").value
 ////////////////////////////////////////////////////이벤트///////////////
//색상 select 박스를 체인지 했을때 이벤트
document.querySelector(".cselect").addEventListener('change',(e)=>{
	 color =e.currentTarget.value // 이벤트를 발생한 객체의  cselect의 담겨져 있는 값 
	
	//8. 색상 select에서 선택된 색상의 사이즈 selet 구성
	let shtml ='<option>[필수]옵션을 선택해주세요</option>'
	stock.forEach(s =>{
		if (s.pcolor == color){ // 재고목록중에 선택된 색상과 같으면
			shtml +=  '<option value = '+s.psize+'>'+s.psize+'</option>'
		}
		
	})
	document.querySelector('.sselect').innerHTML = shtml
})

// **사이즈 select 박스를 체인지 했을때 이벤트
document.querySelector('.sselect').addEventListener('change' , (e)=>{
	let size = e.currentTarget.value
	//1. 사이즈 선택시 안내문구 클릭하면 함수 종료
	if(size == '-[사이즈 필수 선택]-'){return;}
	// 선택된 제품정보와 옵션을 객체 만드다. // 이미 존재하는 옵션은 재고 1만 증가 
 for(p of productlist){
	if (p.pcolor == color && p.psize == size){
		p.amount ++; print();
		return;
	}
}
	let sproduct = {
		pcolor : color , 	// 색상
		psize : size , 		// 사이즈 
		amount : 1			// 수량
	}
	productlist.push( sproduct ) // 리스트에 담는다.
	print() // 리스트에 존재하는 객체를 출력한다. 
}) 
 //찜하기 버튼
 
let btnlike = document.querySelector('.btnlike')

btnlike.addEventListener('click' , (e)=>{
		//1. 로그인 유무 판단 [1.ajax 통신해서 세션 유무 확인한다ㅣ. 2html에서 가져온다]
	let mid =	document.querySelector('.mid').value
		if(mid == 'null'){
			alert("로그인 후 가능한 기능입니다")
			return;
		}
		
		//로그인 했을경우만 
		//2. 찜하기 등록 혹은 삭제 처리
		$.ajax({
			url :"/jspweb/product/plike",
			type : 'post',
			data : {"pno" : pno },
			success : re =>{
				if(re == "1"){
					alert("찜하기 취소")
					 btnlike.innerHTML ="찜 ◁"

				}else if(re=="2"){
					alert("찜하기 성공")
				 btnlike.innerHTML =	"찜 ◀"

				}else{
					alert("관리자 문의")
				}
			}
			
		})
				
		
 });
 
 //장바구니 버튼을 눌럿을때
 document.querySelector(".btncart").addEventListener('click' ,(e)=>{
	//선택 
	if(productlist.length == 0 ){alert('최소 1개이상을 선택해주세요'); return}
	
	//로그인 유무
	if( document.querySelector(".mid").value=='null' ){alert("로그인 후 가능한 기능입니다,");return}
	
	
	
	$.ajax({ // 전송타입 : 문자열 객체 // 첨부파일 
		url : "/jspweb/product/cart",
		type : "post",
		data : {"data" :JSON.stringify(productlist) , "pno" : pno}, 
			//JSON.stringify(객체) : 객체타입 -> 문자열 타입
		success : re=>{
		if(re=='true'){
			productlist = []
			if(confirm("장바구니에 담았습니다. 장바구니 페이지로 이동할까요?")){
			location.href="/jspweb/js/product/cart.jsp"
			}
		}else{alert("장바구니 담기 실패.")}
		
		}	
	})
	
});
 
 getproduct(pno)
 getstock(pno)
 sethtmlprint()
 //2. ㅎ해당 제품 벊호의 제품 정보 호출
 
 
 function getproduct(pno){
	$.ajax({
	url : "/jspweb/admin/regist",
	type : "get",
	async : false,  // 싱그로 나이즈 
	data :{"type" : 2, "pno" : pno},
	success : re=>{
		product =  JSON.parse(re)
		console.log(product)}
		})
		
}
 
 //3. 해당 제품의 정보를 html 대입 메ㅗ드
 function sethtmlprint(){
		document.querySelector(".pimg").src='/jspweb/admin/pimg/'+product.pimg
		
		document.querySelector(".pname").innerHTML = product.pname
		
		document.querySelector(".pcomment").innerHTML = product.pcomment
		
		let phtml = '';
		
			//1. 제품 사진 대입
	
		
		if(product.psidcount == 0){ // 할인이 없을때
			psale = product.pprice
			phtml +='<span class="psale">'+psale.toLocaleString()+'원</span>'
			
			
		}else{ // 할인이 있을때 
		 psale = product.pprice -( product.pprice / product.pdiscount )

			phtml += '<span class="pdiscount">'+Math.round(product.pdiscount)+'%</span>'+
						'<span class="pprice">'+(product.pprice.toLocaleString())+'원</span>'+
						'<span class="psale">'+ psale.toLocaleString()+'원</span>'
			
		}
		document.querySelector(".pricebox").innerHTML = phtml
		
		let sizelist = [ ]						// 1. 중복이 있는 사이즈 배열 선언
		stock.forEach( s => {  sizelist.push( s.psize ) })	// 2.리스트에 담기 
		let sizeset = new Set( sizelist ) 		// 2. 사이즈 리스트 => set 목록 변경 [중복제거]
			console.log( sizeset ) 				// 3. 확인
		
			// 중복이 없는 사이즈목록 html 구성
		let shtml = '<span> [ '
		sizeset.forEach( s => { 
			shtml += " " + s +" "
		})
		shtml += ' ] </span>'
		
		document.querySelector('.sizebox').innerHTML = shtml
		
		// 7. 색상 select 구성  // 색상 목록 중복제거	[ set , includes , filter 등 ]
		let colorlist = []
		stock.forEach( s => {  colorlist.push( s.pcolor ) })
		let colorset = new Set( colorlist )
			console.log( colorset )			// 3. 확인
		
		let chtml = '<option>-[필수] 색상 선택</option>'
		colorset.forEach( c => { 
			chtml += '<option value='+c+'>'+c+'</option>'
		})
		document.querySelector('.cselect').innerHTML = chtml
		
}
		
function getstock(pno){
	
	$.ajax({
		url : "/jspweb/admin/stock",
		type : "get",
		async : false,  // 싱그로 나이즈 
		data : {"pno" : pno },
		success : (re) =>{
			 stock = JSON.parse(re)
			console.log(stock)
		//java set VS js set [ 컬렉션 : 수집 // 프레임워크 : 미리만들어진 클래스]
			//let set = new Set([1,1,2,2,3,3])
			
		}	
})

}


//4. 선택된 제품옵션 리스트를 출력하는 함수 [1.사이즈 선택했을때 2. 옵션 제거 했을때 마다 실행]
function print(){
	let ohtml = '<tr> <th width="30%">상품명/옵션 </th>  <th width="30%">수량</th>  <th width="20%"> 가격 </th>  </tr>';

	let totalprice = 0;
	let totalamount = 0;
	
	productlist.forEach((p,i) =>{
		let tsale = psale * p.amount
		
		let tpoint = Math.round (tsale * 0.01) //판매가 * 수량 *1 %
		totalprice += tsale
		totalamount += p.amount;
		ohtml +=  '<table class="table select_t">'+

'						<tr>'+
'							<td><span>'+product.pname+'</span>'+
'								<br>'+
'								<span>'+p.pcolor+'/'+p.psize+'</span>'+
'							</td>'+
'							<td><!-- 옵션 수량 구역 -->'+
'								<div class="row g-0">'+
'									<div class="col-md-3">	'+
'										<input  readonly class="form-control" value='+p.amount+' > '+
'									</div>'+
'									<div class="col-md-2">'+
'										<button class="amount_btn" onclick="amountup('+i+')">▲</button>'+
'										<button class="amount_btn" onclick="amountdown('+i+')">▼</button>'+
'									</div> '+
'									<div>'+
'										<button class="cancel_btn" onclick="pcancel('+i+')">X</button>'+
'									</div>'+
'								</div>'+
'							</td>'+
'							<td>'+
'								'+
'								<span>'+tsale.toLocaleString()+'원</span><br>'+
'								'+
'								<span class="pointbox">(포인트)'+tpoint.toLocaleString()+'</span>'+
'							</td>'+
'								'+
'						</tr>'+
'					</table>';
	})
		document.querySelector('.select_t').innerHTML = ohtml
		let tohtml = totalprice.toLocaleString()+"원 ("+ totalamount+") 개"
		document.querySelector('.totalprice').innerHTML = tohtml

}

//5. 수량 증가를 버튼을 눌렀을때했을때
//현재 옵셔ㅓㄴ의 재고를 알수 있음
function amountup(i){
	//해당 옶션의 재고찾기
	let maxstock = 0;
	stock.forEach(s=>{
		if(s.pcolor == productlist[i].pcolor &&  
			s.psize == productlist[i].psize){
			maxstock = s.pstock
		}
		
	})
	if(productlist[i].amount >=maxstock ){alert("재고가 부족합니다"); return}
	productlist[i].amount++; print()
}

	//6. 수량 감소 버튼을 ㅇ눌렀을때
	function amountdown(i){
		if(productlist[i].amount <= 1){alert("최소 구매 수량입니다.") ;return}
	productlist[i].amount--; print()}
	
	
	
//7. 선택된 제품 제거
function pcancel(i){
	productlist.splice( i , 1);print() //i 번트에서 한개 자름 
	
}	
	
	
	