package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.Dao;
import model.Dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/member/login") // url정의 : 해당 클래스로 들어올수 있는 경로 선언
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ajax
		// 1. 변수 요청
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. Dao db메소드 호출
		int result = MemberDao.getInstance().login(mid, mpassword);
		// 3. db결과를 js ajax 에게 응답
		response.getWriter().print(result);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * String mid = request.getParameter("mid"); String mpassword =
		 * request.getParameter("mpassword");
		 * 
		 * int result = MemberDao.getInstance().login(mid,mpassword); if(result)
		 * {response.sendRedirect("/jspweb/index.jsp");} else
		 * {response.sendRedirect("/jspweb/member/login.jsp");} doGet(request,
		 * response);
		 */
	}

}
