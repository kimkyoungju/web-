/*
 
 		함수 : 미리 정의된 코드집합
		 alert promprt -> js 내장함수
		 
		함수 정의 : 
				function 함수명 (매개변수 1,  매개변수 2 ~~) {
					실행코드
					return 리턴값
				}
			함수 호출
				js : 함수명 (매개변수1 , 매개변수 2~)
				html : tag 속성내 이벤트 속성->
 						onclick :클릭했을떄
 						onclick = " 함수명 (매개변수1, 매개변수2)"

 */
//1.매개변수x리턴값x 함수 정의
function 함수1() {
	alert('돌머리노 ㅋ')
}
//2.매개변수o 리턴값 x 함수정의
function 함수2(value) {
	alert('정답 :' + value)
}
//3. 매개변수o리턴값o함수정의
function 함수3(value1, value2) {
	alert('바보쉐키 :' + value1 + value2)
	return value1 + value2
}
//4. 매개변수x리턴값o함수정의
function 함수4() {
	alert('멍청이 ㅋ')
	return 10
}

//호출
함수1() //js에서 정의된 함수 호출
함수2(50) //함수 호출시 매개변수 전달js
let result = 함수3(3, 5)
let result2 = 함수4()




//204 최소값을 구하는 함수
 	//min 이름으로 함수 선언하는데 매개변수 array
function min(array){
	let output = array[0] // array 에서 0번인덱스 호출해서 output 대임
	for( const item of array ){
		//배열에 요소를 하나씩 item에 대입반복
			//for(변수 in 배열) : 배열내 인덱스를 하나씩 대입 반복
			//for (변수 of 배열) : 배열내 요소의 값을 하나씩 대입반복
		if(output > item){ //해당값이 output보다 작으면
			output = item//output 해당 값으로 교체
		}
	}
 return output //함수가 종료되면서 함수호출했던 곳으로 반호한 [리턴]
}// f end

const tastarray = [52,273,32,103,275,24,57]//배열선언하고 7개의 값 초기화
console.log(`${testarray}중에서`)		//배열출력
console.log(`최소값 = ${min(testarray)}`) //함수결과를 출력
		//console.log(): js 내장함수 [콘솔에 메시지를 출력하는 함수]






