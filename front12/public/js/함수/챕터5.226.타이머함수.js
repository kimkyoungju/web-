/*

	226. 
	
	*내장함수 : 만들어진 함수
	
	*타이머 함수 : 콜백함수 [ 내장함수 ]
	settimeout(함수,시간 [밀리초]) : 시간이후에 한번 함수 실행
	clacleartimeout
	setinteval(함수,시간[밀리초]) : 매시간마다 함수 실행
 	claclearInterval(함수변수) : 타이머 종료
 */
 
 setTimeout ( ()=>{console.log('1초 후에 실행됩니다.')}, 1*1000) //1곱하기 1000=1초\
 
 
 
 let count = 0
 let 동네사람들 = setInterval ( ()=>{
	console.log(`1초 마다 실행됩니다${count + 1}.`)
 	count++
 	if(count == 5){ //5초후 타이머 종료
	clearInterval(동네사람들)
 	}
 }, 1*1000) //1곱하기 1000=1초
 
 