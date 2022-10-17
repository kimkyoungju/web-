package contorll.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.boarddao.boardDao;
import model.boarddao.dao;
import model.boarddto.dto;

/**
 * Servlet implementation class boardin
 */
@WebServlet("/view/boardin")
public class boardin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boardin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title1");
		String writer = request.getParameter("writer1");
		String content = request.getParameter("content1");
		String pw = request.getParameter("pw1");
		System.out.println(title);
		dto dto = new dto(0,title,writer,content,pw,null,0);
		boardDao dao = new boardDao();
		boolean result = dao.board(dto);
		if(result) {System.out.println("1");}
		else {System.out.println("등록실패");}
		response.getWriter().print(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
