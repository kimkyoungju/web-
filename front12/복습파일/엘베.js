//엘베 버튼 구현
//버튼 누르기 구현
//현재 위치 구현
//감소 또는 증가 구현
// 도착 구현

function 버튼(){
	let btn_list=''
	엘베층 =[null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null]
	for(let i = 1; i<21; i++){
		btn_list += `<button id=${i} onclick=버튼() (${i})>${i}</button>`
		if( i % 5 == 0){btn_list+='<br>'}
	}
	document.getElementById('btn').innerHTML = btn_list
}
