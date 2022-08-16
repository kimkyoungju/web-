//확인문제1


function multiplyall(a,b){
		let result=1 //1. a->b까지 모두 곱한 값을 저장하는 변수
		
		for(let i= a; i<=b; i++){
		
			// i는 a부터 b까지
			result*=i //누적 곱 //result +=i //누적합계
	}
	
	return result //함수로종료시 결과 반환
}
console.log('모두 곱한 결과 :'+ multiplyall(1 , 2))
console.log('모두 곱한 결과 :'+ multiplyall(1 , 3))


//문제 2 [익명함수선언	-> function (인수){}]
const maxvalue = function(array){
	let maxvalue = array[0] // 배열내 첫번째 값을 가장 큰값 설정
	for(let i of array){  // 배열내 요소(항목=값)하나씩i에 대입 반복
		if(maxvalue < i ){ maxvalue = i}// i의 값이 maxvalue보다 크면 maxvalue 교체
	}
	
	//for( let i in array){ array[i]}
	//for(let i; i<array.length; i++){array[i]}
	
	//배열내 요소(값)을 하나씩 출력하는 방법
	//for (let i in 배열명){:배열에서 *인덱스를 하나씩 대입반복
	//  		배열명[i]
	//}
	//for (let i of 배열명): 배열에서 *값을 하나씩 대입반복
	//for (let i; i<배열명.length; i++){
				//배열명[i]
	//}
	return maxvalue
}
console.log(maxvalue([1,2,3,4])) 

//문제 3		[가변 매개변수 함수선언->...매개변수]
const max2 = function(...array){
	let maxvalue = array[0] // 배열내 첫번째 값을 가장 큰값 설정
	for(let i of array){  // 배열내 요소(항목=값)하나씩i에 대입 반복
		if(maxvalue < i ){ maxvalue = i}// i의 값이 maxvalue보다 크면 maxvalue 교체
		}return maxvalue
	}

console.log('최대값 구하기결과2:'+ max2(1 ,2 ,3,4))

//문제4 //배열의 타입 = object
const max3 = function(array , ...array2){
	
	alert('타입확인:' +typeof (array))
	alert('타입확인:' +typeof (array2))
	let maxvalue = 0
	if( typeOf(array) == object){
		items = array
	}else if( typeOf(array2) !='Number'){
			items = array2		
	}
		

	
	//최대값 구하기 함수
	for(let i of items){  // 배열내 요소(항목=값)하나씩i에 대입 반복
	
		if(maxvalue < i ){ maxvalue = i}// i의 값이 maxvalue보다 크면 maxvalue 교체
		}
		return maxvalue
	}
console.log('최대값 구하기결과3[배열->매개변수1개]:'+ max3([1 ,2 ,3,4])) //인수2개: 배열
console.log('최대값 구하기결과3[배열->매개변수1개]:'+ max3(1 ,2 ,3,4))//인수 2개 :숫자, 배열 