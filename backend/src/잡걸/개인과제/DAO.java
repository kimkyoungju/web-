package 잡걸.개인과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public DAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/rand",
					"root",
					"1234");
			System.out.println("연결성공");
		} catch (Exception e) {
			System.out.println("오류"+e);
		}
	}
	ArrayList<DTO> 랜뽑() {
		
		ArrayList<DTO>list = new ArrayList<>();
		String sql = "insert into random_choice values(null,'?')";
		try {
			ps =con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				DTO dto = new DTO(rs.getInt(1),
						rs.getString(2));
				list.add(dto);
			}
			return list;
		}catch (Exception e) {System.out.println("오류발생"+e);
			// TODO: handle exception
		}
		return list;
	}
	
	
}
