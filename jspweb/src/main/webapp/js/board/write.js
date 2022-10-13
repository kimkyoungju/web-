function bwrite(){

	let inputs = document.querySelectorAll("input")
	
	
	console.log(inputs)
	
	let data ={
		btitle : inputs[1].value,
		bcontent :inputs[2].value
	}
		console.log(data)


	$.ajax({
		url :"/jspweb/board/write",
		data : data,
		success  : function(re){
			if(re ==='true'){alert("글등록");location.href=("list.jsp")}
			else{alert("등록실패")}
			
		}
	})


}

