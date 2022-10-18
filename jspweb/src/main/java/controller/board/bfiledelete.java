package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.BoardDao;
import model.Dto.BoardDto;

/**
 * Servlet implementation class bfiledelete
 */
@WebServlet("/board/bfiledelete")
public class bfiledelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public bfiledelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno =(Integer) request.getSession().getAttribute("bno");
		
		BoardDto dto = BoardDao.getInstance().getboard(bno);
	
		
		boolean result = BoardDao.getInstance().bfiledelete(bno);
		
		if(result) {
			String deletepath = request.getSession().getServletContext().getRealPath("/upload/"+dto.getBfile()); 
			File file = new File(deletepath);
			if(file.exists())file.delete();		
		}
		
		response.getWriter().print(result);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
