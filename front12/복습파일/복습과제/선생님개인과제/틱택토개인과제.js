/*삼목
1.게임판구현
2.버튼눌림
3.사용자(선택)vs컴퓨터(난수)
4.승리자 판단
*/


let 승리=''
let 게임상황=[]
function 게임판그리기(){
		
		let 게임판=''
		게임상황=[null,null,null,null,null,null,null,null,null]
		승리 = ''
		for(let i = 0; i<9; i++){
			게임판+=`<button id=${i} onclick='버튼선택(${i})'>${i}</button>`
			if(i % 3==2){게임판+=`<br>`}
		}
		document.getElementById('gameboard').innerHTML = 게임판
}
function 버튼선택( i ){
	
	if (중복검사(i)) {
		alert('중복입니다.')
		return
	}
	document.getElementById(i).innerHTML = 'o'
	게임상황[i] = 'o'
	
	if(게임결과()){
		alert('승리입니다.:'+승리)
		return
	}

	while (true) {
		let 난수 = Math.floor(Math.random() * 9)
		if (!중복검사(난수)) {
			
			document.getElementById(난수).innerHTML = 'x'
			게임상황[난수] = 'x'
			break
		}

	}
	if(게임결과()){
		alert('승리입니다.:'+승리)
		return
	}
	
}
function 중복검사(i){
	if(게임상황[i] !=null){
	   return true
	}else{
		return false
	}
}

function 게임결과(){
	for (let i = 0; i<=6; i+=3){
		if(게임상황[i]!=null && 게임상황[i]==게임상황[i+1]&&게임상황[i+1]==게임상황[i+2] ){
			승리 = 게임상황[i]
			return true
		}
	}


	for(let i=0; i<=2; i++){
		if(게임상황[i]!=null && 게임상황[i]==게임상황[i+3]&&게임상황[i+3]==게임상황[i+6]){
		 	승리 =게임상황[i]
		 	return true
		 	}
		}
	for(let i=0; i<=8; i+=2){
		if(게임상황[i]!=null &&게임상황[i]==게임상황[i+2]&&게임상황[i+2]==게임상황[i+8]){
			승리=게임상황[i]
			return true
		}
	}
	
}





