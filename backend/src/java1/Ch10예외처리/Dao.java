package java1.Ch10예외처리;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import 잡걸.가계부.dao;

public class Dao {
	
	//필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static Dao dao = new Dao();
	
	public static Dao getInStance() {return dao;}
	//생성자
	
	
	
	private Dao() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mmth",
					"root",
					"1234");
		}catch(Exception e) {System.out.println(e);} 
	}
	//메소드
	
//	public boolean signup() throws SQLException{
//		String sql = "insert into menu values (null,?)";
//		ps = con.prepareStatement(sql);
//		ps.setString(1, "과자"); // ?: 첫번째 ? 에 변수 대입 
//	 	int result =ps.executeUpdate();
//		if(result == 1) {return true;}
//	}
//	public void login() throws SQLException{
//		String sql = "";
//		ps = con.prepareStatement(sql);
//		ps.executeQuery();
//	}
}
