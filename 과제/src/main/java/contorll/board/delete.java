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
 * Servlet implementation class delete
 */
@WebServlet("/view/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	
	   
		
		 int num = Integer.parseInt(request.getParameter("num"));
		 System.out.println(num); 
		 
		 boardDao dao = new boardDao();
		 
		 boolean result =  dao.delete(num);
		
		 
		 response.getWriter().print(result);
		
		
		
		
	}
   
   
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
