/**
 * 
 */
 
 
 
getpactive1();
function getpactive1(){
	
$.ajax({
	url : "/jspweb/admin/regist",
	data : {"type" : 1 , "option" : "pactive1"},
	success : function(re){
		console.log(re)
		let json = JSON.parse(re)
		console.log(json+"1")
		let html = "";
		
		for(let  i = 0; i<json.length; i++){
			
			let total = json[i].pprice-(json[i].pprice/json[i].pdiscount)
			html += 	  	'<div class="item">	<!-- 1개의 제품[아이템] -->'+
							'				<a href="/jspweb/product/view.jsp?pno='+json[i].pno+'"> 	'+
							'					<img src="/jspweb/admin/pimg/'+json[i].pimg+'">'+
							'				</a>'+
							'				<div class="item_info"> <!-- 제품 정보 -->'+
							'					<div class="item_title">'+
							'						'+json[i].pcomment+''+
							'					</div>	<!-- 제품명 -->'+
							'				'+json[i].pname+'	'+
							'					<div class="item_size"> [FREE] </div>'+
							'					'+
							'					<div class="item_price"> '+json[i].pprice.toLocaleString('ko-KR')+' 원 </div> <!-- 원가 -->'+
							'					<div> <!-- 할인된 가격 , 할인율 -->'+
							'						<span class="item_sale"> '+total.toLocaleString('ko-KR')+'원 </span>'+ 
							'						<span class="item_discount"> '+json[i].pdiscount+'% </span>'+
							'					</div>	'+
							'					<div class="item_review">점수 54 리뷰수 412</div> <!-- 리뷰  -->'+
							'				</div>'+
							'				<div>	<!-- 배지 구역 -->'+
							'					<span class="badge rounded-pill text-bg-danger"> 주문폭주 </span>'+
							'					<span class="badge rounded-pill text-bg-info"> 1+1 </span>'+
							'				</div>'+
							'			</div>';
//			if(jsom[i].pdiscount){
//				pprice * pdiscount.toLocaleString('ko-KR')
//			}
			}	
			
		
		document.querySelector(".itemlist").innerHTML += html;
		
		}
})

}