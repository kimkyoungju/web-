/*삼목
1.게임판구현
2.버튼눌림
3.사용자(선택)vs컴퓨터(난수)
4.승리자 판단
*/





function 게임판그리기(){ //fun s
   let 게임판=''
   let 게임상황=[null,null,null,null,null,null,null,null,null]
   for(let i = 0; i<9; i++ ){ //for s
	 게임판 +=`<button id=${i} onclick=버튼선택(${i})>${i}</button>`
	 if(i % 3== 2){게임판+=`<br>`}
	}//for e
	document.getElementById('gameboard').innerHTML = 게임판
}//fun e
function 버튼선택(i){//fun s
	 if(중복검사(i)){//if s
		alert('이미둔자리입니다.')
		return
	}//if e
	 document.getElementById(i).innerHTML ='o'
	게임상황[i] = 'o'
}//fun e
function 중복검사( i  ){
	if( 게임상황[i] != null ){ // 배열은 모두 null로 초기화했기때문에 null 아니면 'O'또는'X'가 존재하는 의미 [ 알이 있다. ]
		return true // 알이 있다.  null 이 아니면 
	}else{
		return false // 알이 없다.  null 이면 
	} 
}

//선생님 한테 질문 : 이해를 위해 중복검사 버튼을 다시 눌렀을떄 중복이 뜨는 순서와 과정
//모든 해석의 순서 