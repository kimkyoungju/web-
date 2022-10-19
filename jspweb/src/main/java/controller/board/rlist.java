package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import model.Dao.BoardDao;

/**
 * Servlet implementation class rlist
 */
@WebServlet("/reply/rlist")
public class rlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청
		String type =	request.getParameter("type");
		
		
		int bno = (Integer)request.getSession().getAttribute("bno");
		JSONArray array =  new JSONArray();
		//2. dao처리
		if (type.equals("0")) { 
			array= BoardDao.getInstance().getrlist(bno);
		}else if(type.equals("1")) {
			int rindex = Integer.parseInt(request.getParameter("rno"));
			array = BoardDao.getInstance().getrrlist(bno , rindex);
		}
			
		//3. 결과
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
