



let num = 0;


bview()
function insert(){
	let title = document.querySelector("#title1").value
	let writer = document.querySelector("#writer1").value
	let content = document.querySelector("#content1").value
	let pw = document.querySelector("#pw1").value
	console.log(title,writer,content)
$.ajax({ 
	url :"/과제/view/boardin",
	data :{"title1" : title, "writer1" : writer ,"content1" : content, "pw1":pw},
	success: function(result){
		
		console.log(result)
		if(result=="true"){
			 location.reload()
			alert("등록성공")
		}else{alert("등록실패")}
	}

	});

}

function bview(){
	
	$.ajax({ 
	url :"/과제/board/view",
	success: function(result){
		console.log(result)
		let list = JSON.parse(result)
		console.log( list )
		
		let html =""
		
		for(let i =  0; i<list.length; i++){
			let b= list[i]
			console.log(b)
			
			html += '<tr class="m3">' +
							'<td>'+b.num+'</td>'+
							'<td>'+b.title+'</td>'+
							'<td>'+b.writer+'</td>'+
							'<td>'+b.day+'</td>'+
							'<td>'+b.view+'</td>'+
						'</tr>'
			
			
		}
		
		console.log(html)	
			document.querySelector(".bbaord").innerHTML += html
		}
		
	
	});

}
	
	
function view(){
	
	let sview = document.querySelector(".sview").value
	
	$.ajax({ 
	url :"/과제/board/writerboard",
	data : {"sview" : sview },
	success: function(result){
		console.log(result)
		let board = JSON.parse( result )
		console.log(board)
			document.querySelector('#num').innerHTML = board.num;
			document.querySelector('#title').innerHTML = board.title;
			document.querySelector('#content').innerHTML = board.content;
			document.querySelector('#writer').innerHTML = board.writer;
			document.querySelector('#day').innerHTML = board.day;
			document.querySelector('#view').innerHTML = board.view;
			num = board.num;
			console.log(board.num)	
		
		}
	
	})
}	

function delet(){

	$.ajax({
		url: "/과제/view/delete",
		data : {"num" : num},
		success: function(re){
			if(re==='true'){
			alert("삭제성공")
			location.reload()
			}else{
				alert("삭제실패")
			}
			console.log(num)
		}
		
	})
	
	

	
}


function read(){
	
	$.ajax({
		url : "/과제/view/read", 
		data : { "num" : num },
		success : function( re ){
			
			alert(re)
			if(re==='true')alert(re)
			else {alert("실패")}
		}
		
	})
	console.log(num)
}	
	
