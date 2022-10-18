
function bfiledelete(){
	if	(	confirm("삭제 하시겠습니까?")){
	
	
	$.ajax({
			url : "/jspweb/board/bfiledelete" , 
				success : function( re ){
				if(re==='true'){
					alert("첨부파일 삭제")

//					location.reload()
			 document.querySelector(".oldbfilebox").innerHTML=''
					 //특정태그만 새로고침 : jquery제공
					$("#oldfilebox").load(location.href+'#oldfilebox')			
				
				}else{
					alert("첨부파일 삭제 실패")
				}

}

	})
	}
}


bview() 
function bview(){
	$.ajax({
		url : "/jspweb/board/view" , 
		success : function( re ){
			let board = JSON.parse(re)
			console.log( board )
			document.querySelector(".btitle").value = board.btitle;
			document.querySelector(".bcontent").innerHTML = board.bcontent;
			if(board.bfile !==null ){
				
				let filedelete  = board.bfile+'<button type="button" onclick="bfiledelete()">삭제</button>'
				document.querySelector(".oldbfilebox").innerHTML = filedelete;
		
			}
			
			
			/* 썸머노트 실행 */
			$(document).ready(function() {
			  //$('#summernote').summernote( {설정객체} );
			  $('#summernote').summernote( {
				
					plasceholder : '내용 입력 해주세요' , 
					maxHeight : null , 
					minHeight : 300
				});
				
			}); 
			
		}
	})
}
function bupdate(){
	
	let form = document.querySelector('form');
	let formdata = new FormData( form )
	
	console.log( formdata )
	
	$.ajax({
		url : "/jspweb/board/bupdate" ,
		data : formdata , 
		// 첨부파일시
		type : "POST" , 
		contentType : false,
		processData : false , 
		// 성공시
		success : function( re ){ 
			if( re === 'true' ){ alert('수정성공'); location.href = 'view.jsp' }
			else{ alert('수정실패') }
		}
		
	})
	
	
}