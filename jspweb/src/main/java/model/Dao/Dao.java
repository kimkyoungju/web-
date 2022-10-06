package model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

public class Dao {
	

		Connection con;	PreparedStatement ps;	ResultSet rs;
		public Dao() {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				 con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/jspweb", 
						"root",
						"1234");
			}catch (Exception e) { System.out.println(e);}
		}
		
	}
	


