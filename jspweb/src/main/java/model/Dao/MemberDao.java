package model.Dao;

import com.mysql.cj.protocol.Resultset;

import model.Dto.Memberdto;

public class MemberDao extends Dao {
	
	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() { return mdao;}
	
	public boolean signup( Memberdto dto ) {
		String sql ="insert into"
				+ " member( mid ,mpassword,mname,mphone,memail,maddress)"
				+ " values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpassword() );
			ps.setString( 3 , dto.getManme() );
			ps.setString( 4 , dto.getMphone() );
			ps.setString( 5 , dto.getMemail() );
			ps.setString( 6 , dto.getMaddress() );
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println(e);}
		return false; 	
	
	
	
	}
	
	
	public boolean login( String id , String password) {
		String sql = "select * from member "
				+ "where mid=? and mpassword = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			ps.setString( 2 , password );
			rs = ps.executeQuery();
			if( rs.next() ) { // 만약에 다음 레코드가 존재하면
				return true;
			}
		}catch (Exception e) { System.out.println(e); }
		return false;
	}
	
}
