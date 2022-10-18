package model.dao;

import model.dao.memberdao;
import model.dto.dto;

public class memberdao extends dao{

	private static memberdao mdao = new memberdao();
	public static memberdao getInstance() { return mdao;}
	
	//가입하기
	public boolean signup( dto dto ) {
		String sql ="insert into shoe( s_name ,s_add,s_id,s_pw,s_phone,s_size)values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getS_name() );
			ps.setString( 2 , dto.getS_add() );
			ps.setString( 3 , dto.getS_id() );
			ps.setString( 4 , dto.getS_pw() );
			ps.setString( 5 , dto.getS_phone() );
			ps.setString( 6 , dto.getS_size() );
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println(e);}
		return false; 	
	
	
	
	}
	
	// 아이디 검사
	public boolean check(String id ,String name) {
		String sql ="select * from shoe where s_id =? and s_name=?";
		try {
			ps= con.prepareStatement(sql);
		    ps.setString(1,id);
		    ps.setString(2, name);
		  rs =  ps.executeQuery();
			if(rs.next())return true;
	} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	
}
