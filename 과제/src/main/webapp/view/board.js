
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
		}
	
	});

}
	
	
	
	
