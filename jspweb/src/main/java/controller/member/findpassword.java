package controller.member;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao.MemberDao;


@WebServlet("/member/findpassword")
public class findpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public findpassword() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String mname = request.getParameter("mname");
		String mid = request.getParameter("mid");
		
		boolean result = MemberDao.getInstance().findpassword(mname, mid);
		String randstr = "";
		//3. 아이디와 이메일이 동일할경우[ true ] 에만 임시번호 생성
		if(result) {
			//문자 난수 15자리 : 랜덤 클래스[ 임시비밀번호]
			Random random = new Random();	//1. 랜덤객체 선언
			 //2. 랜덤 문자를 저장할 문자열[임시 비밀번호]
			for(int  i = 0; i<15; i++) {
				randstr += (char)(random.nextInt(26)+97); // 3. 숫자 -> 난수 char강제형변환
									//영소문자 [ 아스키 코드] 97~122
										//강제형변환
			}
			//해당회원의 비밀번호를 임시 비밀번호 교체[업데이트]
			MemberDao.getInstance().passwordchange(mid, randstr);
			
		}
		//4.반환
		
		response.getWriter().print(randstr); //ajax에게 임시비밀번호 
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
