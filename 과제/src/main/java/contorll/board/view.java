package contorll.board;

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
import com.mysql.cj.xdevapi.JsonValue;

import model.boarddao.boardDao;
import model.boarddao.dao;
import model.boarddto.dto;

/**
 * Servlet implementation class view
 */
@WebServlet("/board/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boardDao dao = new boardDao();
		
		ArrayList<dto>list = dao.bview();
		JSONArray array = new JSONArray();
		for(int i =0; i<list.size(); i++) {
			JSONObject object = new JSONObject();
			object.put("num", list.get(i).getNum());
			object.put("title", list.get(i).getTitle());
			object.put("writer", list.get(i).getWriter());
			object.put("day", list.get(i).getDay());
			object.put("view", list.get(i).getView());
			array.add(object);
			
		}
		System.out.println(array);
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().print( array );
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
