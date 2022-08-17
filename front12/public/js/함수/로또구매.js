/**
 
 로또 구매 
    1. 6개버튼 선택한다.
    	조건: 한번클릭(선택) 두번클릭(취소) 2.최대 6개
    2.컴퓨터 추첨번호[1~45난수] 생성
    3.사용자 추첨번호 비교결과
 
 
 */
 //전역변수 vs 지역변수
 //변수는 지역변수 특징 = {}안으로 들어갈수 있다.{}밖으로 못나감
let select_numbers = [ ] //내가 선택한 번호 리스트 //여러곳에서 호출(사용) 예정이기 때문에
let lotto_numbers = [ ] //컴퓨터난수
 //1. 버튼 만들기 함수
 function btn_print( ){
	let btnlist = '' //1~45의 버튼을 저장하는 변수
	for(let i = 1; i<=45; i++){
		//i는 1부터 45까지 1씩 증가 반복
		btnlist += `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		
		//i가 5의 배수이면 줄바꿈
	if(i % 5 == 0 ){btnlist+='<br>'}
	}//for e
	//현재문서의 btnbox 라는 if 갖는 태그표출해서 html에 변수 대입
	document.getElementById('btnbox').innerHTML = btnlist;
}
 //2. 버튼 눌렀을때 함수 [매개변수 : i-> 내가 클릭한 버튼의 순서]
 function btn_click( i ){
	//배열내 존재하는 숫자이니 확인
		let index = select_numbers.indexOf( i )
		if(index >=0){ //선택한 수가 배열내 존재하면
		//배열명.indexof(데이터) : 배열내 해당 데이터의 인덱스 검색
					// 해당 데이터가 존재하면 찾은 인덱스 출ㄺ
					//없으면 -1
		
		 alert('이미 선택한 번호입니다.[취소]')
		 select_numbers.splice(index , 1)//배열명 .splice( 삭제할인덱스, 개수)
		}else{//선택한 수가 배열내 존재하지 않으면 
		//배열내 개수 체크
		if(select_numbers.length == 6){
			alert('더이상 선택할수 없습니다')
			return// 함수 종료 [아래코드 실행 x]
			}
			//선택한 번호 배열 저장
		select_numbers.push(i) //배열명.push(데이터) 배열에 데이터 추가
		}
		document.getElementById('selectbox').innerHTML = select_numbers
 }
//3.추첨번호 생성 함수
function lotto_number(){
	if(select_numbers.length != 6){
		alert('6개 수를 모두 입력후 추첨 해주세요')
		return //함수종료 [아래코드 실행x]
	}
	//난수 생성[1~45]
	while(true){//무한루프[추첨번호가 6개되면 종료]
	 											 //Math.random 0~1 사이의 난수 생성
	 	let rand = Math.floor( (Math.random()*45)+1) //(Math.random()*끝값)+시작값 :시작값~끝값 사이의 난수 발생
		let index = lotto_numbers.indexOf(rand)  	//Math.floor (난수)
		if(index == -1 ){ //존재하면
			if( lotto_numbers.length == 6){ //if s
				break //가장 반복문 탈출	
			}else{//else s//배열내 수가 6개가 아니면 해당 난수를 배열에 저장
				 lotto_numbers.push( rand )
			} //else e
		}// if e
	} //while e
	 //html 화면 태그에 출력
	document.getElementById('lottobox').innerHTML = lotto_numbers
		//결과함수 출력
		lotto_result()
}

//4. 추첨 번호 비교 결과 함수
function lotto_result(){
	let count = 0 //배열내 총 동일한 숫자의 개수
	let result_numbers = select_numbers.filter((value)=>lotto_numbers.includes(value))
	count = result_numbers.length
	let msg='' //출력할 메시지를 저장하는 변수
	if(count == 0){msg += '꽝'}
	else if (count == 1){msg +='1개 맞았습니다.' +result_numbers}
	else if (count == 2){msg +='2개 맞았습니다.5등'+result_numbers}
	else if (count == 3){msg +='3개 맞았습니다.4등'+result_numbers}
	else if (count == 4){msg +='4개 맞았습니다.3등'+result_numbers}
	else if (count == 5){msg +='5개 맞았습니다.2등'+result_numbers}
	else if (count == 6){msg +='6개 맞았습니다.1등'+result_numbers}
	document.getElementById('resultbox').innerHTML = msg 
}










