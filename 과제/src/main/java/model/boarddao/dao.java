package model.boarddao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class dao {
	
	Connection con  ; PreparedStatement ps; ResultSet rs;
	
	public dao() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boardin",
					"root",
					"1234");
				
				System.out.println("db연동성공");		
		} catch (Exception e) {System.out.println("dao"+e);}
	}
	
	
}
