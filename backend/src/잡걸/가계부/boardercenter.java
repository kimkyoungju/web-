package 잡걸.가계부;

import java.util.ArrayList;

public class boardercenter {

	
		boolean inmain(String bday ,int price,String content) {
			
			boarderdto dto = new boarderdto(0,bday,price,content);
			
			dao dao = new dao();
			return dao.inmain(dto);
		}
		
		//2. 내용호출
		
		ArrayList<boarderdto> read(){
			dao dao = new dao();
			return dao.read();
		}
		
		
		 boolean delet(int delete) {
			 dao dao = new dao();
		 return dao.delet(delete); }
		
		 
		 // 업데이트
		 boolean update(int num, String bday ,int price,String content) {
			 boarderdto dto1 = new boarderdto(num,bday,price,content);
			 dao dao = new dao();
			 return dao.update(dto1);
		 }

}
