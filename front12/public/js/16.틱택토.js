/*틱택도(삼목)
1.게임판 구현
2.버튼 누림 기능
3.사용자(선택)vs컴푸터(랜덤)
4.승리자 판단

---------
함수
function 함수명 (매개변수, 매개변수2){코드}
*/
게임판그리기()//함수실행
//1.게임판 출력하는 함수
function 게임판그리기(){
	//function 함수 만들기 키워드
	//게임판 그리기 이름으로 함수 선언[매개변수x 리턴값x]
	let 게임판 = ''//여러개 버튼(tag)을 저장하는 변수
	for( let i = 0; i<9 ; i++){//i는 0부터 8까지 1씩증가 반복한다
		게임판 += `<button id=${i} onclick=버튼선택(${i}) >${i}</button>`
		//게임판 변수에 버튼(tag)을 누적더하기
		if( i % 3 == 2){ 게임판 += '<br>'}
		//3배수 찾기 2 5 8 일때 줄바꿈처리
	}
	//문서의 (html)의 id가 gameboard의
	document.getElementById('gameboard').innerHTML = 게임판
}

//2.위치선택함수
function 버튼선택( i ){
	alert( i +'버튼눌림')
	//사용자 선택한 버튼의 id의 html-> o 변경
	document.getElementById( i ).innerHTML = 'o'
	//[컴퓨터]난수 발생
	//math //math : 수학 관련 메소드 제공하는 클래스
	let rand = Math.floor(Math.random())* 9
		//math . floor //내림	 math. rounf()반올림 math.ceil()올림
	alert( '난수 : ' +rand )
	document.getElementById(rand).innerHTML = 'x'
}
//3.게임상대(상황)함수
function 상황출력(){}
//4. 게임결과 함수
function 게임결과(){}