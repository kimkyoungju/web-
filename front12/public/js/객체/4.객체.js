/**
 * 
 
 
 		객체지향 프로그래밍
		클래스[객체 설계도]
		객체[object]
		
			객체 멤버
		1.변수[데이터1개],상수[데이터1개],(object) = 배열[object],함수[function]
	예)
		자동차 = 객체				붕어빵 틀 = 설계도
			핸들 = 객체				붕어빵= 객체
			의자 = 객체
			엔진 = 객체
			
		
 */  	/*1. 객체선언
		//객체명 = {
			속성1[key : value],
			속성2[key: vlaue],
			메소드 :function(){}} 	
				*/
	//2.객체내 속성/메소드 호출[.연산자]
	//	객체명.key
	//객체명.메소드() :메소드 이기 때문에 매개변수[인수] ()필요

const object ={
	name: '혼자공부하는 파이썬',
	price : 18000,
	pulisher :'한빛미디어'
}

//2. 속성확인 하는 방법  
if(object.name !==undefined){ //만약에 객체내 name속성이 있는지
		//===같다 !==같지 않다.
		console.log('name 속성이 있습니다')
}else{
		console.log('name 속성이 없습니다')
}
//////////////////////
if(object.author !== undefined){
	console.log('속성이 있습니다')
	
}else{
	console.log('속성이 없습니다')
}


//293
	//삼향(항이 3개) 연샂나
	//조건(논리) ? 참 : 거짓 참 거짓 하나만 있을때는 삼항 연산자 가동
object.name =object.name !== undefined ? object.name :	'제목 미정'
		//[조건]  object.name == undefined 
			//[참] '제목미정'
			//[거짓] object.name //기존그대로

object.author = object.author !==undefined ? object.author :'저자 미상'

//객체 출력
console.log(object)

// p 294 
let arrat = [1,2,3 ]; /*배열의 원형*/
/*
let[a,b] = [1,2] //배열의 다중할당

console.log(a)

console.log(b)


[a,b] =[b,a]
console.log(a)
console.log(b)
*/
let arrayA =[1,2,3,4,5]
const [a,b,c] = arrayA
console.log(a,b,c)
//295
const{name,price} = object
	//object 객체내 속성 꺼내기-> 변수에 저장
	console.log(name)
	console.log(price)
	
const{n=name, p=price} = object
	//object 객체내 속성 꺼내기-> 변수에 저장
	console.log(name)
	console.log(price)
