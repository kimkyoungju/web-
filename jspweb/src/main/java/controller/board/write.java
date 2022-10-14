package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Dao.BoardDao;
import model.Dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
      	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//      		String mid = (String) request.getSession().getAttribute("mid");//1. 로그인 세션 [ 로그인한 사람의 아이디]
//      		int mno = MemberDao.getInstance().getMno(mid);					//2. 회원아이디 --> 회원번호
//      								//fk는 pk에 있는 데이터만 저장가능[ 무결성]
//      		String btitle = request.getParameter("btitle"); 				//3. 입력받은 데이터1
//      		String bcontent = request.getParameter("bcontent");				//3. 입력받은 데이터2 요청
//      		
//		      		System.out.println(btitle);
//		      		System.out.println(bcontent);
//      		
//      		boolean result = BoardDao.getInstance().write(btitle, bcontent, mno);    //dao 호출 [저장]
//      		
//      		System.out.println(result); 
//      		
//			/* 폼전송용 */
//			/*
//			 * if(result) { response.sendRedirect("list.jsp"); 
//			 * }else {
//			 * response.sendRedirect("write.jsp"); }
//			 */
//      		/* js전송 */
//      		response.getWriter().print(result);			//ajax로 반환
  	}
 
      	
  
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.첨부파일[cos.jar 라이브러리 필요]
			//1. cos.jar 빌드추가
			//2. httpservletrequest : 첨부파일 지원x[소량의 문자만 지원]
			//3. MultipartRequest : 첨부파일 지원 o [대용량의ㅡ 문자가능]
					//첨부파일 : http post 메소드지원
			//new MultipartRequest(요청방식 ,파일 저장 경로  , 최대용량범위, 인코딩타입, 기타 : (필수는 아님 :보안방식 )
					//1비트 (0,1)
		//1. 저장경로 [ 프로젝트 저장]
		String uploadpath = "C:\\Users\\504\\git\\web-\\jspweb\\src\\main\\webapp\\upload";
		MultipartRequest multi = new MultipartRequest(
				
				request, // 요청방식
				uploadpath,	//2. 저장 경로
				1024*1024 *10,//1mb [1024 : 1kb /1024**1024 : 1mb \1024*1024*1024 : 1gb
				"UTF-8",
				new DefaultFileRenamePolicy() //5. 업로드된 파일의 이름이 중복일 경우 자동이름 변경
				); 	//생성자 e
		
		String btitle = multi.getParameter("btitle"); //request =>multi
			System.out.println(btitle);
		String bcontent = multi.getParameter("bcontent");
			System.out.println(bcontent); //확인 
		//어떤 파일을 업로드 했는지 db에저장할 첨부파일 경로 /이름 호출 
		String bfile  = multi.getFilesystemName("bfile");
		System.out.println(uploadpath+bfile);
			//회원 아이디 ---> 회원번호
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid"));
	
		//db처리
		boolean result = 
		BoardDao.getInstance().write(btitle, bcontent, mno ,bfile);
		//6.응답
		response.getWriter().print(result);
	
	}

}
