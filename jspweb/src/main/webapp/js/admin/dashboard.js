/**
 * 
 */
 
 
////////////////tkdlemqk
 //호출
 let sidebar = document.querySelector(".sidebar")
 let mainbox = document.querySelector("#mainbox")
 //2. 해당 사이드바에 태그 호출
 sidebar.addEventListener('click' ,function(){
	
	sidebar.style.left = 0;
})

//3. 본문 dib 클릭했을때 이벤트
mainbox.addEventListener('click' ,function(){
	
	sidebar.style.left ='-170px';
})
/////////////본문전환
 function pagechage(page){
	
	//특정태그에 해당 파일을 로드
	$('#mainbox').load(page)
	
	
}