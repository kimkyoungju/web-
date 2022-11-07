// 1. 로그인제 [ 로그인된 경우에만 실행 하겠다.[ 세션호출: jsp vs ajax ]  ]
let mid = document.querySelector('.mid').value
// 2. 웹소켓 선언 
let clientsocket = null; 
// 3. 접속 제어 
if( mid != 'null'){
	// 웹소켓에 서버소켓으로 연결[매핑]
	clientsocket 
	= new WebSocket('ws:192.168.17.46:8080/jspweb/chatting/'+mid);
	// 아래에서 구현 메소드를 객체에 대입
	clientsocket.onopen = function(e){ onopen(e) }
	clientsocket.onclose = function(e){ onclose(e) }
	clientsocket.onmessage = function(e){ onmessage(e) }
	clientsocket.onerror = function(e){ onerror(e) }
}else{ alert('로그인하고 오세요~'); location.href='/jspweb/Member/login.jsp'; }
function onopen(e){ 	alert( e ) }
function onclose(e){  	alert( e )}

function send(){ 
	let msg = { // 전송할 데이터 객체
		type : "msg",
		content : document.querySelector('.msgbox').value , // 작성내용
		mid : mid ,  // 보낸 사람 
		date : new Date().toLocaleTimeString(), // 날짜 
		img : '2.jpg' // 사진
	}
	clientsocket.send( JSON.stringify(msg) )
	document.querySelector('.msgbox').value = ''
}


//보내는 사람

function emosend(i){
	let msg = {
		type : "emo",
		content : i,
		mid : mid , // 보낸ㅅ하람
	date : new Date().toLocaleTimeString(), //날짜
	img : '1.jpg'	
	}
	clientsocket.send(JSON.stringify(msg))
}


function enterkey(){ if(window.event.keyCode == 13){ send() } }

function onmessage(e){
	
	let msg = JSON.parse( e.data )

	//////////////////////일반 메세지 전송 코드//////////////////////////////
	if(msg.type == 'msg'){
		//전송타입이 메세지 이면
		
	
		
		if( msg.mid == mid ){ // 본인 글이면  // 보낸사람 아이디와 접속된 아이디가 동일하면
	         let html = document.querySelector('.contentbox').innerHTML;
	         
	         html +=     '<div class="secontent my-3"> '+
	                     '<span class="date"> '+msg.date+' </span>'+
	                     '<span class="content"> '+msg.content+' </span>'+
	                  '</div>';
	         document.querySelector('.contentbox').innerHTML = html
			
		}else{ // 본인 글이 아니면 
			let html = document.querySelector('.contentbox').innerHTML;
			 html +=  '<div class="row g-0 my-3">'+
			'	<div class="col-sm-1 mx-2">'+
			'		<img width="100%;" class="rounded-circle" alt="" src="/jspweb/img/'+msg.img+'">'+
			'	</div>'+
			'	<div class="col-sm-9"> '+
			'		<div class="recontent"> '+
			'			<div class="name">'+msg.mid+'</div>'+
			'			<span class="content">'+msg.content+'</span>'+
			'			<span class="date">'+msg.date+'</span>'+
			'		</div>'+
			'	</div>'+
			'</div>';
			document.querySelector('.contentbox').innerHTML = html
		}
	
		
		
	}else if(msg.type == "emo"){
		/////////////////////2. 이모티콘 메세지 전송 코드//////////////////////////////
		
		if(msg.mid == mid){
			let html = document.querySelector('.contentbox').innerHTML;
		
		html +=  	'<div class="secontent my-3"> '+
						'<span class="date"> '+msg.date+' </span>'+
						'<img src="/jspweb/img/imoji/emo'+msg.content+'.gif" width="90px;"'+
					'</div>';
		document.querySelector('.contentbox').innerHTML = html
			
			
			
		}
		else{
			let html = document.querySelector('.contentbox').innerHTML;
		 html +=  '<div class="row g-0 my-3">'+
		'	<div class="col-sm-1 mx-2">'+
		'		<img width="100%;" class="rounded-circle" alt="" src="/jspweb/img/'+msg.img+'">'+
		'	</div>'+
		'	<div class="col-sm-9"> '+
		'		<div class="recontent"> '+
		'			<div class="name">'+msg.mid+'</div>'+
		'<img src="/jspweb/img/imoji/emo'+msg.content+'.gif" width="90px;"'+
		'			<span class="date">'+msg.date+'</span>'+
		'		</div>'+
		'	</div>'+
		'</div>';
		document.querySelector('.contentbox').innerHTML = html
			
			
		}
		
		////////////////////////////////////////////////
		
	}else if(msg.type == 'alarm'){
				/////////////////알람이 오면///////////////////////////////
		let html = document.querySelector('.contentbox').innerHTML;
		html +=  '<div class="alarm"> 알람'+
'					<span> '+msg.content+'</span>'+
'				</div>';
		document.querySelector('.contentbox').innerHTML = html

	}
	
	
	
	///////////////////////////스크롤 하단 내리기/////////////////////////
let top =	document.querySelector('.contentbox').scrollTop;
 let height =	document.querySelector('.contentbox').scrollHeight;
console.log(height)
 console.log(top)
 
 document.querySelector('.contentbox').scrollTop =document.querySelector('.contentbox').scrollHeight;
 
 }
function onerror(e){ 	alert(e) }

emoview()
function emoview(){
	let html = '';
	
	for(let i = 1; i<=43; i++){
		
		html+= '<img src="/jspweb/img/imoji/emo'+i+'.gif" width="70px" onclick="emosend('+i+')">'

	}
	document.querySelector('.dropdown-menu').innerHTML = html;
}
