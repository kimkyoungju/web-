package model.boarddao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Result;

public class dao {
	
	Connection con  ; PreparedStatement ps; Result rs;
	
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
