package controller.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import controller.member.info;
import model.Dao.BoardDao;
import model.Dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/board/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
	
		//////////////////검색처리
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		System.out.println(key);
		System.out.println(keyword);
		
		
		///////////////////////
		
		
		
		//1. 요청 ㅌ
			//페이징 처리 필요한 변수 요ㅓㅇ
		int listsize = Integer.parseInt(request.getParameter("listsize"));
		
		//2. 전체페이지수 vs 검색된 게시물 수 
		int totalsize = BoardDao.getInstance().gettotalsize(key,keyword);
		//2. 전체페이지수 계산
		int totalpage = 0;
		if(totalsize % listsize == 0) totalpage = totalsize / listsize; // 나머지가 없으면 
		else totalpage = totalsize/listsize +1; // 나머지가 존재하면 나머지를 표시할 페이지+1
		
		
		//3.현재 페이지수ㅡ
		int page = Integer.parseInt(request.getParameter("page"));
		
		//3. 페이지별 시작 게시물 행 번호
		int startrow = (page-1)*listsize;
			//1페이지 -> 1-1 * 3 =>3
			//2페이지 -> 2-1 * 3 =>6
		//3. 화면에 표싷ㄹ 최대 버튼수
		int btnsize = 5; 			// 버튼 5개씩 표시[몫 : 5배수 현재페이지가 최대 버ㅗ튼수 보다 커지면]
		int startbtn = ((page-1 )/btnsize) *btnsize+1;
		int endbtn  = startbtn + (btnsize -1);
			
		//만약에 endbtn 마지막 페이지보다 크면 마지막 버튼 번호는 마지막 페이지
		if(endbtn > totalpage) endbtn = totalpage;
		
					 
//	1페이지 경우   1
//	2페이지 경우	1	
//	3페이지 경우	1
//	4페이지 경우	1
//	5페이지 경우	1
//	6페이지 경우 	6
//				
//			sb		    eb
//	page 1~5		1 2  3   4   5
//	page 6~10		6 7 8   9   10
//	page 11~15		11 12 13 14  15
		//페이징 처리에 필요한 정보담는 object
		JSONObject boards = new JSONObject();
		//2. 전체 게시물 호출 vs 검색된 게시물 호출 
		ArrayList<BoardDto> list =  BoardDao.getInstance().getlist(startrow ,listsize,key,keyword);
		// ** arraylist ---> jsonarray 변환[ js에서 쓸려고 ]
		JSONArray array = new JSONArray();
		for( int i = 0  ; i<list.size() ; i++ ) {
			JSONObject object = new JSONObject();
			object.put("bno", list.get(i).getBno() ); 
			object.put("btitle", list.get(i).getBtitle() );
			object.put("bdate", list.get(i).getBdate() );
			object.put("bview", list.get(i).getBview() );
			object.put("mid", list.get(i).getMid() );
			array.add(object);
			System.out.println(list);
			System.out.println(array);
			
		}
		boards.put("totalpage", totalpage);
		boards.put("data",array);
		boards.put("startbtn", startbtn);
		boards.put("endbtn", endbtn);
		boards.put("totalsize", totalsize);
	// 3. 응답o
	response.setCharacterEncoding("UTF-8"); 
	response.getWriter().print( boards );
	
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
