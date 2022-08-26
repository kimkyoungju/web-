/**
 * 
 */
 
 
 //1. 전체 틀 잡기
 		// 문서내에서 이벤트를 추가한다. 	문서내의 컨테츠 들을 읽고 가져온다
 document.addEventListener('DOMContentLoaded',()=>{
		//1. 
		   //html에서 문서안에 있는 todo 라는 값을 추가한다
	const input =document.querySelector('#todo')	
			//html에서 문서안에 있는 todo-list 라는 값을 추가한다
	const todolist=document.querySelector('#todo-list')	
			//html에서 문서안에 있는 add-button 라는 값을 추가한다
	const addbutton =document.querySelector('#add-button')
		//
	let keycount = 0  //5. 0이라는 전역 변수 선언
		
		
		
		//2.추가할 목록 만들어 주기
			//addtodo 라는 정수 선언
	const addtodo =()=>{
			//1.논리 선언 : 만약 input에 값이 공백있다면 빈 변수와 같다면
		if(input.value.trim()===''){
			alert('할 일을 입력해주세요')	//2.할일을 입력해달라 알림
			return					//이 값은 다시 리턴
		}
	
		
		//3.js에서 html효과로 문서객체 만들기
			//1. 값 선언
				//item 이라는 상수를 선언하고 대입한다 : html에 div라는 문자열을 생성 //따라서 div는 item 
		const item = document.createElement('div')
				//checkbox 이라는 상수를 선언하고 대입한다  : html에 input라는 문자열을 생성 //따라서 input는 checkbox 
		const checkbox =document.createElement('input')
				//text 이라는 상수를 선언하고 대입한다  : html에 span라는 문자열을 생성 //따라서 span는 text 
		const text = document.createElement('span')
				//button 이라는 상수를 선언하고 대입한다  : html button라는 문자열을 생성 //따라서 button는 button 
		const button = document.createElement('button')
		
				//2.위에 만든 문서들을 식별할 키를 생성
					//1. 
						//키라는 상수선언 : 키 카운트는 위에 생성한 전역 변수를 가져옴 = 0				
				const key = keycount
				keycount += 1		//키 카운트는 1을 증가 대입한다 
				
		//4. itme 객체를 조작하고 추가
					//item이라는 div 요소값에  date key라는 값을 준다  key는 위에 선언된 상수값
				item.setAttribute('datekey', key)	 //key의 값이 요소에는 순서를 알수 없기때문에 date key라는 명을 주고 키의 권한을 넘긴다
					//item 이라는 div에 checkbox라는 자식 요소를 추가한다  	=> <div>checkbox</div>
				item.appendChild(checkbox)
					//item 이라는 div에 text라는 자식 요소를 추가한다  	=> <div>text</div>
				item.appendChild(text)
					//item 이라는 div에 button라는 자식 요소를 추가한다  	=> <div>button</div>
				item.appendChild(button)
					//todolist라는 요소에 item 이라는 자식요소 추가		=>	<div id="todo-list"> <div> item </div>   </div> 	
				todolist.appendChild(item)
			
					// checkbox라는 객체 조작
						//위에 선언된 checkbox(input)에 type = "checkbox" 	<input type ='checkbox'>
				checkbox.type ="checkbox"
						//위에 선언된 checkbox(input)에 이벤트를 추가하겠다;  체크박스가 눌릴때마다 바꿔준다{}
				checkbox.addEventListener('change',(event)=>{
					 item.style.textDecoration	= event.target.checked ? 'line-through' :'' //div에 스타일을 넣겠다 텍스트에 데코레이션을 = 이벤트의 타겟은 체크된 사항에 줄을 치겠다
				})																				//삼향 제시
		
					//text 객체를 조작하기
					
					text.textContent = input.value  // span의 텍스트컨텐츠  = input의 값을 <span> 글자작성 <span>
					
					//button 객체 조작 1)
				
					button.textContent = '제거하기'	//버튼의 컨텐츠의 제거하기를 넣겠다
					button.addEventListener('click', ()=>{ //버튼안에 click 요소를 추가하는데 click을 누를시
						removetodo(key)     				//key값을 삭제 하겠다 
					})
						//1.입력 양식의 내용을 비운다)
						input.value ='' //input의 값을 빈 변수로 만든다
					}
						
						
						//2.아래 지정된 선언문으로 키의 값을 제거 	 //화살표 함수 선언				
					const removetodo = (key)=>{
						const item = document.querySelector(`[datekey="${key}"]`) //위에 선언된 key값의 문서열을 추가
						todolist.removeChild(item)		//todolist 안에 item (div)이라는 자식 요소 제거	
						}
			//5.이벤트 연결
					addbutton.addEventListener('click',addtodo) //addbutton안에 클릭을 하면 addtodo 라는 값을 추가하겠다
					input.addEventListener('keyup',(event)=>{	//input이라는 요소에 keyup을 할때마다 이벤트(효과)를 추가하겠다
						const ENTER =13					//엔터를의 코드값 엔터를 누를때마다 
						if(event.keyCode === ENTER ){ //만약에엔터는 이벤트의 키 코드 값다 동일하다 
							addtodo() 	//출력>?
							}
					})
				})
	