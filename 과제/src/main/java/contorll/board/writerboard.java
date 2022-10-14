package contorll.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import model.boarddao.boardDao;
import model.boarddao.dao;
import model.boarddto.dto;

/**
 * Servlet implementation class writerboard
 */
@WebServlet("/board/writerboard")
public class writerboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   request.setCharacterEncoding("UTF-8");
		
    	   int
    	   
    	   
    	   sview = Integer.parseInt( request.getParameter("sview"));

    	   
    	   System.out.println(sview);
    	   boardDao dao = new boardDao();
    	   dto re = dao.writerboard(sview);
    	   System.out.println(re);
    	   response.getWriter().print(re);
       }
       
    
    public writerboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
