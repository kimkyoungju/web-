function regist(){
	
	let form = document.querySelector('form')
	
	let formdata = new FormData(form)
	
	console.log(formdata)
	
	$.ajax({
		url :"/jspweb/admin/regist",
		data : formdata,
		//form전송이 첨부파일일 경우
		type :'POST',
		processData: false,
		contentType :false,
		success : function(re){
			if(re=='true'){
				alert("제품등록")
			}else{
				alert("제품등록실패")
			}
		}
	})
}

// 첨부파일 등록했을때 미리보기
let pimg = document.querySelector("#pimg")

pimg.addEventListener('change' ,function(e){ // e : 첨부파일 input change 이벤트 e: event 객체(이벤트 정보[target ,data등 ] , 누가 , 뭐를)
	
	//alert('이지등록')
	
	let file = new FileReader()
//	console.log(file)
//	console.log(e) //이벤트 객체
//	console.log(e.target)	//이벤트발생시킨태그 누가 실행했냐
//	console.log(e.target.files[0])	// 해당 태그의 등록된 파일 
	//2. 해당 첨부된 파일의 dkfrl [ .readasdataurl]
	file.readAsDataURL(e.target.files[0])
	//3.특정태그에 이미지 대입
	file.onload= function(e){	// e :file load 이벤트  
		document.querySelector('#pimgpre').src=e.target.result	//서버[사용자의 경로 요청x]와 관련없음 
	}
})



//3. 카테고리 추가 버튼

function pcategoryview(){
	
	document.querySelector('.pcategoryaddbox').innerHTML
	= '<input type="text" id="pcname">'+
				'<button type="button" onclick="pcategoryadd()">카테고리등록</button>'
				
}

function pcategoryadd(){

	$.ajax({
		url :"/jspweb/board/pcategory",
		type :"POST",
		data : {"pcname" : document.querySelector("#pcname").value },
		success : function(re){
			
			if(re==='true'){
				alert("카테고리등록")
				document.querySelector('.pcategoryaddbox').innerHTML =''
				getpcategory()
			}else{
				alert("카테고리없음")
			}
		}
		
	})
}

//5.카테고리 호출메소드
getpcategory()
function getpcategory(){
 	
 	document.querySelector('.pcategorybox').innerHTML
 	
 	
 	
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
			document.querySelector('.pcategorybox').innerHTML = html;
		}
})
		
}
