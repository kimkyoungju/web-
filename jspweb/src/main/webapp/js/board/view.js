













bview() //게시물 상세 퓨ㅔ이지가 열렸을때 실행되는 함수
//1.해당게시물 출력
function bview(){
	$.ajax({
		url : "/jspweb/board/view" , 
		async : false,
		success : function( re ){ 
			let board  = JSON.parse( re )
			console.log( board )
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			/* 절대경로 : 				http://localhost:8080/jspweb/board/filedown */
			/* 상대경로 : 현재 위치 기준[ http://localhost:8080/jspweb/js/view.js ]
						../board/filedown
			 */
			 /*
			 	<a href="URL?변수명=데이터">	: get메소드로 해당 URL 데이터 전송가능 
			 	'<a href="URL?변수명='+변수+'">'
			 */
			console.log( board.bfile )
			
			if( board.bfile !== null ){	// null , undefined , 0 , false
				let filelink = '<a href="../board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
				// ' ' : 전체 문자열 처리
				// " " : 전체 문자열내 문자열 구분  
				document.querySelector('.bfile').innerHTML = filelink;
			}
			
			console.log( board.btnaction )
			let btnbox = document.querySelector('.btnbox')
			
			if( board.btnaction == true ){
				// 삭제 버튼 활성화
				let deletebtn = '<button onclick="bdelete('+board.bno+')"> 삭제 </button>'
				btnbox.innerHTML += deletebtn;
				// 수정 버튼 활성화 
				let updatebtn = '<button><a href="../board/update.jsp">수정</a></button>'
				btnbox.innerHTML += updatebtn;
			}
		}
		
		
	})
	//////////////////////댓글출력 /////////////////
	rlist();
}
//2. 게시물 삭제 함수
function bdelete( bno ){ // 삭제 버튼 클릭시 삭제할 번호를 인수[식별]
	$.ajax({
		url : "/jspweb/board/bdelete" , 
		data : { "bno" : bno } , // 삭제할 게시물의 식별번호[pk->bno]
		success : function( re ){
			if( re === 'true'){
				alert('글삭제 성공 ');
				location.href="../board/list.jsp"
			}
			else{ alert('글삭제 실패 : [관리자에게문의]') }
		}
	})
}


//3. 댓글 작성 함수 
function rwrite(){
	
	let rcontent = document.querySelector(".rcontent").value
	
	$.ajax({
		url:"/jspweb/reply/rwirte",
		type : "POST", //http 메소드 : get[기본] 방싱 post방식
		data:{"rcontent":rcontent , "type" : 0  },
		success : function(re){
			if(re==1){
				alert("댓글 성공")
				//location.reload();
				rlist();
			}else if(re==0){
				alert("로그인후 댓글 이용 가능합니다")
				location.href="/jspweb/Member/login.jsp";
			}else{
				alert("댓글 실패")
			}
		}
		
		
		
	})
}
//4. 댓글 출력 함수
function rlist(){
	$.ajax({	// 댓글
		url:"/jspweb/reply/rlist",
		data : {"type" : 0},		 // 서블릿을 위한 타입 댓글용 
		 //http 메소드 : get[기본] 방싱 post방식
		 // 동기식으로 바꿔버림 웨이팅
		 
		success : function(re){ // 댓그 ㄹ호출이 성공했을떄 
			let replylist = JSON.parse(re)
			
			let html =''
			
			for(let i = 0; i<replylist.length; i++){	// 댓글마다 반복문 
				let reply = replylist[i]
				
				// 대댓글 ajax 호출  대댓글 호출  = rno ---> rindex 
				$.ajax({
					url:"/jspweb/reply/rlist",
					data : {"type" : 1 , "rno" : reply.rno },
					async : false,	// 싱그러 나이즈 ㅇ어쩔띠티
					success : function(re){
							let rereplylist =	JSON.parse(re)
							//상위 댓글 
							html += '<div>'+
											'<span>'+reply.rcontent+'</span>'+
											'<span>'+reply.rdate+'</span>'+
											'<span>'+reply.mid+'</span>'+
											'<button type ="button" onclick="rereplyview('+reply.rno+')">답글</button>'+
											'<div class="reply'+reply.rno+'"></div>';// 댓글마다 사용되는 구역
									
								for(let j = 0 ; j<rereplylist.length; j++){
									//대댓글 하위 댓글 반복문 쓰는 이유 여러번 출력을 위해
									let rereply = rereplylist[j]
									html += '<div style="margin : 40px;">'+
												'<span>'+rereply.rcontent+'</span>'+
												'<span>'+rereply.rdate+'</span>'+
												'<span>'+rereply.mid+'</span>'+
											'</div>';
								}	
								//마지막 닫기 html 구성 
							html += '</div>';
							
					}
			})
				
				
				
			}
			document.querySelector('.replylist').innerHTML =html;
		}
	})
}

//5대 댓글 [답글] 작성 구역 표시함수
function rereplyview(rno){

	let replydiv = document.querySelector('.reply'+rno)
	replydiv.innerHTML = '<input type="text" class="rerecontent'+rno+'"><button onclick="rereplywrite('+rno+')">답글작성</button>'
	
}

//6. 대대긋 함수 
function rereplywrite(rno){
	let rcontent = document.querySelector('.rerecontent'+rno).value
	
	$.ajax({
		url:"/jspweb/reply/rwirte",
		data:{"rcontent":rcontent ,"rno" : rno, "type" :1},
		type : "POST",
		success : function (re){
			if(re==1){alert("답글 성공") ;rlist();}
			else if(re==0){alert("로그인후 댓글 이용 가능합니다")
				location.href="/jspweb/Member/login.jsp";
			}else{
				alert("댓글 실패")
				}
			}
		})
}







