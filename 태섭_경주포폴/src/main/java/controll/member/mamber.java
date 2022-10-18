/*
 * package controll.member;
 * 
 * import java.io.IOException; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import model.dao.memberdao; import model.dto.dto;
 * 
 *//**
	 * Servlet implementation class mamber
	 */
/*
 * @WebServlet("/signup/mamber") public class mamber extends HttpServlet {
 * private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public mamber() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * request.setCharacterEncoding("UTF-8"); String name =
 * request.getParameter("name"); String id = request.getParameter("id"); String
 * pw = request.getParameter("pw"); String ad = request.getParameter("ad");
 * String ph = request.getParameter("ph"); String size =
 * request.getParameter("size"); System.out.println(id);
 * 
 * dto dto = new dto(0, name, ad, id, pw, ph, size, null);
 * 
 * 
 * boolean result = memberdao.getInstance().signup(dto); if(result) {
 * System.out.println("성공"); }else { System.out.println(2); }
 * System.out.println(result); request.setCharacterEncoding("UTF-8");
 * response.getWriter().print(result); }
 * 
 *//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 * 
		 * }
		 */