/**
 contextmenu : 오른쪽 클릭했을때 [메뉴]
 
 */
 const imgs =document.querySelectorAll('img')
 		//배열=??????all --> 여러개 --> 배열
	
 		
 		
 for(let i =0; i<imgs.length; i++){
	imgs[i].addEventListener('contextmenu' ,(event)=>{
		event.preventDefault() 
	}) //오른쪽 클릭
} 

//3.
for(let i in imgs){
	if(imgs.length-1==i){break}
	imgs[i].addEventListener('contextmenu' ,(event)=>{
		event.preventDefault() 
	}) //오른쪽 클릭
} 
//4.
for(let i of imgs){
	i.addEventListener('contextmenu' ,(event)=>{
		event.preventDefault() 
	}) //오른쪽 클릭
} 

//5.
imgs.forEach((img) =>{
	img.addEventListener('contextmenu' ,(event)=>{

		event.preventDefault() 
		})
})








let 상태 = false //체크박스를 체크하는 여부 저장변쇼ㅜ

const checkbox =document.querySelector('input')
//체크박스에서 체크가 변경이 있을때 이벤틑 실행
checkbox.addEventListener('change' ,(e)=>{
	상태 = e.currentTarget.ckecked
	
})
const 링크 = document.querySelector('a')

링크.addEventListener('click',(e1)=>{
	if(!상태){
		e1.preventDefault()
	}
})











