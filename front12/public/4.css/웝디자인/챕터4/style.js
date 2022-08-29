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
