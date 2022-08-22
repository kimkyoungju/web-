/**
 	학생 점수 프로그래밍
 	
 		1. 학생 객체 선언!
 		2. 점수등록을 했을때 html에서 입력받은 데이터로 js객체에 저장
 			학생이름 중복체크 함수
 				- 
 			2-1. retrun 이 함수 저장
 			2-2. html 초기화
		3.학생점수출력
			-처음 열렸을때
			-등록할떄 마다 
 
 */
  //1.객체
 let studentlist = []
 학생출력()
 순위 = ''
 function 점수등록(){
 	//1.객체	
 const student ={
	//문자열을 숫자열로 변경 
	name : document.getElementById('name').value, //이름속성 [키 :값]
	kor : Number( document.getElementById('kor').value ),		//국어속성		
	eng : Number(document.getElementById('eng').value), 		//영어속성
	mat : Number(document.getElementById('math').value)		//수학속성
		}
		//배열에 저장하기[학생등록전]에 중복체크
		if(이름중복체크(student.name)){ //이름중복체크 함수에는 
			return //함수종료하는 의미로 리턴이 될경우에는 아래코드는 실행 되지 않는다
		}
		//객체를 배열에 담기
	
	
	studentlist.push(student)
		//배열명.push(데이터) : 배열에 데이터 추가	
		//알림 
	alert('점수등록이 되었습니다')
	console.log(student)
	document.getElementById('name').value=''
	document.getElementById('kor').value=''
	document.getElementById('eng').value=''
	document.getElementById('math').value=''
	
	학생출력()//5.삭제할때마다 테이블 재 호출
	 
}

function 이름중복체크(name){ //학생 이름 중복체크 함수
	for(let i=0; i<studentlist.length; i++){
			//i는 0부터 i는 배열길이 [배열내 객체수]미만까지 1씩 증가 반복
			if(studentlist[i].name === name){
			//배열내 i번쨰 인덱스의 객체 내 이름이 새로 받은 이름과 같으면	
			alert('중복')
			return true 
			}	
		}return false // 배열내 동일한 이름이 없다 
	}
	
	
function 학생출력(){
		//1.변수에 html태그[문자열]을 저장하기
	
	let html = '<tr>'+
				'<th>등수</th>' +
				'<th>학생명</th>' +
				'<th>국어</th>' +
				'<th>영어</th>' +
				'<th>수학</th>' +
				'<th>총점</th>' +
				'<th>평균</th>' +
				'<th>비고</th>'+
				'</tr>'
				
	// 배열내 객체들을 하나씩 꺼내오기 -> 객체 정보를 thml화 식별 	
		for(let i= 0 ; i<studentlist.length; i++){
			let 총점 = studentlist[i].kor + studentlist[i].eng + studentlist[i].mat
			let 평균 = Math.floor(총점/3) 
			let 등수 = Math.max(총점.max&&평균이.max) //총점이 제일 높은 사람이 1등 
			html += '<tr>'+
						'<th>'+등수+'</th>' +
						'<th>'+studentlist[i].name+'</th>' +
						'<th>'+studentlist[i].kor+'</th>' +
						'<th>'+studentlist[i].eng+'</th>' +
						'<th>'+studentlist[i].mat+'</th>' +
						'<th>'+총점+'</th>' +
						'<th>'+평균+'</th>' +
						'<th><button onclick="학생삭제('+i+')">삭제</button></th>'
					'</tr>'
					
					//변수는 문자처리 x
						//변수는 앞전에 미리 정의된 단어 [키워드 = 컴퓨터가 알고 있는단어]
		}
			
		//해당 변수를 html에 출력하기		
	document.getElementById('board').innerHTML = html		
}	
	
function 학생삭제(i){ //학생 삭제하는 함수 [매개변수 : 삭제할 식별번호(배열내 저장된 순서번호=인데스)]
	alert(studentlist[i].name + '님이 삭제버튼을 눌렀습니다.')
	studentlist.splice(i,1)	//i번째 인덱스의 객체 1개 삭제
	학생출력() //5.삭제할때마다 테이블 재 호출
	}
	
/*function 순위(name){
	for(let i=0; i<=학생출력(); i++){
		if(총점.max && 평균.max){//만약에 총점이 제일 높은 사람이 순위 1
			alert('1등 축하')
			return
		}
	}
	
	
}*/