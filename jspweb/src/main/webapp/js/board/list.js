/**
 * 
 */
 
 let pageinfo = { //js 객체
	listsize : 5,
	page : 1,       //현재 페이지 번호
	key : '',		//검색 키
	keyword : '',	//검색 키워드
	
}

//



list(1)

function list(page){
	
	pageinfo.page= page;
	
$.ajax({
		url : "/jspweb/board/list" , 
		data:pageinfo,
		success : function( re ){
			
			let boards = JSON.parse(re)
		
			
			
			//1. object 내 게시물리스트 먼저 호출
			let boardlist = boards.data
			
			let html = ""
			// boardlist -> 객체를 하나씩 꺼내기
			for( let i = 0 ;  i<boardlist.length ; i++){
				// 1. i번째 객체 호출 
				let b = boardlist[i]
				
				// 2. i번쨰 객체의 정보를 html 형식으로 변환해서 문자열에 저장
				html += '<tr>' +
							'<td>'+b.bno+'</td>'+
							//'<td><a href="http://localhost:8080/jspweb/board/view.jsp?bno='+b.bno+'">'+b.btitle+'</a></td>'+
							'<td onclick="viewload('+b.bno+')">'+b.btitle+'</td>'+
							'<td>'+b.mid+'</td>'+
							'<td>'+b.bdate+'</td>'+
							'<td>'+b.bview+'</td>'+
						'</tr>'
			} // for end 
				
			document.querySelector('.btalbe').innerHTML = html
			
			
			//1. 페이징버튼 html 구성
			let pagehtml = '';
			 
			 
			 //2. 이전버튼
			 if(page<=1){ pagehtml += '<button onclick="list('+(page)+')">이전</button>'}
				else {pagehtml += '<button onclick="list('+(page-1)+')">이전</button>'}	
			//4. 페이지 번호 버튼
				for(let page = boards.startbtn; page<= boards.endbtn; page++){
					pagehtml +='<button type="button" onclick="list('+page+')">'+page+'</button>'
					
				}
				
			//3. 다음 버튼
			if(page == boards.totalpage){pagehtml +=  '<button onclick="list('+(page)+')">다음</button>'}
			else{pagehtml +=  '<button onclick="list('+(page+1)+')">다음</button>'}
			
			document.querySelector(".pagebox").innerHTML = pagehtml;
		//5. 전체 vs 검색된 게시물 수 표시
			document.querySelector(".totalsize").innerHTML = boards.totalsize;
			
		}
	})
}
function viewload( bno ){
	$.ajax({
		url : "/jspweb/board/viewload", 
		data : { "bno" : bno },
		success : function( re ){
			location.href = "/jspweb/board/view.jsp"
		}
	})
}


 //검색
 
 function bsearch(){
	
		let key = document.querySelector(".key").value
		let keyword = document.querySelector(".keyword").value
		
		pageinfo.key = key
		pageinfo.keyword = keyword
	
		
		list(1)
		

}

//6. 게시물 표시 개수 
function blistsize(){

pageinfo.listsize = document.querySelector(".listsize").value;
list(1);


}




