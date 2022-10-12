


bview()

	let title = document.querySelector("#title").value
	let writer = document.querySelector("#writer").value
		
	let content = document.querySelector("#content").value
	let pw = document.querySelector("#pw").value
function insert(){
	

	
$.ajax({ 
	url :"/과제/view/boardin",
	data :{"title" : title, "writer" : writer ,"content" : content, "pw":pw},
	success: function(result){
		if(result=="true"){
			alert("등록성공")
		}else{alert("등록실패")}
	}

	});

}

 let i = null
function bview(){
	
	
var html =  '<h1>게시판</h1>'+
'		<table>'+
'			<tr>'+
'				<td>제목 </td>'+
'			</tr>'+
'			<tr>'+
'				<td>작성자 </td>'+
'			</tr>'+
'			<tr>'+
'				<td>내용 </td>'+
'			</tr>'+
'			<tr>'+
'				<td>조회수 </td>'+
'			</tr>'+
'		</table>';
	
	let Json ={
		"title" : title,
		"writer" : writer ,
		"day" : day
	}
	
	$.ajax({
		url : "/과제/view",
		
		success : function(re){
			if(re ==="true"){
				i = JSON.parse(Json)
			}else{alert("x")}
			
		}
		
		
	});
	
		for(let j = 0; j<bview.length; j++){
		bview += '<h1>i[j]</h1>'+
		'		<table>'+
		'			<tr>'+
		'				<td>i[j]</td>'+
		'			</tr>'+
		'			<tr>'+
		'				<td>i[j] </td>'+
		'			</tr>'+
		'			<tr>'+
		'				<td>내용 </td>'+
		'			</tr>'+
'				</table>'
	}

}