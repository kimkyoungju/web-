/*
 
 	함수: 미리정의된 코트
 			기본형태 :1.매개변수 2.정의코드 3.리턴값
			사용목적 :1.재활용 	 2.메모리효율성 3.매개변수에 따른 서로 다른 리턴값
			모양 : function 함수명 (매개변수~) {정의코드 return 리턴값}
			 	매개변수(인수) : 함수 안으로 들어오는 수[데이터 /변수]  (선택사항)
			 		-변수, 상수 , 배열, 함수 결론은 자료형이면 다가능
			 	
			 	리턴값(반환) : 함수 밖으로나가는 수 				 (선택사항)
			**함수도 자료형이다~~[object-> 1.array 2.function ]
	
	1.익명함수 : 이름이 없는 함수
		function (){}
	2.선언적함수 : 일반 함수  		 
		function 함수명 (){}
	3.나머지 매개 변수 : (...매개변수){} 매개변수가 고정적이지 않는 함수	->배열
		function  함수명(...매개변수){}
	4.기본매개변수 : 매개변수의 초기값 설정
		function  함수명(매개변수=값){}
	5.콜백함수: 함수도 자료형이기때문에 매개변수로 전달이 가능하다.
	function 함수명 (매개변수){
		
	}
	function 함수명2(){}
	함수명(함수명2)
	6. 화살표 함수 : function생략
			(매개변수)=> 결과
			
	
		  	*   
		  	 미리 만들어진 콜백 사용하는 배열내 함수들
		  		forEach() : 반복문
				map()		: 새로운 배열 생성 [return 값을 새로운 배열 저장]
				filiter() :새로운 배열 생성 [return true인 경우에만 값을 새로운 배열 저장]
	
 */
 
 	//226 화살표 함수 :
 	//function 생략 return 생략
 	//(인수) => 결과
 	 /*
 	메소드 체이닝(결과 연결) 사용하지 않을때
 			//배열명.메소드1(),메소드2() : 메소드1 결과를  가지고 메소드2실행		
 			*/
 	
 	
 	
 	let numbers = [0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ,9]
 	/*numbers .filter( ( value) => value % 2 == 0)
 			.map( (value) => value *value )
 			.forEach( (value) => console.log(value))*/
 	
 	
 	
 	let array1 =numbers.filter((value)=> value % 2 == 0)
 	console.log('짝수배열 :' +array1)
 	let array2 = array1.map((value)=> value*value)
 	console.log("")
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	