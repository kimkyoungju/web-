package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.Dao.productDao;
import model.Dto.pcatagoryDto;

/**
 * Servlet implementation class pcategory
 */
@WebServlet("/board/pcategory")
public class pcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pcategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.요청
		//2. 
		ArrayList<pcatagoryDto>list = new productDao().getpcategory();
		//리스트 
		JSONArray array = new JSONArray();
		for(pcatagoryDto dto : list) {
			JSONObject object = new JSONObject();
			object.put("pcno", dto.getPcno());
			object.put("pcname", dto.getPcname());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8"); response.getWriter().print(array);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String pcname = request.getParameter("pcname");
		//2. dao 처리
		
		productDao dao = new productDao();
		boolean result = dao.setpcatagory(pcname);
		
		response.getWriter().print(result);
	}

}
