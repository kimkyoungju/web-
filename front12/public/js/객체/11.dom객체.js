/**
 
 		1.dom : 문서객체 모델 [미리만들어진 객체 /메소드]
 			
 			*식별자[js,css동일]
 				tag , class[.], id {#}
 			
 			1.html에 요소를 객체로 호출
 				1.queryselector('식별자명')
 				2.queryselectorall('식별자명')
 			
 			1.문서객체 .addeventlistener('이벤드명',콜백함수)
 				1.이벤트 종류
 					1.'click': 해당객체를 클릭했을때 함수실행
					2.'keyup' : 해당객체에서 키가 떨어질때 함수실행
					3.
					
 */
 
 
 //331
 
 //1 html태그를 문서객체화 시키기
 document.addEventListener('DOMContentLoaded',()=>{
})
 const 동네사람들= document.querySelector('textarea')
 const 머릿글 = document.querySelector('h1')

//1회성
동네사람들.addEventListener('keyup',()=>{
	const 길이 = 동네사람들.value.length
	머릿글.textContent=`글자 수 : ${길이}`
	
})


//중복가능 
 function 글자수(){
	const 길이 = 동네사람들.value.length
	머릿글.textContent = ` 글자수 : ${길이}`
}
 
 //p333
 	//html 이벤트속성[event]
 	//keyup 이벤트 
 const h2 =document.querySelector('h2')
 const print = ( event )=>{
	let output= ''
	output += `wonder : ${event.altKey}<br>` 
	output += `like : ${event.ctrlKey}<br>` 
	output += `동네사람들 : ${event.shiftKey}<br>`
	output += `code : ${typeof(event.code) != 'undefined' ? 
			event.code : event.keyCode}<br>`
			h2.innerHTML =output

}
document.addEventListener('keyup',print)
 
 
 
 
 
 