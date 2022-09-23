package java1.Ch11String;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class 달력dao {
	//1.필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static 달력dao dao = new 달력dao();
		//싱글톤을 외부로 호출시키는 메소드 
		public static 달력dao getInstance() {return dao;}
	//2. 생성자[싱글톤용]
	private 달력dao(){
			//private :접근제한자 : 외부 클래스 사용 불가[캡슐화] [ 현 클래스 에서 사용가능
		try {	
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cal",
					"root",
					"1234");
				}catch (Exception e) {System.out.println("오류발생 "+e);}	 
			}
		//3. sql 메소드
	
	boolean 일정추가(String daye ,String memoadd) {
		String sql = "insert into calendar values(null,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, daye);
			ps.setString(2, memoadd);
			ps.executeUpdate();
			return true;
			} catch (Exception e) {System.out.println("연동실패"+e);}
			return false;
		}
		//일정출력 
		
	HashMap<Integer, ArrayList<String>> 일정출력(String year, String month) {
			String sql = "select * "
					+ "from calendar "
					+ "where substring( cdate, 1, 4) = ? "
					+ "and substring( cdate, 6, 2) = ?";
			HashMap<Integer, ArrayList<String>>map = new HashMap<>();
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, year);
				ps.setString(2, month);
				rs = ps.executeQuery();
				while(rs.next()) {
					//레코드 -> 필드2와 필드3 => 리스트 담기
					ArrayList<String>values = new ArrayList<>();
					values.add(rs.getString(2));
					values.add(rs.getString(3));
					map.put(rs.getInt(1), values);
					
				}
				return map;
				
			} catch (Exception e) {System.out.println("문제있음"+e);}
			return map;
		}
	}
	
	
	
		
		
		
		
	
	
	
	
	

