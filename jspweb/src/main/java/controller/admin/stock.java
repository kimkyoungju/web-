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

import model.Dao.productDao;
import model.Dto.productDto;
import model.Dto.stockDto;

/**
 * Servlet implementation class stock
 */
@WebServlet("/admin/stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. 요청 [제품별 모든 재고 확인 -> 제품번호 요청]
		int pno = Integer.parseInt(request.getParameter("pno"));
		// 2. db처리
		ArrayList<stockDto> list = new productDao().getstock(pno);
		//3. 형변환[list -> jsonarray
		JSONArray array = new JSONArray();
		for(stockDto dto : list) {
			JSONObject object = new JSONObject();
			object.put("psno", dto.getPsno());
			object.put("pcolor", dto.getPcolor());
			object.put("pstock", dto.getPstock());
			object.put("psize", dto.getPsize());
			object.put("pstno", dto.getPstno());
			array.add(object);
			}
		
		
		//4. 반환
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.setCharacterEncoding("UTF-8");
		
		String 	psize = request.getParameter("psize");
		int pno = Integer.parseInt(request.getParameter("pno"));
		String  pcolor = request.getParameter("pcolor");
		int pstock = Integer.parseInt(request.getParameter("pstock"));

		
		//2. db 처리
		boolean result = new productDao().setstock( psize , pno , pcolor, pstock);
		
		
		//3. 결과 
		response.getWriter().print(result);	
			
	
	}

}
