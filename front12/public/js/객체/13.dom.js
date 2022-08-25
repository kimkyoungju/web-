/**
 *  객체명 . textcontent
 	객체명 . innerhtml
 	객체명.value
 */
 //1. 버튼을 눌렀을때 
 const input = document.querySelector('#inchbox')
 const button = document.querySelector('#inchbtn')
 const p = document.querySelector('#inchp')
 
 //2버튼을 눌렀을때
 button.addEventListener('click' ,()=>{
	
	const inch	=Number(input.value)	//number :문자열 - > 숫자열  		value: 값
		//isnan(데이터)	: 숫자가 아니면 true / 숫자이면 false
	if(isNaN(inch)){ //isnan 숫자가 아니면 아래 실행
		p.textContent ='숫자를 입력해주세요'
		return	//return 했기때문에 else값은 필요없다 
	}
	//입력값이 숫자이면
	const cm =inch*2.54
	p.textContent =`${cm} cm`
})

//341
//1.html요소 가져오기

const emailbox =document.querySelector('#emailbox')
const emilp =document.querySelector('#emilp')

//이메일 검증확인 함수[익명함수]
const is이메일 = (value) =>{
	return(value.indexOf('@')>1) &&(value.split('@')[1].indexOf('.')>1)
	//입력데이터의 @가 있는지 			이면서		갑의 골뱅이기준으로 
	 
}
//이메일 입력상자에서 키보드를 입력할떄마다 이벤트 발생
emailbox.addEventListener('keyup',(event)=>{
	//이메일 상자에서 입력된 데이터를 변수에 저장
	const value = event.currentTarget.value//event.currentTarget : 현재이벤트 중인 객체
	if(is이메일(value)){	
		p.style.color='green'
		p.textContent=`이메일형식입니다 : ${value}`
	}else{
		p.style.color='red'
		p.textContent=`이메일형식이아닙니다 : ${value}`
	}
	
})
/*배열명.indexof('검색데이터'): 배열내 해당 데이터와 인덱스 번호 찾기
문자열.indexof('@') :문자열내 @의 인덱스 번호 찾기
	만약에 0보다 작으면 못찾았다[인덱스란 : 저장순서 번호 = 0번시작]
문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리[자르기] -> 배열
	문자열 = 유재석.강호동,신동엽,하하
	믄자열.split(',')
	
*/	




///343 
const seletbox = document.querySelector('#seletbox')
const seletp = document.querySelector('#seletp')
			//데이터가 변경될때마다 실행되는 이벤트[change]
seletbox.addEventListener('change' , (event) =>{
	//
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectedIndex
	
	seletp.textContent = `선택: ${options[index].textContent}`
})

//344
const seletbox2=document.querySelector('#seletbox2')
const seletp2=document.querySelector('#seletp2')
//seletbox2 가 데이터 변경되었을떄
seletbox2.addEventListener('change' , (event) =>{
	//옵션목록 = selectbox2 모든옵셔늘 호출
	const options= event.currentTarget.options
	const list = [ ]
	for(const option of options){
		if(option.selected){	
			list.push(option.textContent)
		}
	}
	seletp2.textContent = `선택 : ${list.join(',')}`
	//배열명.join('연결문자') : 배열내 모든요소들을 연결문자 기준으로하나의 문자열로 변환
		//학생명 =['유재석', '강호동','신동엽']
		//학생명.join('<->')
		//
})

let 현재값
let 변환상수 = 10

const cmiput=document.querySelector('#cmiput');
const cmspn=document.querySelector('#cmspn');
const cmselect=document.querySelector('#cmselect');
//3.
cmselect.addEventListener('change',(event)=>{
	const options =event.currentTarget.options
	const index =event.currentTarget.options.selectedIndex
	변환상수 = Number(options[index].value)
	calculatr()
})

//2.
const calculatr = () =>{
	cmspn.textContent = (현재값*변환상수).toFixed(2)
}
//1 입력할떄마다 현재값 변수를 입력된 값으로 변환해주는 이벤트
cmiput.addEventListener('keyup',(event) => {
	현재값 = Number(event.currentTarget.value)
	calculatr()
})

//347
let timer=0 	//타이머 시간 (초) 저장하는 변수
let timerid=0	//타이머함수 함수를 저장하는 변수/객체 [setInterval 함수 저장하는]

const timerinput= document.querySelector("#timerinput")
const timerh1=document.querySelector("#timerh1")
//1.체크박스의 상태가 병경되었을떄
timerinput.addEventListener('change', (event)=>{//체크가 되어 있는 상태
	//1.체크박스의 checked 인지 
	if(event.currentTarget.checked){
		// setInterval(함수명,초 [밀리초=1000/1초])
		timerid = setInterval( ()=>{
			timer +=1
			timerh1.textContent = `${timer}초`			
		},1000)
	}else{//체크가 안되어 있는 상태
		clearInterval(timerid)//타이머 함수 종료 [clearInterval(타이머객체)]
	}
})

//348~349

/*
	tag =>'tag'				[복수] queryseletor('h1')
	class => .class명		[복수] queryseletor('.h1class')
	id =>#id명				[단일] queryseletor(#hild)
	name => '[name=name명]'	[단일] queryseletor('[name=h1name명]')
	*식별자
		<h1 id="" class="" name=""
	*js
		queryseletor
*/
//1.
const radios =document.querySelectorAll('[name=pet]')
const output =document.querySelector('#output')
//2.radios[배열]
radios.forEach( (radio)=>{
	radio.addEventListener('change',(event)=>{
		const current =event.currentTarget
		if(current.checked){
			output.textContent =`종아하는 애완동물은 ${current.value}군요!`
		}
	})
})
