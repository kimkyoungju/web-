/**
 * 
 */
 
 
 getproduct()
 function getproduct(){
	
	$.ajax({
		url: "/jspweb/admin/regist",
		type :"get",
		success : function(re){
			let json = JSON.parse(re)
			console.log(json)
			
			let img ='';
			let html ='';
			
			for(let i = 0; i < json.length; i++){
					img = '/jspweb/admin/pimg/'+json[i].pimg;
					html += '<tr>'+
								'<td><img src ="'+img+'" width ="100%"></td>'+
								'<td>'+json[i].pno+'</td>'+
								'<td>'+json[i].pcno+'</td>'+
								'<td>'+json[i].pname+'</td>'+
								'<td>'+json[i].pprice+'</td>'+
								'<td>'+json[i].pdiscount+'</td>'+
								'<td>'+json[i].pprice*json[i].pdiscount+'</td>'+
								'<td>'+json[i].pactive+'</td>'+
								'<td>'+json[i].pdate+'</td>'+
							'</tr>';
			}
			document.querySelector('.ptable').innerHTML += html;
			
			/*
			for(let i = 0 ; i<json.lengtd; i++){
				html += '<tr>'+
								'<td>'+json[i].pname+"</td>"+
								'<td>'+json[i].pimg+"</td>"+
						'</tr>'	
						
						'<img src="'+img+'">'
			}
			console.log(html)
			html = document.querySelector('.table')
	*/
		}
		
	})
}