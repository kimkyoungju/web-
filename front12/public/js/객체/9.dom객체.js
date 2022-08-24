/**
 * 
 */
 
 
 //320

//1 js태그생성------->				태그에 h1입력					
const header = document.createElement('h1')

//2	객체 텍스트 조작
header.textContent = 'js에서 만든 태그'
header.style.color ='white'	 // 글색
header.style.backgroundColor = 'black'		// 배경검정

//3 해당 태그에 하위태그로 객체를 추가 
document.body.appendChild(header)



//p.321 			정적을 동적으로 변환시키기
						//html에서 가져오기 배열
	//1.해당 id의 태그 객체 가져오기
const diva = document.querySelector('#first')
const divb = document.querySelector('#second')


const h1 =document.createElement('h1') //2. 태그(요소) 만들기
h1.textContent='이동하는 h1태그'	//3.js에서 만든 태그에 텍스트 넣기

const tofirst = () =>{
	diva.appendChild(h1)		//4첫번째 div엣 js만든 태그추가
	setTimeout(tosecnd , 2000)	//5 n초 뒤에 다른 코드(tosecnd) 함수 실행
}
const tosecnd = () =>{
	divb.appendChild(h1)
	setTimeout(tofirst , 2000) //6 n초 뒤에 다른 코드 실행 (tofirst) (다른코드 , 초)
}

tofirst()




//익명함수
/*  
const tosecond = ()=>{
	divb.appendChild(diva)
}
//3.타이머 함수 ( 함수 (),밀리초 (1000/1초))
setTimeout( tosecond , 3000)*/



//.322 객체제거
const h2 =document.querySelector('h2') 	// h2라는 변수명 가져오다 html에서 h2
	
//1. 타이머함수 :setTimeout(함수, 밀리초)	
//2. 문서객체 , removechild(자식객체)
//3. 부모찾기 : 문서객체 , 문서객체. parentnode(문서객체)	
	//방법 1	 = 한번쓰고 버릴때 1회용 && 콜백함수 쓰는 애들
	 
setTimeout( ( )=> {
	
		
	h2.parentNode.removeChild(h2)
		//parennode 부모를 뜻함

} ,3000)	
	//방법2 = 재활용 가능 
	//방법 1과 다른게 없다
const remove =() =>{h2.parentNode.removeChild(h2)}
setTimeout(익명함수,300)
	//방법2 1과 2와 다를게 없다 
function 함수 (){
	//	h2.parentNode.removeChild(h2)	//부모가 누군지 모를때는 parentnode 사용 
	document.body.removeChild(h2)	 // 바디라는 곳에서 h2 제거
}
setTimeout(익명함수,300)
//콜백함수는 함수안에 함수 (화살표함수)
//=() =>{}