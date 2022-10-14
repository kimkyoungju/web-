


 /*썸머노트*/
 $(document).ready(function() {
  $('#summernote').summernote(
	
	
	{
		placeholder : '내용 입력',
  
  		maxHeight : null ,
 		 minHeight : 300
	}
	
);
  
  
  
});

function bwrite(){





	//form버전
	let form = document.querySelector('form')	//form호출
  	console.log(form)							

    let formdata = 	new FormData (form)			//객체화된 from에 정보 
    console.log(formdata)
    
   $.ajax({
		url :"/jspweb/board/write",
		data : formdata, //ajaxx 기본값으로 form 전송 불가능
		
		
		//기본값 : application/x-www-form-urlencoded;charset = UTF-8 첨붚파일 지원 x
		//vs
		//false : multipart /form -data cjaqnvkdlf wldnjs 
		contentType : false, // 전송할 데이터의 타입
		processData : false, //전송시 사용되는 다입 
		//기본값 : 전송 url 데이터명시 http://examplet.com?title
		//vs
		//false : http //example.com
		//첨부파일 전송시 : 아래코드 추가
		type : 'post',  //http메소드 [ get vs post ]
		success : function(re){alert("작성완료")
		location.href="list.jsp"
		}
	
})
/*
	=======form없는 버전 =======
	let inputs = document.querySelectorAll("input")
	
	
	console.log(inputs)
	
	let data ={
		btitle : inputs[1].value,
		bcontent :inputs[2].value
	}
		console.log(data)


	$.ajax({
		url :"/jspweb/board/write",
		data : data,
		success  : function(re){
			if(re ==='true'){alert("글등록");location.href=("list.jsp")}
			else{alert("등록실패")}
			
		}
	})

	*/
}

