package databass.자바연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC실행2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conne1 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/shop_db3",
					"root",
					"1234");
			System.out.println("db연동 성공");
			
			/*
			 * String 연동 =
			 * "insert into product values('바나나','1500','2021-07-01','델몬트','17')" +
			 * ",('카스','2500','2022-03-01','ob','3')," +
			 * "('삼각김밥','800','2023-09-01','cj','22')";
			 * 
			 * //2. 조작 PreparedStatement sq = conne1.prepareStatement(연동);
			 * 
			 * //3.실행 sq.executeUpdate();
			 */
			//수정 
			/*
			 * 연동 = "update product set amount = '10' where product_name ='카스'"; sq =
			 * conne1.prepareStatement(연동); sq.executeUpdate();
			 * 
			 * //삭제 연동 = "delete from product where product_name ='삼각김밥'"; sq =
			 * conne1.prepareStatement(연동); sq.executeUpdate();
			 */
			  String 연동 = "select * from product "; 
			  PreparedStatement sq=conne1.prepareStatement(연동);
			  ResultSet re = sq.executeQuery();
			 
			  while(re.next()){ 
			  System.out.println("이름 :"+ re.getString(1)+"\t");
			  System.out.println("가격 :"+ re.getString(2)+"\t"); 
			  System.out.println("날짜 :"+re.getString(3)+"\t"); 
			  System.out.println("회사 :"+ re.getString(4)+"\t");
			  System.out.println("수량 :"+ re.getString(5)+"\n"); }
			  
			
		}catch(Exception e) { System.out.println("연동 실패:"+e);}
			// TODO: handle exception
		}
		
	}

