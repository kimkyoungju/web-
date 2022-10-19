package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.BoardDao;
import model.Dao.MemberDao;

/**
 * Servlet implementation class rwirte
 */
@WebServlet("/reply/rwirte")
public class rwirte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rwirte() {
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
		request.setCharacterEncoding("UTF-8");
		//타입 요청 [0 댓글 1 답글
		
		String type = request.getParameter("type");
		String rcontent = request.getParameter("rcontent"); 
				//댓글내용
				int mno = MemberDao.getInstance().getMno((String)request
						.getSession().getAttribute("mid"));
				
				if(mno==0) {response.getWriter().print("0"); return;}//비로그인일경우
				System.out.println(mno);
				int bno = (Integer)request.getSession().getAttribute("bno");
				
				boolean result = false;
				
				if(type.equals("0")) { // 댓글 
					 result = BoardDao.getInstance().rwrite(rcontent, mno,bno);
				}else if(type.equals("1")) { // 대 댓글 
					int rindex = Integer.parseInt(request.getParameter("rno"));
					 result = BoardDao.getInstance().rrwrite(rcontent, mno,bno ,rindex);
				}
		
		
		//1. 요청
		
		
		
		
		//2.db처리
		
		//3. 결과반환
		if(result) {
			response.getWriter().print("1"); //성공
		}else{
			response.getWriter().print("2"); // db오
			
		}
		System.out.println(rcontent);
	}

}
