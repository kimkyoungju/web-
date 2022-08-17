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
	 
	 let 위치 =[]
	 function up( ){
		let btn_up=''
			for(let i = 1; i<=20; i++){
				btn_up+=<`button id=${i}>${i}</button>`
			
			}
		}document.getElementById('up').innerHTML
