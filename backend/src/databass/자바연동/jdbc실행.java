package databass.자바연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc실행 {

			public static void main(String[] args) {
				
				//연동 실패 했을경우 그에 대한 대처 코드
				try {//만일 try  괄호 안에서 예외가 발생하면 catch로 코드흐름이 이동
				Class.forName("com.mysql.cj.jdbc.Driver"); //mysql 드라이버 이름
				
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/shop_db3",
						"root",
						"1234");
				System.out.println("DB연동 성공");
				/*
				//member 테이블에 데이터 추가
				//1. 테이블에 데이터 추가
					//1. sql 문법을 " " 감싸고 문자열 변수에 저장 
					String sql ="insert into member values('tess','안테스형','경기 안산시 상록구 부곡동 거주 남성'),"
							+ "('hero','임영웅','서울 은평구 증산동'),"
							+ "('iyou','아이유','인천 남구 주안동'),"
							+ "('jyp','박진영','경기 고양시 장항동')";
					//2. sql 조작 인터페이스 
					PreparedStatement ps = con.prepareStatement(sql);
					//3. sql실행
					ps.executeUpdate();
					
					//박진영주소 변경
					sql = "update member set member_addr ='경기 안산시 상록구 부곡동' where member_id = 'jyp'";
					ps = con.prepareStatement(sql);
					ps.executeUpdate();
					
					//아이유 레코드삭제 
					sql = "delete form member where member_id='iyou'";
					ps = con.prepareStatement(sql); 
					ps.executeUpdate();
					*/
					String sql = "select * from member ";
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();		
						//반복문을 이용한 레코드 하나씩 출력
					//re.next 다음 레코드호출 
					while(rs.next()) {
						System.out.println("아이디:"+rs.getString(1)+"\t");
						System.out.println("회원명:"+rs.getString(2)+"\t");
						System.out.println("회원주소:"+rs.getString(3)+"\t");
					}
				}catch(Exception e) {System.out.println("연동 실패 :" + e);}
			}
}