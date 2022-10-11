




	
function insert(){
	
	let title = document.querySelector("#title").value
	let writer = document.querySelector("#writer").Value
	let content = document.querySelector("#content").value
	let pw = document.querySelector("#pw").value
	alert(writer)
$.ajax({ 
	url :"/과제/view/boardin",
	data :{"title" : title, "writer" : writer ,"content" : content, "pw":pw},
	success: function(result){
		if(result==true){
			alert("등록성공")
		}else{alert("등록실패")}
	}

	});

}