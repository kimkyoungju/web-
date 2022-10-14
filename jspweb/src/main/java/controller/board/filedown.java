package controller.board;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class filedown
 */
@WebServlet("/board/filedown")
public class filedown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filedown() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//----업로드된 파일을 다운로드-----
		//1. 다운로드할 파일명 요청
		request.setCharacterEncoding("UTF-8");
		String bfile = request.getParameter("bfile");	//다운로드할 파일명 요청
		
		//2.업로드된 경로 + 파일명으로 해당 파일 위치 찾기
		String uploadpath = "C:\\Users\\504\\git\\web-\\jspweb\\src\\main\\webapp\\upload\\"+bfile;
		
		//3. 해당 경로의 파일을 객체화 [ java에서 파일클래스 = file ]
		File file = new File(uploadpath); //해당 경로에 존재하는 파일을 객체화 불러오기 [해당파일을 조작 /메소드]
		
		//4.http에서 지원하는 다운로드 메소드[response]
		
		response.setHeader(
				"Content-Disposition", // 다운로드 형식 html에서 지원  [브라우저 차이 있음] 
				"attachment;filename="
		+URLEncoder.encode(bfile,"UTF-8")); 	//다운로드시 명시 파일명  
		
		//5. 파일 전송 [전송(스트림) =바이트단위]
			//1. 파일의 내용물의 바이트로 모두 읽어온다 
			//입력스트림 객체 생성
		BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file));
	
		
			//2.파일의 바이트길이만큼 배열선언        file.length() : 해당 파일의 바이트길이 메소드,
		byte[] bytes = new byte[(int)file.length()];
		
			//3.파일의 내영[바이트]읽어오기 
		fin.read(bytes); //읽어온 바이트를 바이트배열에 저장 
			
			//4.출력 
			//출력 스트림 객체 생성		//http로 출력하기 위한 response.getOutputStream()
		BufferedOutputStream fout = new BufferedOutputStream(response.getOutputStream());
			//5.배열에 존재하는 바이트 출력
		fout.write(bytes); // 바이트 배열에 저장된 바이트를 모두내보내기
		
			//스트림은 버퍼(전송시 사용되는 임시 메모리 공간 =대용량에서 꼭 모두 전송후 초기화 )
		fout.flush() ; 		//출력스트림 버퍼 초기화
		fin.close(); 		//스트림 닫기
		fout.close();		//스트림 닫기 [close 버퍼 닫기 ]
	
	}
	
	/*
	 * [1~3]
	업로드된 폴더[파일]	--------스트림[바이트]----------->		자바[서버] --------getOutputStream--------->http[웹]
		
			파일   ========--------input----------->     바이트배열 ---------output ----->
					//1.BufferedInputStream 클래스		*실제 내용물로 변환  //2.BufferedOutputStream 클래스 
* 	new BufferedInputStream(new FileInputStream(file));			BufferedOutputStream(response.getOutputStream());			
							객체명.fin.read(배열)                             객체명.write(바이트 배열)      
	*/	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
