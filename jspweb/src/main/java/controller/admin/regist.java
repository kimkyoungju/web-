package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Dao.productDao;
import model.Dto.productDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet { // http 서블릿 클래스 메소드
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  //1. 제품출력 메소드 [ get]
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//타입 : 1[모든 제품 출력 ] 2[개별제품 출력]
		response.setCharacterEncoding("UTF-8");

		String type = request.getParameter("type");
		
		
		if(type.equals("1")) {
		//1. 전체출력 2. 판매출력
			String option = request.getParameter("option");
			System.out.println(option);
			
			//////////////////////////////타입 1//////////////////////////////
			ArrayList<productDto>list = new productDao().getproductlist(option);
			//list -> json
			JSONArray a = new JSONArray();
			
			for(int i= 0; i<list.size(); i++) {
				JSONObject object = new JSONObject(); 
				object.put("pno",list.get(i).getPno() );
				object.put("pname",list.get(i).getPname() );
				object.put("pcomment",list.get(i).getPcomment() );
				object.put("pprice",list.get(i).getPprice() );
				object.put("pdiscount",list.get(i).getPdiscount() );
				object.put("pactive",list.get(i).getPactive() );
				object.put("pimg",list.get(i).getPimg() );
				object.put("pdate",list.get(i).getPdate() );
				object.put("pcno",list.get(i).getPcno() );
				a.add(object);
				
				System.out.println(object);
				System.out.println(a);
			}
			response.getWriter().print(a);
		/////////////////////////////////////////////////////////////
			
		}else if(type.equals("2")) {
		
			//////////////////////////////타입 2 개별//////////////////////////////
			//호출할 젳품번호 요청
			int pno = Integer.parseInt( request.getParameter("pno"));
			
			//db처리
			productDto dto = new productDao().getProduct(pno);
			//3. dto -> json 형변환 [ 로직]
			JSONObject object = new JSONObject(); 
			object.put("pno",dto.getPno() );
			object.put("pname",dto.getPname() );
			object.put("pcomment",dto.getPcomment() );
			object.put("pprice",dto.getPprice() );
			object.put("pdiscount",dto.getPdiscount() );
			object.put("pactive",dto.getPactive() );
			object.put("pimg",dto.getPimg() );
			object.put("pdate",dto.getPdate() );
			object.put("pcno",dto.getPcno() );
			//4.응답
			response.getWriter().print(object);
		
			/////////////////////////////////////////////////////////////
			
		}
	
		
		//list -> json
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	//1. 제품등록 메소드 [ post]
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*첨부파일이 있을때마*/
	MultipartRequest multi = new MultipartRequest(
			request,
			request.getServletContext().getRealPath("/admin/pimg"),
			1024*1024*10,
			"UTF-8",
			new DefaultFileRenamePolicy());
	
	
	String pname = multi.getParameter("pname");
	System.out.println(pname);
	String pcomment = multi.getParameter("pcomment");
	System.out.println(pcomment); 
	int pprice = Integer.parseInt( multi.getParameter("pprice"));
	System.out.println(pprice);
	float pdiscount =Float.parseFloat( multi.getParameter("pdiscount"));
	System.out.println(pdiscount);
	String pimg = multi.getFilesystemName("pimg");
	System.out.println(pimg);
	
	int pcno = Integer.parseInt(multi.getParameter("pcno"));

	productDto dto = new productDto( 
			0, pname ,pcomment, 
			pprice, pdiscount ,(byte)0,
			pimg , null ,pcno);
	
	System.out.println(dto.toString());
	
	
	boolean result = new productDao().setproduct(dto);
	response.getWriter().print(result);
	
	
	}
	////////////////////////////////////////////////수정////////////////////////////////////////////////
	@Override
		protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*첨부파일이 있을때마*/
		MultipartRequest multi = new MultipartRequest(
				request,
				request.getServletContext().getRealPath("/admin/pimg"),
				1024*1024*10,
				"UTF-8",
				new DefaultFileRenamePolicy());
		
		int pno = Integer.parseInt(multi.getParameter("pno"));
		
		String pname = multi.getParameter("pname");
		
		String pcomment = multi.getParameter("pcomment");
		int pprice = Integer.parseInt( multi.getParameter("pprice"));
		
		float pdiscount =Float.parseFloat( multi.getParameter("pdiscount"));
		
		String pimg = multi.getFilesystemName("pimg");
		System.out.println(pimg);
		int pcno = Integer.parseInt(multi.getParameter("pcno"));
		byte pactive  = Byte.parseByte(multi.getParameter("pactive"));
		
		
		System.out.println(pcno);

		productDto dto = new productDto( 
				0, pname ,pcomment, 
				pprice, pdiscount ,pactive,
				pimg , null ,pcno);
		
		
		
		
		
		System.out.println("수정할 컨텐츠" + dto.toString());
		
		
		boolean result = new productDao().getupdate( pname, pcomment, pprice, pdiscount, pimg ,pcno ,pactive ,pno);
		
		response.getWriter().print(result);
		
		
		
		
		
		
	
	}
	
	/////////////////////////////////////////삭제.?///////////////////////////////////////////////////
	@Override
		protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pno  = Integer.parseInt(request.getParameter("pno"));
	//dao
		
		boolean result = new productDao().deleteprodcut(pno);
		
		//3 응답
		response.getWriter().print(result);
	}
	
}
