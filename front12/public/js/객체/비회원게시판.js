/*
  css: class 명
  js: id명
  	//1. html input 태그에 입려된 데이터 호출
 	//2. 객체에 담기
 	//3. 글등록 버튼을 눌렀을때[마다]1/2 실행한다.
 	//4. 게시물 요러개 저장할 공간 = 배열 사용
 	//5. 글 등록이 완료할때 마다 board 객체를 배열에 저장한다
	//6. 글 등록 했으면 기존 내용들 지우기 -> input 공백 넣기
	[출력]
	//1. js 시작될떄 새로운 글이 등록될떄마다  [게시물 출력]
	
	[보기]
	//1.게시물 출력해서 제목을 클릭 할때마다 [게시물 보기]
		//1. 내가 클릭한 게시물(??) : 매개변수 전달 [클릭한 게시물의 번호(중복 없는 속성)]
		
 */
//4. 여러개 board 객체를 저장할 배열 선언
let boardlist = [ ]
 //3.함수선언 [ 글등록 버튼을 클릭할때 마다]
function 글동록(){
 //value 는 입력값만
//1. html 에서 입력된 데이터 가져와서 변수에 담기
let bweiter = document.getElementById('bweiter').value
let bpassword= document.getElementById('bpassword').value
let btittle=document.getElementById('btittle').value
let bcontent= document.getElementById('bcontent').value
	//2. 객체에 담기
let board = {  //let s
	작성자 : bweiter ,
	비밀번호 : bpassword ,
	제목 : btittle ,
	내용 : bcontent
	} //let e
	//5. 객체를 배열에 저장한다.
	boardlist.push(board) //배열명 .push (객체명) : 배열에 데이터 추가 함수
	alert('{ 안내 }글 등록 되었습니다')
	//6. input
//input 공백 넣기
bweiter = document.getElementById('bweiter').value =''
bpassword= document.getElementById('bpassword').value =''
btittle=document.getElementById('btittle').value =''
bcontent= document.getElementById('bcontent').value =''
 //7.글 등록시 게시물 출력 함수 호출
	게시물출력()
} // 글등록 e
//1.
function 게시물출력(){
	let html = '<tr><th>번호</th><th>제목</th><th>작성자</th></tr>'
		
	//1.반복문
		for( let i =0 ; i<boardlist.length; i++){
		//is는  0부터 배열의 길이 까지 1씩증가   //배열내 i번째 객체내 '제목' 키 호출 -> 값
		html +='<tr><td>'+i+'</td><td><a href="#" onclick="게시물보기('+i+')">'+boardlist[i].제목+'<a></td><td> '+boardlist[i].작성자+' </td></tr>'
	}  //js에서 html 작성시 문자처리 : '<태그명 oonclick="함수()">'
	//	
	bweiter = document.getElementById('boardlist').innerHTML = html
}

function 게시물보기(i){
	document.getElementById('viewwriter').innerHTML = boardlist[i].제목
	document.getElementById('viewtittle').innerHTML = boardlist[i].작성자
	document.getElementById('viewcontent').innerHTML = boardlist[i].내용
}






