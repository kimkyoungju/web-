package contorll.board;

import java.io.IOException;
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

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
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
		 String title = request.getParameter("title");
		 String writer = request.getParameter("writer");
		 String day = request.getParameter("day");
		 JSONObject object = new JSONObject();
		 JsonArray array = new JsonArray();
		 boardDao dao = new boardDao();
		 object.put("title", title);
		 object.put("writer", writer);
		 object.put("day", day);

		 array.add((JsonValue) object);
		 JSONArray result = dao.bview();
		 
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
