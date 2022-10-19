
package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.MemberDao;
import model.Dto.Memberdto;

/**
 * Servlet implementation class signup
 */
//@WebServlet ("url정의") : 해당 클래스를 호출하는 url 정의
@WebServlet("/member/signup") // 해당 클래스로 매핑(연결)( url 설정[패키지 결로x]
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**1
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		request.setCharacterEncoding("UTF-8");
		//1.jsp from 입력받은 데이터 요청
		String mid = 	request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mpasswordconfirm = request.getParameter("mpasswordconfirm");
		String mname = request.getParameter("mname");
		String mphone =request.getParameter("mphone");
		String memail = request.getParameter("memail");
			
			String maddress1 = request.getParameter("maddress1");
			String maddress2 = request.getParameter("maddress2");
			String maddress3 = request.getParameter("maddress3");
			String maddress4 = request.getParameter("maddress4");
		String maddress = maddress1+","+maddress2+","+maddress3+","+maddress4;

		
		Memberdto dto = new Memberdto(0,mid,
				mpassword,mname,
				mphone,memail, 
				maddress , null ,0);
		//3.통신확인
		System.out.println(dto.toString());
		
		
		MemberDao dao = new MemberDao();
		
		boolean result = dao.signup(dto);
		//5.결과제아
		if(result) {response.sendRedirect("/jspweb/Member/login.jsp");}
		else {}
		
		
		
		
		
		
		doGet(request, response);
	}

}
