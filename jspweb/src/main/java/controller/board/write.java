package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.BoardDao;
import model.Dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
      	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      		String mid = (String) request.getSession().getAttribute("mid");
      		int mno = MemberDao.getInstance().getMno(mid);

      		String btitle = request.getParameter("btitle");
      		String bcontent = request.getParameter("bcontent");
      		
		      		System.out.println(btitle);
		      		System.out.println(bcontent);
      		
      		boolean result = BoardDao.getInstance().write(btitle, bcontent, mno);
      		
      		System.out.println(result);
      		
			/* 폼전송용 */
			/*
			 * if(result) { response.sendRedirect("list.jsp"); 
			 * }else {
			 * response.sendRedirect("write.jsp"); }
			 */
      		/* js전송 */
      		response.getWriter().print(result);
      	}
 
      	
  
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}