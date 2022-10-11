package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.Dao.MemberDao;
import model.Dto.Memberdto;

/**
 * Servlet implementation class info
 */
@WebServlet("/member/info")
public class info extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.요청
		String mid = (String) request.getSession().getAttribute("mid");
		//2.db
		Memberdto dto = MemberDao.getInstance().getinfo(mid);
		//3. 서비스 로직
		
		//****js dto 사용 x
		//1. js 이해할수 있는 형식 변경 [ json 형식] 
		//2. json.simple
		
		JSONObject object = new JSONObject();
			object.put("mno", dto.getMno());
			object.put("mid", dto.getMid());
			object.put("mname", dto.getMname());
			object.put("mphone", dto.getMphone());
			object.put("memail", dto.getMemail());
			object.put("maddress", dto.getMaddress());
			object.put("mdate", dto.getMdate());
			object.put("mpoint", dto.getMpoint());
			
		
		//String result = "성공";
		//4.응답
		
		response.setCharacterEncoding("UTF-8");	
		response.getWriter().print(object);
		
		
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
