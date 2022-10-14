
bview()
function insert(){

	let title = document.querySelector("#title").value
	let writer = document.querySelector("#writer").value
		
	let content = document.querySelector("#content").value
	let pw = document.querySelector("#pw").value
	
$.ajax({ 
	url :"/과제/view/boardin",
	data :{"title" : title, "writer" : writer ,"content" : content, "pw":pw},
	success: function(result){
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
			
			html += '<tr>' +
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
		alert(result)
		}
	
	})
}	
	
