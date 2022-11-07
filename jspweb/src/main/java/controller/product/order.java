package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.Dao.MemberDao;
import model.Dao.productDao;
import model.Dto.orderDto;

/**
 * Servlet implementation class order
 */
@WebServlet("/product/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public order() {
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
	String data =	request.getParameter("data");
	String oinfo = request.getParameter("orderinfo");
	int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid"));
	System.out.println(data+"1");

	System.out.println(oinfo);

	//문자열 --> JSON타입 형변환
	JSONParser parser = new JSONParser();

	try {
		//1. 객체 [회원정보 문자열 --> Jsonobject]
		JSONObject jsonObject = (JSONObject)parser.parse(oinfo);
		//2. 리스트 [결제할 제품 리스트 문자열 -> jsonarray]
		JSONArray jsonArray = (JSONArray)parser.parse(data);
		
		String oname = String.valueOf(jsonObject.get("oname"));
		String ophone = String.valueOf(jsonObject.get("ophone"));
		String oddress = String.valueOf(jsonObject.get("oddress"));
		String oquest = String.valueOf(jsonObject.get("oquest"));
		System.out.println(oddress);
		
			
	
		ArrayList<orderDto>list = new ArrayList<>();	
	//3. 반복문 [orderDto 객체  -> Dao 처리]
	for(int i = 0; i<jsonArray.size(); i++) {
		JSONObject object = (JSONObject)jsonArray.get(i);
		//받는 사람 정보
	
		int odamount = Integer.parseInt(String.valueOf( object.get("amount")));
		int pprice = Integer.parseInt(String.valueOf(object.get("pprice")));
		float pdiscount = Float.parseFloat(String.valueOf(object.get("pdiscount")));
		int odprice = Math.round( pprice - (pprice/pdiscount));
		int pstno = Integer.parseInt(String.valueOf(object.get("pstno")));
		//주문 dto
		
		orderDto dto = new orderDto(0, oname, ophone, oddress, oquest, null, mno, 0, odamount, odprice, 0, pstno);
		System.out.println(dto.toString());
		
		//리스트담기
			list.add(dto);
		}
		//db처리 
		boolean result =  new productDao().setorder(list);
		if(result==true) {response.getWriter().print(result);}
		System.out.println(result);
	} catch (Exception e) {System.out.println("json 형변환 오류"+e);}
	}

}
