/**

*/ 
 //1.
 let counter = 0 	//클릭수를 저장하는 변수     				1. 처음에는 0이였다가
 let isconnect = false //연결상태를 저장하는변수	
 	
 	//요소 객체들
 	const h1 =document.querySelector('h1')	 //요소 가져오기	2.document.querySelector로 문서에서 h1이란 태그 가져온다
	const p =document.querySelector('p')
	const connect_btn =document.querySelector('#connect')
	const disconnect_btn =document.querySelector('#disconnect')
	const plus=document.querySelector('#plus')
	const minus=document.querySelector('#minus')
	//출력하는 함수
	const listaner = () =>{h1.textContent = `클릭횟수: ${++counter}`}
	const lisminus = () => {h1.textContent = `클릭횟수: ${--counter}`}
	//1. 연결버튼을 클릭했을떄 
	connect_btn.addEventListener('click',()=>{
		if(isconnect == false){ //만약에 연결이 안되어 있으면
				//h1태그에 클릭 이벤트 추가
			p.textContent = '이벤트 연결 상태 : 연결' 	//pㅌ태그에 내용넣기
			isconnect = true 	//연결했다는 의미로 연결상태 변수에 true 로 변환
		}
	})
	//2.연결해제 버튼을 클릭했을떄
	disconnect_btn.addEventListener('click',()=>{
		if(isconnect == true){	//is 커넥트는 투르이다 
			h1.removeEventListener('click',listaner)	//h1태그에서 크릭하면 이벤트 제거
			p.textContent = '이벤트 연결 상태 : 해체'
			isconnect = false
		}
	})
	minus.addEventListener('click',()=>{  //플러스를 클릭하였을때
		if(isconnect == true){	//만약에 연결이 되어있으면
			h1.removeEventListener('click',listaner)
			h1.addEventListener('click',lisminus)	//h1 태그에 카운터 를 1씩 추가한다
			p.textContent = '감소를 선택하였습니다'
			isconnect = true
		}
	})
	plus.addEventListener('click',()=>{  //플러스를 클릭하였을때
		if(isconnect == true){	//만약에 연결이 되어있으면
			h1.removeEventListener('click',lisminus)
			h1.addEventListener('click',listaner)	//h1 태그에 카운터 를 1씩 추가한다
			p.textContent = '증가를 선택하였습니다'
			isconnect = true
		}
	})

/*
//객체명.  addEventListener('이벤트명', 콜백함수)
	//해당 객체의 이벤트 발생했을때 콜백함수 실행된다
h1.addEventListener('click',(event)=>{
		counter++	//변수 1 증가 
		h1.textContent = `클릭횟수: ${counter}`
})


//2번째 방법
h1.addEventListener('click', 함수)

function 함수 () {
	counter++	//변수 1 증가 
		h1.textContent = `클릭횟수: ${counter}`
}
//2.html 에서 클릭 이벤트 속성 이용한다 .
function 함수(){
	counter++	//변수 1 증가 
		h1.textContent = `클릭횟수: ${counter}`
} */