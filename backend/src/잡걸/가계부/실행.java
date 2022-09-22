package 잡걸.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class 실행 {
	
	Scanner scanner = new Scanner(System.in);
	boardercenter aboard = new boardercenter();
		public static void main(String[] args) {
			
			실행 view = new 실행();
			view.main();
			
		}
	
	void main() { 
		while(true) { 
			read();
			System.out.println("[메뉴버튼] 1.추가 2.삭제 3.수정 4.검색 5.통계");
			
			try {
				int ch = scanner.nextInt();
				if(ch == 1) {inmain();}
				else if(ch==2) {delet();}
				else if(ch==3) {update();}
				else if(ch==4) {}
				else if(ch==5) {}
				else {System.out.println("알수 없는 번호 입니다.");}
				
			} catch (Exception e) {System.out.println("선택불가능 작동입니다");}
		}
	}
		
	//1. 내용 추가
	void inmain() {
		System.out.print("날짜:" );String bday = scanner.next();
		System.out.print("금액:" );int price = scanner.nextInt();
		System.out.print("내용:" );String content = scanner.next();
		boolean result = aboard.inmain(bday,price,content);
		if(result) {System.out.println("내용추가작성 성공");}
		else {System.out.println("추가 실패");} 
	}
	
	void read() {
		ArrayList<boarderdto>list = aboard.read();
		for(boarderdto dto  : list) {
			System.out.print(dto.getNum()+"\t");
			System.out.print(dto.getBday()+"\t");
			System.out.print(dto.getPrice()+"\t");
			System.out.print(dto.getContent()+"\n");
		}
	}
	
	
 void delet() { 
		System.out.println("삭제할번호를 눌러주세요"); int delete =scanner.nextInt();
		 boolean result1 = aboard.delet(delete); 
		 if(result1){System.out.println("삭제성공했습니다");}
		 else {System.out.println("삭제실패했습니다");}
 
 }
 
void update() {
	System.out.println("수정할 번호를 눌러주세요");int num = scanner.nextInt();
	System.out.println("수정할 날짜를 적어주세요");String bday = scanner.next();
	System.out.println("수정할 금액을 입력해주세요");int price = scanner.nextInt();
	System.out.println("수정할 내용을 입력해주세요");String content = scanner.next();
	boolean result2 = aboard.update(num,bday,price,content);
	if (result2) {System.out.println("수정되었습니다");}
	else {System.out.println("수정실패");}
	}
}
	

