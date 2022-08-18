


let select_numbers = [ ] //내가 선택한 번호 리스트 //여러곳에서 호출(사용) 예정이기 때문에
let lotto_numbers = [ ] //컴퓨터난수
 //1. 버튼 만들기 함수
 function btn_print( ){
	let btnlist = '' 
	for(let i = 1; i<=20; i++){
		
		btnlist += `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		
		//i가 5의 배수이면 줄바꿈
	if(i % 5 == 0 ){btnlist+='<br>'}
	}//for e
	
	document.getElementById('btnbox').innerHTML = btnlist;
}
 //2. 버튼 눌렀을때 함수 [매개변수 : i-> 내가 클릭한 버튼의 순서]
 function btn_click( i ){
	//배열내 존재하는 숫자이니 확인
		let index = select_numbers.indexOf( i )
		if(index >=0){ 
		 alert('취소하겠습니다')
		 select_numbers.splice(index , 1)//배열명 .splice( 삭제할인덱스, 개수)
		}else{//선택한 수가 배열내 존재하지 않으면 
		//배열내 개수 체크
		if(select_numbers.length == 1){
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
	if(select_numbers.length != 1){
		alert('원하시는 층을 선택해주세요')
		return //함수종료 [아래코드 실행x]
	}
	
	while(true){
	 											
	 	let rand = Math.floor( (Math.random()*20)) 
		let index = lotto_numbers.indexOf(rand)  	
		if(index == -1 ){ 
			if( lotto_numbers.length == 1){ //if s
				break //가장 반복문 탈출	
			}else{//else s
				 lotto_numbers.push( rand )
			} //else e
		}// if e
	} //while e
	 //html 화면 태그에 출력
	document.getElementById('lottobox').innerHTML = lotto_numbers
		//결과함수 출력
		lotto_result()
}










































/**
버튼을 누른다


현재 층을 나타낸다


 * 
 */
 
 
 

/*let 위치 = ''
 
 const
 */
 
 /*
 let count = ''
 let 층 = setInterval ( ()=>{
	 console.log(`${count}:층입니다.`)
	 count++
	
	 if (count == 5) { //5초후 타이머 종료
		 console.log(`${count}:층입니다.`)
		 clearInterval(층)}
		 
		 
		 }, 1 * 1000) //1곱하기 1000=1초
	*/	
 /*
 let count = 0
 let 현재층 = document.getElementById('up').innerHTML
	 	for(let i = 0 ; i<=현재층; i++){
	 		for(let b = 1; b<=현재층-i; b++){
	 			console.log(`${count}:층입니다`)	
	 		} if (count == 5) { //5초후 타이머 종료
		 console.log(`${count}:층입니다.`)
		 clearInterval(층)
	 	}
	 }	
	 */
	
	/*
	
	let count = ''
	let 현재상황 =[]
	let 버튼상황 =[] 
	let lotto_numbers = [ ]
	function 버튼클릭(){
		let 버튼상황1 = [null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null]
		let 번호판 =''
		for(let i=1; i<21; i++){
			번호판 += `<button id=${i} onclick='버튼선택(${i})'>${i}</button>`
			if( i % 5 == 0  ){번호판+= `<br>`}
		}
		document.getElementById('btn_num').innerHTML = 번호판
		
	} 
	function lotto_number(){
	if(select_numbers.length != 6){
		alert('6개 수를 모두 입력후 추첨 해주세요')
		return //함수종료 [아래코드 실행x]
	}
	//난수 생성[1~45]
	while(true){//무한루프[추첨번호가 6개되면 종료]
	 											 //Math.random 0~1 사이의 난수 생성
	 	let rand = Math.floor( (Math.random()*20)+1) //(Math.random()*끝값)+시작값 :시작값~끝값 사이의 난수 발생
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

	
	
	//현재 엘베 층수가 나올려면 i 을 난수로 두고 버튼을 누르면 오름 or 내림 
	
	
	/*function 버튼선택( ){
	while( true ){ 
		let rand = Math.floor( Math.random()*20 )	// 0~8 사이의 난수 발생 
		{ // 해당 위치에 알이 없으면
			document.getElementById( "result" ).innerHTML = i // 버튼 모양 변경  
			현재상황[rand] = Number// 해당 알을 배열에 저장 
			break // while 탈출
		}// if end 
	} // while end 
	
	
	
		
	}
	//function 버튼선택 (i){
		//if(층수결과(i))
		
		function btn_click( i ){
	
		let index = count.indexOf( i )
		if(index >=0 ){
		
					
		
		 alert('이미 선택한 번호입니다.[취소]')
		
			}
				
		}*/
	
 
	