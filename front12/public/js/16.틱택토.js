/*틱택도(삼목)
1.게임판 구현
2.버튼 누림 기능
3.사용자(선택)vs컴푸터(랜덤)
4.승리자 판단

---------
함수
function 함수명 (매개변수, 매개변수2){코드}
*/
/*게임판그리기()//함수실행
//1.게임판 출력하는 함수
function 게임판그리기(){
	//function 함수 만들기 키워드
	//게임판 그리기 이름으로 함수 선언[매개변수x 리턴값x]
	let 게임판 = ''//여러개 버튼(tag)을 저장하는 변수
	for( let i = 0; i<9 ; i++){//i는 0부터 8까지 1씩증가 반복한다
		게임판 += `<button id=${i} onclick=버튼선택( ${i} ) >${i}</button>`
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
function 게임결과(){}*/
let 게임상황 = []//현재 알을 둔 상황을 저장하는 배열
let 승리 = ''//이긴알을 저장하는 변수
//게임판 버튼을 만들어주는 함수
function 게임판그리기(){//s
	승리 = ''//초기화 변수를 공백으로 초기화
	게임상황 = [null,null,null,null,null,null,null,null,null]//배열에 9개 null로 초기화
	let 게임판 = ''
	for( let i = 0 ; i<9 ; i++){//s
		//i는 0부터 9 미만까지 1씩증가
		게임판 += `<button id=${i} onclick='버튼선택(${i})'>${i}</button>`
		if( i % 3 == 2){게임판+= `<br>`}//e
	}//s
	//html태그 호출
	document.getElementById('gameboard').innerHTML=게임판	
}//e



//2. 버튼을 눌렀을때 이벤트 함수 {i는= 선택한 버튼 번호}
function 버튼선택( i ){//s
	//선택한 번호의 모양 변경
	
		
		if( 중복검사(i) ){//s
			alert('안내 :이미 둔 자리 입니다.') 
			return
		}//e//함수호출해서 해당 위치에 알이있으면 함수 종료 체크[!:qnwjd]
		
		document.getElementById( i ).innerHTML='o'
		게임상황[i] = 'o'
		
		if(게임결과()){//s
			alert('게임종료승리 : ' + 승리)
			return
		}//e
	
		//2.해당알을 배열에 저장
	// 난수 발생
	 while( true ){//whiles//while (true): 무한루프 [종료조건: 랜덤위치에 알을 두었을때 반복 종료]
		let rand = Math.floor (Math .random()*9) //0~8사이의 난수 발생
		if(!중복검사(rand)){//s
			document.getElementById( rand ).innerHTML='x'
			게임상황[rand]='x'
			break //while 탈출
	      }//e
 	}//whilee
 	if(게임결과()){//if s
			alert('게임종료승리 : ' + 승리)
			return
	 	}//if e
 }//while e

	//3.현재 위치에 알이 있는지 검사하는 함수 [중복검사]
	function 중복검사( i ){//s
		if( 게임상황[ i ] != null){ //if s //배열은 모두 null로 초기화 했기 때문에 null아니면 o또는x가존재하는 의미
			return true //알이있다.
			}else{//else s
				return false ///알이 없다
			}//else e
		}e
	//현재상황에 따른결과판단 함수
	function 게임결과(){ //s
		//1.가로로 이기는 수		[012,345,678]
		for( let i=0; i<=6;i+=3){ //for e
		 	//i는 0 부터 6까지 3씩 증가 반복 [3회반복 0 3 6 ]
		 	if(게임상황[i] !=null && 게임상황[i]== 게임상황[i+1] && 게임상황[i+1]== 게임상황[i+2]){//if s
		 		//&&이면서 모두 그리고
		 		//i가 0일 때 0==1 ==2 //i가 3일때 3==4==5 i가 6일때 6==7==8
		 		승리 = 게임상황[i]//승이 변수에 i번째 알 저장
		 		return true //가로로 승리가 나왔을때 경우 함수 종료
		 	}//if e
		 }//e
		//2.세로로 이기는 수		[036,147,258]
		for(let i = 0; i<=2; i++){ //for s
			if(게임상황[i] !=null && 게임상황[i] == 게임상황 [i+3] && 게임상황[i+3] == 게임상황[i+6] ){//if s
				승리 = 게임상황[i]//승이 변수에 i번째 알 저장
		 		return true //가로로 승리가 나왔을때 경우 함수 종료
		 		}//if e
			
		}//for e
		//3. 대각선으로 이기는 수	[048,246]
		//4 무승부				[위 상황이 아니면서 알이 9개 이면 ]
	}//e
