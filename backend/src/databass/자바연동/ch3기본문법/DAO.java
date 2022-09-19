package databass.자바연동.ch3기본문법;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java1.ch5클래스.EX6.member;


public class DAO {

	//1. 필드
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	
	//2. 생성자 : 객체생성시 초기값 
	public DAO() {
	
		try {	
	con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/market_db",
			"root",
			"1234");
	}catch (Exception e) {System.out.println("오류발생 "+e);}	 
	}
	//3. 메소드 
	//1.예제1 : 레코드 10 줄 -> memberdto 8개 -> 배열/ 리스트
	public ArrayList<MemberDto>예제1결과(){
		
		ArrayList<MemberDto> list = new ArrayList<>();// MemberDto로 생성된 객체 여러개를 담을수 있는 list 객체 선언
		//1. sql 작성
		
		String sql = "select * from member";
		//2. sql 연결 조작
		try {
			ps = con.prepareStatement(sql);
			rs =  ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto(
						rs.getString(1), rs.getString(2),
						rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getShort(7), rs.getString(8));
				list.add(dto);
				}
			return list;
			} catch (Exception e) {
			System.out.println("에제1 오류"+e);}
		return list;
	}// 예제1
	ArrayList<String> 예제2결과() {
		//string 객체 여러개를 저장할 수 있는 list
		ArrayList<String>list = new ArrayList<>();
		
		//1. dql 작성 
		String sql = "select mem_name from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) { //rs.next 다음 레코드 이동
				list.add(rs.getString(1));
				
			}
			return list;
		} catch (Exception e) {
		System.out.println("예제 2 오류" + e);
		
		return list;
		}
		
	}//예제2 e
	ArrayList<MemberDto>예제3결과 () {
		
	ArrayList<MemberDto>list = new ArrayList<>();
		
	String sql = " select * from member where mem_name ='블랙핑크'";
	
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
	
			MemberDto dto = new MemberDto(
					rs.getString(1), rs.getString(2),
					rs.getInt(3), rs.getString(4),
					rs.getString(5), rs.getString(6),
					rs.getShort(7), rs.getString(8));
			list.add(dto);
		
		return list;
	} catch (Exception e) {System.out.println("예제 3 오류" + e);}
	return list;
	}// 예제 3 e
	
	ArrayList<MemberDto>예제4결과 () {
	String sql = "select mem_id , mem_name from member where height <= 162";
	
	ArrayList<MemberDto>list = new ArrayList<>();
	try {
		ps= con.prepareStatement(sql);
		rs = ps.executeQuery();
		while( rs.next()) {
			MemberDto dto = new MemberDto(
			rs.getString(1), rs.getString(2));
			list.add(dto);
		}
		return list;
	} catch (Exception e){System.out.println("예제4 오류"+ e);}
	return list;
	}// 예제 4 e
	ArrayList<MemberDto> 예제5결과() {
		String sql = " select mem_name , height , mem_number from member where height >= 165 and mem_number > 6";
		ArrayList<MemberDto>list = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.mem_name = rs.getString(1);

				dto.height = rs.getShort(2);
				dto.mem_number = rs.getInt(3);
				list.add(dto);
				
			}
			return list;
		} catch (Exception e) {System.out.println("");}
		return list;
	}
	ArrayList<MemberDto>예제6결과() {
		String sql = "select mem_name , height , mem_number from member where height >= 165 or mem_number > 6";
		ArrayList<MemberDto>list = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.mem_id = rs.getString(1);
				dto.height = rs.getShort(2);
				dto.mem_number = rs.getInt(3);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제6오류" + e);}
		return list;
	}
	ArrayList<MemberDto>예제7결과 () {
		
		ArrayList<MemberDto>list = new ArrayList<>();
			
		String sql = "select * from member where mem_name like '우%'";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto(
						rs.getString(1), rs.getString(2),
						rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getShort(7), rs.getString(8));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제 7 오류" + e);}
		return list;
		}
	ArrayList<MemberDto>예제8결과(){
			ArrayList<MemberDto>list = new ArrayList<>();
			String sql = "select * from member where mem_name like '__핑크'";
			
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					MemberDto dto = new MemberDto(
							rs.getString(1), rs.getString(2),
							rs.getInt(3), rs.getString(4),
							rs.getString(5), rs.getString(6),
							rs.getShort(7), rs.getString(8));
						list.add(dto);
				}
				return list;
			} catch (Exception e) {System.out.println("예제8 오류 " + e);}
			return list;
		}
	ArrayList<MemberDto>예제9결과() {
		ArrayList<MemberDto>list = new ArrayList<>();
		String sql = " select mem_id , mem_name , debut_date from member order by debut_date desc";
		
		try {
			ps =con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.mem_id = rs.getString(1);
				dto.mem_name = rs.getString(2);
				dto.debut_date = rs.getString(3);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제9 오류 " +e);}
		return list;
	}
	ArrayList<MemberDto>예제10결과() {
		ArrayList<MemberDto>list = new ArrayList<>();
		String sql = "select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc ";
		
		 try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
					dto.mem_id = rs.getString(1);
					dto.mem_name = rs.getString(2);
					dto.debut_date = rs.getString(3);
					dto.height = rs.getShort(4);
					list.add(dto);
			}
			return list;
		} catch (Exception e) {	System.out.println("예제10 오류" +e);	}
		 return list;
	}
	ArrayList<MemberDto> 예제11결과() {
		
		ArrayList<MemberDto>list = new ArrayList<>();
		String sql = " select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc , debut_date asc";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.mem_id = rs.getString(1);
				dto.mem_name = rs.getString(2);
				dto.debut_date = rs.getString(3);
				dto.height = rs.getShort(4);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제11 오류 "+e);}
		return list;
	}
	ArrayList<MemberDto> 예제12결과() {
		ArrayList<MemberDto>list =new ArrayList<>();
		String sql = "select mem_name , height  from member order by height desc limit 3 , 2 ";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
					dto.mem_name = rs.getString(1);
					dto.height = rs.getShort(2);
					list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("12오류 "+e);}
		return list;
	}
	void 예제13결과() {
		String sql = "select distinct addr from member";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto(rs.getString(1));
				list.add
			}
		} catch (Exception e) {System.out.println("13오류"+e);}
	}
	
}
