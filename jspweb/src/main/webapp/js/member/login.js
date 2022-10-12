/*html과 서블릿
//1. html 입력된 데이터 가져오기 [dom객체]



//0 로그인 버튼 눌렀을때 [여러번 실행--> 함수]

	

*/

//함수 정의[function 함수명(매개변수){}]
//2.html 함수 실행 --> 이벤트
		//1.onclick= "함수명()" : 클릭했을때 함수 호출

function login(){
	
	let mid = document.querySelector('#mid').value
	let mpassword = document.querySelector('#mpassword').value
	let loginconfirmbox = document.querySelector('#loginconfirmbox')
	//2. 변수 2개 서블릿으로 보내기[jquery : js] form없이
		//1.jquery 라이브러리 포함 //ajax(비동기식 통신 기법)
		
	//$.ajax({속성명= 값,속성명= 값,속성명= 값})		
		//url :'통신경로'
		//data : 전송할 데이터{'키' : 값 ,'키' : 값 }
		//success : function(매개변수){}
	
	$.ajax({
		
		url : "/jspweb/member/login", //서블릿url
		data : {"mid" :mid,"mpassword" : mpassword },
		success : function(re){
			
			if(re === '1'){
				location.href='/jspweb/index.jsp';
			}else if(re=== '2'){
				loginconfirmbox.innerHTML='아이디 또는 비밀번호가 다릅니다'
			}else if(re==='3'){
				loginconfirmbox.innerHTML='데이터베이스 오류[관리자 문의]'
			}
			else if(re==='0'){loginconfirmbox.innerHTML='존재하지 않는 아이디입니다.'}
		}
	});

}