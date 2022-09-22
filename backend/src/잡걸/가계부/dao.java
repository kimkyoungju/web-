package 잡걸.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class dao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public dao() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boarder",
						"root",
						"1234");
		} catch (Exception e) {System.out.println("db연결 실패" +e);}
	}
	
	boolean inmain(boarderdto dto) {
		String sql = "insert into buylist values(null,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,dto.bday);
			ps.setInt(2,dto.price);
			ps.setString(3,dto.content);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("추가 실패"+e);}
		return false;
	}
	 boolean delet(int dto1) { 
		 String sql ="delete from buylist where num = ? "; 
		 
		 try {
			 ps = con.prepareStatement(sql);
			 ps.setInt(1,dto1);
			 ps.executeUpdate();
			 return true;
		 } catch (Exception e) {System.out.println("연결실패"+e);	}
		return false;
	 }	
	
	 boolean update(boarderdto dto1) {
		 String sql = "update buylist set bday = ? , price = ? ,content = ? where num = ?";
		 try {
			 ps = con.prepareStatement(sql);
			 ps.setString(1,dto1.bday);
			 ps.setInt(2,dto1.price);
			 ps.setString(3,dto1.content);
			 ps.setInt(4,dto1.num);
			 ps.executeUpdate();
			 return true;
		 } catch (Exception e) {System.out.println("연결실패"+e);	}
		return false;
	 }	
	 
	 
	 
	//2. 내용 출력 
	ArrayList<boarderdto> read(){
		ArrayList<boarderdto>list = new ArrayList<>();
		String sql = "select *from buylist";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				boarderdto dto = new boarderdto(rs.getInt(1),
				rs.getString(2),
				rs.getInt(3),
				rs.getString(4));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("오류"+e);}
		return list;

	}
	
	 
}	 
