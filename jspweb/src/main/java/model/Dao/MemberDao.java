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
	
	
	public int login( String id , String password) {
		String sql = "select * from member where mid= ?"; //아이디 검증		
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			rs = ps.executeQuery();
			if(rs.next()) {
				sql = "select * from member where mid = ? and mpassword=?";
				ps= con.prepareStatement(sql);
				ps.setString(1, rs.getString(2)); //첫번째 select 찾은 데이터를 첫번째 ? 대입
				ps.setString(2, password);
				rs= ps.executeQuery();
				if(rs.next()) {return 1;}
				return 2; // 패스워드가 틀렸다는 뜻
			}
		}catch (Exception e) { System.out.println(e); return 3;} // 데이터 베이스 오류 뜻
		return 0; // 없다는 뜻
	}
	
	
	//3. 아이디 찾기
	
	public String findid (String mname, String memail) {
		String sql = "select * from member where mname=? and memail =?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mname);
			ps.setString(2, memail);
			rs= ps.executeQuery();
			//찾은레코드
			if(rs.next())return rs.getString(2);
		} catch (Exception e) {
			System.out.println(e);
			 //동일한 정보가 없으면 
		}
		return null;
	}
	
	
	//4. 비밀번호 찾기 [임시비밀번호 발급여부 판단]
	public boolean findpassword(String mname, String mid) {
		String sql = "select * from member where mname=? and mid =?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, mname);
			ps.setString(2, mid);
			rs = ps.executeQuery();
			if(rs.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	
	}
	
	//5. 임시비밀번호 업데이트 
	public boolean passwordchange(String mid, String randstr) {
		String sql = "update member set mpassword =? where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, randstr);
			ps.setString(2, mid);
			ps.executeUpdate(); return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
}
