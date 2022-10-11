package model.Dao;

import java.util.ArrayList;
import java.util.List;

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
			ps.setString( 3 , dto.getMname() );
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
	
	
	//6.회원정보 호출
	public Memberdto getinfo( String mid ) {
		Memberdto dto = null;
		String sql ="select * from member where mid = ?";
		try {
			ps =  con.prepareStatement(sql);
			ps.setString( 1 , mid );
			rs = ps.executeQuery();
			if( rs.next() ) {
				// 1. 풀생성자 
				dto = new Memberdto(
						rs.getInt( 1 ) , rs.getString( 2 ) , null ,
						rs.getString( 4 ), rs.getString( 5 ) ,
						rs.getString( 6 ), rs.getString( 7 ), 
						rs.getString( 8 ) , rs.getInt( 9 ) 
						);
				
				
				return dto;
			}
		}catch (Exception e) { System.out.println( e );}
		return dto;
	}
	
	//7.모든 회원
	public ArrayList<Memberdto>getinfolist(){
		ArrayList<Memberdto>list = new ArrayList<>();
		String sql = "select * from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Memberdto dto = new Memberdto(rs.getInt(1), rs.getString(2), null,
						rs.getString(4), rs.getString(5)
						, rs.getString(6), rs.getString(7),
						rs.getString(8),rs.getInt(9));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}return list;
	}
	
	
	//8회원탈퇴
	public boolean delete(String mid, String mpassword) {
		String sql ="delete from member where mid =? and mpassword =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mpassword);
			int count = ps.executeUpdate();
			if(count==1) {
			return true;}
		} catch (Exception e) {
			System.out.println(e);
		}return false;
		
	}
	
	
	
}
