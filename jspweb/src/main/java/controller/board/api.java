package controller.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class api
 */
@WebServlet("/board/api")
public class api extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public api() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 공공데이터 포탈 사용 [ 안산시 약국]
			//자바에서 해당 url 을 객체화하기 [url 클래스 java.net]
		URL url = new URL("https://api.odcloud.kr/api/3035882/v1/uddi:5fae3cf5-bc15-4eba-87d8-8289b74e659b_201912202015?page=1&perPage=292&serviceKey=yta%2FS2d8xPUGgkKasD2u8dvk8C4mXJ8HGM7MAq17giX5%2F4lm2ThAWSBCnYSoy1xwN7fDqxaSC7L8LIWAhyd1RQ%3D%3D");
																														//page :현재페이지 번호 		//perPage : 페이지당 표시할 데이터 수 
		//2. 해당 url 바이트 스트림 읽어오기 BufferedReader 클랙스
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		
		//3. 읽기
		String result = bf.readLine(); // 모두읽어오기 
		System.out.println(result);
		//응답
		response.setCharacterEncoding("UTF-8");
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
