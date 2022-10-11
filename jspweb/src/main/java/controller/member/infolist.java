package controller.member;

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

import model.Dao.MemberDao;
import model.Dto.Memberdto;

/**
 * Servlet implementation class infolist
 */
@WebServlet("/member/infolist")
public class infolist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infolist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Memberdto>list = 
				MemberDao.getInstance().getinfolist();
		//dto ==> json
		//1. jsonobject 여ㅕ러개 담을수 있는 json 리스트 선언
		JSONArray array = new JSONArray();
		for(Memberdto dto : list) {
			 JSONObject object = new JSONObject();
				object.put("mno", dto.getMno());
				object.put("mid", dto.getMid());
				object.put("mname", dto.getMname());
				object.put("mphone", dto.getMphone());
				object.put("memail", dto.getMemail());
				object.put("maddress", dto.getMaddress());
				object.put("mdate", dto.getMdate());
				object.put("mpoint", dto.getMpoint());
				array.add(object); //3.객체를 리스트에 담기
		}
		
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
