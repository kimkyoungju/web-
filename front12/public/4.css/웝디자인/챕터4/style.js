/*
 chartlist.js 이용한 차트 구현
 	변수=값
 	배열 = [값1ㅡ값2]
 	객체 = {키:값, 키2:값2}
 	*/
 //객체
 /*파이차트[원형차트]데이터 객체 선언*/
 let pieData = {
	/*항목의 이름*/
	labels :['웹디자이너','웹개발자','서버 엔지니어','영업직'],
	/*항목의 값 */
	series :[14 , 9 , 8 , 6]
}

let pieOptions = {
	width :'100%',
	height : '440px'
}

/*차트 적용하기 new Chartist.Pie(;표시항목 , 데이터 객체,옵션객체)*/
new Chartist.Pie('.pie_chart',pieData,pieOptions)

/*막대차트*/
let bardata={
	labels :['2018년','2019년','2020년'],
	series :[[10,16,29]]
}
let baroptions ={
	//y축
	axisY :{ //let 객체명 = {키 : {}}
		offset : 60,							//1.
		scaleMinSpace :50,						//2. 선각격[px]
		labelInterpolationFnc : function(value){ //3.y축 눈금 표시
			return value +'명'
		}
	},
	width :'100%',
	height: "400px"
}
//new 클래스명(): 
new Chartist.Bar('.bar_chart',bardata,baroptions)





let bardata2={
	labels :[],
	series :[[]]
}
let baroptions2 ={
	
	//y축
	axisY :{ //let 객체명 = {키 : {}}
		offset : 60,							//1.
		scaleMinSpace :50,						//2. 선각격[px]
		labelInterpolationFnc : function(value){ //3.y축 눈금 표시
			return value +'원'
		}
	},
	width :'100%',
	height: "400px"
}
function 차트그리기(){
const name= document.getElementById('name').value;
const money= document.getElementById('money').value;

bardata2.labels.push(name)
bardata2.series[0].push(money)
new Chartist.Bar('.bar_chart2',bardata2,baroptions2)
}
//new 클래스명(): 
/*-----------------------------------*/
/*
	0.전송버튼을 눌렀을때 (클릭) 이벤트 함수실행
	1.html 에서 입력된 데이터 js 가져와서 변수/ 객체 저장 ->확인
	2. documant.quaryselector() 
	

*/

let 지원자리스트 = [] /*지원자 객체들을 담을 배열 선언:*/

function 전송(){
	console.log('버튼눌림')
	let 입력리스트 = document.querySelectorAll('input')
	console.log('입력요소들')
	let	목록상자 = document.querySelector('select')
	let 긴글상자 = document.querySelector('textarea')
	//2번테스트	
	console.log(입력리스트)
	console.log(목록상자)
	console.log(긴글상자)
	
	let 지원자 = {
		성명 : 입력리스트[0].value,
		영문명 : 입력리스트[1].value,
		메일주소 :입력리스트[2].value,
		포트폴리오 : 입력리스트[3].value,
		희망근무지 :입력리스트[4].value,
		현재상태 : 목록상자.value ,
		자기소개 : 긴글상자.value ,
	}
	console.log(지원자)
	지원자리스트.push(지원자)
	console.log(지원자리스트)	
}




