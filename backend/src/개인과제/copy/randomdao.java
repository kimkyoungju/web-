package 개인과제.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class randomdao {

	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
		
		public randomdao() {
			
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/rand",
						"root",
						"1234");
			} catch (Exception e) {System.out.println("db연결실패"+e);}
		}
		boolean main(randomdto dto) {
			String sql ="insert into random_choice values(null,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.name_list);
				ps.executeUpdate();
				return true;
			} catch (Exception e) {System.out.println("추가실패"+e);	}
			return false;
			 
		}
	
	
}
