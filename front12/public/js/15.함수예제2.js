//204
function sumALL ( a,b ){
	//sumall이름으로 함수명 선언,매개변수 a.b
		//외부에서 함수 호출시 들어오는 값[데이터]
		let output = 0
		for(let i = a; i<=b ;i++){
			// i는 a부터 b까지 1씩증가 반복처리
			output += i // vs output= output + i
		}
		return output //output리턴한다 [함수를 호출했던 위치로]
		
}
console.log(`1부터 100까지의 합 : ${sumALL(1,100)}`)
console.log(`1부터 100까지의 합 : ${sumALL(1,500)}`)

//계산하기 버튼을 눌렀을때 함수
function 계산버튼함수(){
	alert('버튼눌림 성공')
	let snumber = Number(document.getElementByid('sinput').value)
	let enumber = Number(document.getElementByid('sinput').value)
		//enum -> 미리만들어진 단어 키워드 존재하기 x
	let result = sumAll(snumber .enumber)
	alert( snum )
	document.getElementByid('resultbox')

}