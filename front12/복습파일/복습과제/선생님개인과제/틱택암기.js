/**
1.버튼판 구현
2. o ,x구현 '중복검사 추가'
3. 중복 검사 
4. 승리 조건 추가
 */
let 무승부 = ''
let 게임상황=[]
let 승리 =''
function 게임판그리기(){
	let 게임판=''
	게임상황=[null,null,null,null,null,null,null,null,null]
	for(let i=0; i<9; i++){
		게임판 += `<button id=${i} onclick='버튼선택(${i})'>${i}</button>`
		if(i %3 ==2 ){게임판+=`<br>`} //게임상황은 2 마다 내림
		}document.getElementById('gameboard').innerHTML =게임판
}

//버튼 선택

function 버튼선택(i){
	if(중복검사(i)){ 
		alert('중복입니다')
		return
	}
	
	document.getElementById(i).innerHTML = 'o'
	게임상황[i]='o'
	
	if(게임결과()){
		alert('승리'+승리)
		return
	}

	while(true){
		let 랜 = Math.floor(Math.random()*9)
			if(!중복검사(랜)){//만약에 중복검사가 아니면 랜은 둔다 
				document.getElementById(랜).innerHTML='x'
				게임상황[랜]='x'
				break
			}
		
	}
	if(게임결과()!=null&&게임상황[i]){
		alert('무승부입니다')
		return
}
 
}




//중복검사

function 중복검사(i){
	if(게임상황[i]!=null){
		return true
	}else{
		return false
	}
}

function 게임결과 (){
	for(let i=0; i<=6; i+=6){
		if(게임상황[i] !=null &&게임상황[i]==게임상황[i+1]&&게임상황[i+1]==게임상황[i+2]){
			승리=게임상황[i]
			return true
		}
	}for(let i=0; i<=2; i++){
		if(게임상황[i] !=null &&게임상황[i]==게임상황[i+3]&&게임상황[i+3]==게임상황[i+6]){
			승리=게임상황[i]
			return true
		}
	}
}



	