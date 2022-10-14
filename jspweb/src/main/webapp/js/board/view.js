/**
 * 
 */
 
 bview()

function bview(bno){
	
	$.ajax({
	url : "/jspweb/board/view",
	data : {"bno" : bno},
	success : function( re ){ 
			let board  = JSON.parse( re )
			console.log( board )
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			console.log(board.bfile)
			if(board.bfile){	//null,undefined,0,false
			let filelink ='<a href="../board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
			document.querySelector('.bfile').innerHTML = filelink;
		}else{
			document.querySelector('.bfile').innerHTML = "|첨부된 파일이없습니다.|";
		}
			///jspweb/board/filedown" : 절대경로
			// jspweb/js/view.js :현재위치 기준 
					//../board/filedown
				//'' : 전체 문잦열 처리
				// "" : 전체 문자열내 문자열 구분
				/*
				 <a href="링크?변수명=데이터"> : get메소드로 해당 url 데이터 전송가능 
				*/
			
			
			console.log(board.btnaction)

			if(board.btnaction == true){				
				
				let btnbox = document.querySelector('.btnbox')
				//삭제버튼 활성화	
				let deletebtn =	'<button onclick="bdelete('+board.bno+')">글삭제</button>'
				btnbox.innerHTML += deletebtn	
				
				let updatebtn = '<button><a href="../board/update.jsp">수정하기</a></button>'
				btnbox.innerHTML += updatebtn
			}
		}
	})
	
}


function bdelete(bno){
		
$.ajax({
	url : "/jspweb/board/bdelete",
	data : {"bno" : bno},
		success : function( re ){
		if(re==='true'){
		alert("삭제성공")
		location.href = "../board/list.jsp"
		}
		else{alert("글삭제실패 ")}	
		}
		
		
	});
	
	
	
}