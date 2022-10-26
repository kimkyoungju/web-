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
public class regist extends HttpServlet {
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
		//list -> json
		
		ArrayList<productDto>list = new productDao().getproductlist();
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
			
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(a);
	
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

	productDto dto = new productDto( 0, pname ,pcomment, pprice, pdiscount ,(byte)0, pimg , null ,pcno);
	System.out.println(dto.toString());
	
	
	boolean result = new productDao().setproduct(dto);
	response.getWriter().print(result);
	
	
	}
}
