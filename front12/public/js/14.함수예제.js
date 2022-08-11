 function isLeapYear (year){
	//isleapyear 이라는 함수명으로 year 매개변수로 받는다.
	return ( year%4==0) && (year%100 != 0) || (year % 400=0)
	//      4dml qotn %%이면서  100배수 아닌
} 	//변수와 문자열 같이 출력하는 방법
	//1. '문자열'+변수명
	//2. `문자열 ${변수명/함수()}`

console.log(`2020은 윤년일까? === ${isLeapYear(2020)}`)
console.log(`2020은 윤년일까? === ${isLeapYear(2010)}`)
console.log(`2020은 윤년일까? === ${isLeapYear(2000)}`)
console.log(`2020은 윤년일까? === ${isLeapYear(1900)}`)

function 윤년버튼함수(  ){
	
	//윤년버튼 함수 라는 함수명으로 매개체변수가 
alert('버튼이눌렸다')
let 연도 = Number(prompt('연도를 입력:'))
let 결과 = isLeapYear ( 연도 ) //함수 호출 : 함수명(매개변수)
console.log('입력한'+연도 ' 는 윤년일까?' +결과)
 	document.getElementbyId('resultbox').innerHTML = '안녕'
 	//document : 문서
 		//get:가져오기
 	//Element : 요소(태그)
 		//id : 삭별자이름
 		 	//innerhtm : html작성
}
 