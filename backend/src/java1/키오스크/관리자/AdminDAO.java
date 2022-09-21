package java1.키오스크.관리자;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdminDAO {
	
	//1.필드
	private Connection con;				//db연동 인터페이스
	private PreparedStatement ps;		//sql 연동/ 조작 인터페이스
	private ResultSet rs;				//sql 결과 [ 쿼리 ] 조작 인터페이스 
	private static AdminDAO adao = new AdminDAO(); // 싱글톤 객체 
	//2. 생성자
	private AdminDAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mmth",
					"root",
					"1234");
		}catch (Exception e) {System.out.println("db연동실패"+e);}
	}
	//3.메소드
		//1. 외부에서 싱글톤 객체를 반환하는 메소드 [ getInstance : 
	public static AdminDAO getInstance() {return adao;}
	
	//4. 기능 메소드
		//1. 메뉴추가
	
	
	boolean inMenu(String menuname) {
			//1. sql 작성
		String sql = "insert into menu values (null,?)";
			//2. sql 연결 // 조작
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, menuname); // ?: 첫번째 ? 에 변수 대입 
			ps.executeUpdate();
			return true;			//4.반환
		} catch (Exception e) {System.out.println("메뉴추가 실패"+e);
			return false;}
		//3. sql 실행 /결과 조작
	}
		//2. 메뉴 호출
 ArrayList<MenuDTO> getMenu() {
		ArrayList<MenuDTO>list = new ArrayList<>();
		String sql = "select * from menu";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//rs.next() : 다음 레코드
				//검색 레코드  - > 객체화
				MenuDTO menu = new MenuDTO(rs.getInt(1),rs.getString(2));
				list.add(menu);
			}
			return list;
		} catch (Exception e) {System.out.println("메뉴추가 실패"+e);}
		return list;
	}
		//3. 제품추가
	boolean inProduct(ProductDTO productdto){
		ArrayList<ProductDTO>list = new ArrayList<>();
		String sql = "insert into product values (null,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, productdto.getPname());
			ps.setInt(2, productdto.getPprice());
			ps.setString(3, productdto.getPcomment());
			ps.setShort(4, productdto.getPamount());
			ps.setByte(5, productdto.getMno());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) { System.out.println("제품 추가 실패 ");}
		return false;
	/*String sql = "insert into product values (null,?,?,?,?,?)";
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while( rs.next()) {
			MenuDTO menu = new MenuDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
		}
		
	} catch (Exception e) { System.out.println("제품 추가 실패 ");}
	*/
	}
	
		//4. 주문확인
}
