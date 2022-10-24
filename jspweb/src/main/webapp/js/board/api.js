
//카카오 지도



//////////////////////////전역변수///////////////////////
let datalist = null ; // 약국리스트 선언만 [전역변수]
//////////////////////평션 호출

getdata()
getdata2()
/////////////////////////카카오 지도 api/////////////////////////////
function getdata(){
	
$.ajax({
	url : "/jspweb/board/api",
	success :function(re){
	let json = JSON.parse(re)
	datalist = json.data	 // 약국 리스트 
		
		dataprint()
		

		}
		 
		
	})
}

function addrsearch(){
	
	let addr = document.querySelector('.addrinput').value
	dataprint(addr)
}

//3. html에 약국리스트 출력함수 
function dataprint( search ){
	
	// 함수로 뺀이유 여러번 처리할려고  //search : 검색어
	console.log(search)
		//undefined vs null ns undefind
	if(search !== undefined){ // 검색이 있을경우
		let serchlist = []
		for(let i = 0; i<datalist.length; i++){
			let addr = datalist[i].주소
			
			if(addr.indexOf(search) !== -1){ // 검색한 키워드와 같으면
				serchlist.push(datalist[i])
				
			}
		}
		
		datalist = serchlist; // 출력할 약국리스트를 검색된 약국 리스트 대입 
	
		if(search == ''){ getdata();} // 만약에 키워드에 입력값이 없으면 초기화

	}
	let html =''
	
	for(let i = 0; i<datalist.length; i++){
		let data = datalist[i] //i번째 약국 임시변수	
		html += '<tr onclick="mapview('+i+')">'+ //해당클릭시 실휴ㅐㅇ
					'<td>'+data.약국명+'</td><td>'+data.대표전화+'</td><td>'+data.주소+'</td>'+
					
				'</tr>'
			}
			document.querySelector("table").innerHTML = html;

		
	
}

/////////////////////////지도////////////////////////////////////

function mapview(i){
	//alert(datalist[i].주소)
	// 주소로 좌표를 검색합니다
	//2. 지도 옵션
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	    mapOption = { 
	        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨 [ 1[확대] ~ 14[축소] ]
	    };
    
    ////3. 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
	var map = new kakao.maps.Map(mapContainer, mapOption); 
	var geocoder = new kakao.maps.services.Geocoder();
	
	geocoder.addressSearch(datalist[i].주소 , function(result, status) {
	
    // 정상적으로 검색이 완료됐으면 
     if (status === kakao.maps.services.Status.OK) {

	//주소로 검색된 좌표 객체생서
	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
				 // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new kakao.maps.Marker({
            map: map, // 대입
            position: coords //마커 좌표대입
        });
        
        //마커 클릭이벤트
        // 마커에 클릭이벤트를 등록합니다
		kakao.maps.event.addListener(marker, 'click', function() {
     	detailview(i)
		});
		
		 
		 // 인포윈도우로 장소에 대한 설명을 표시합니다 : 설명 [ 말풍성 ]달기
        var infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+datalist[i].약국명+'<p>'+datalist[i].주소+'</div>'
        });
        infowindow.open(map, marker);
        
        
        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
		
		}
	})
}

function detailview(i){
	let html = '<div>'+datalist[i].약국명+'</div>'+
				'<div>'+datalist[i].주소+'</div>'+
				'<div>'+datalist[i].대표전화+'</div>'+
				'<div><button>평점주기</button></div>'+
				'<div><button>문의하기</button></div>'
		
	
	document.querySelector('.detailbox').innerHTML = html;
	
}
//////////////////////////////////////////////////////////////////////////////////////

function getdata2(){
	$.ajax({
		url :"/jspweb/board/api2",
		success : function(re){
		 let json =	JSON.parse(re)
			console.log(re)
			console.log(json)
			let html = '';
			for(let i = 0 ; i<json.length; i++){
				html += '<tr>'+
							'<th>'+json[i].시군구+'</th>'+
							'<th>'+json[i].번지본번부번+'</th>'+
							'<th>'+json[i].단지명+'</th>'+
							'<th>'+json[i].전용면적+'</th>'+
							'<th>'+json[i].계약년월+'</th>'+
							'<th>'+json[i].계약일+'</th>'+
							'<th>'+json[i].거래금액+'</th>'+
							'<th>'+json[i].층+'</th>'+
							'<th>'+json[i].건축년도+'</th>'+
							'<th>'+json[i].도로명+'</th>'+
							'<th>'+json[i].해제사유발생일+'</th>'+
							'<th>'+json[i].거래유형+'</th>'+
							'<th>'+json[i].중개사소재지+'</th>'+
						'</tr>'
					}
			console.log(html)
		
			document.querySelector('.table1').innerHTML += html;
		}
		
		
	})
	
}
