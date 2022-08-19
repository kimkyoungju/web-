/**
 * 
 
  
 */
 
 //257  : 배열도 객체이다
 const a = [] //1배열선언
 console.log(a)
 a.sample =10	// 2.배열에 속성추가
 console.log(a.sample)
 
 //함수도 객체이다.
 function b(){} //1.함수선언
 b.sample = 10	//2.함수에 속성 추가
 console.log(b.sample)
 
 //기본자료형 		[숫자형 객체가 아니다]
 const c =273 	 //1.상수선언
 c.sample = 10	//2. 상수에 속성추가
 console.log(c.sample)
 
 //기본자료형
 const d='안녕하세요' //1.상수(문자열)선언
 d.sample = 10		//2.상수에 속성 추가
 console.log(d.sample)
 
 //p.277 :수학함수 : math 객체
 	//math.random () :0<= 결과 <1
 	//math.random ()*10 :0<= 결과 <10
 	//math.random ()*10 -5 :-5<= 결과 <5
 	//math.random ()*10 -5 :-25<= 결과 <25
 	//결과물 ---> 실수 (소수점)----소수점없애기--> 정수 만들기(Math.floor(실수))
 const num = Math.random()
console.log('0~1사이의 랜덤한 숫자' ,num)  
console.log('0~10사이의 랜덤한숫자',num*10)
console.log('0~50사이의 랜덤한숫자',num*50)
console.log('-5~5사이의 랜덤한숫자',num*10-5)
console.log('-5~5사이의 랜덤한숫자',num*50-25)