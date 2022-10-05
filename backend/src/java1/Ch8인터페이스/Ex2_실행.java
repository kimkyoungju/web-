package java1.Ch8인터페이스;

import java.util.Scanner;

public class Ex2_실행 {
	public static Scanner scanner = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		
		게임패드 gpad; //1. 인터페이스 변수
		
		while(true) {
			
			System.out.println("1.축구 2. 비행기:");
			int ch = scanner.nextInt();
			if(ch==1) {
				gpad = new 축구게임(); //2.인터페이스 변수에 구현객체 주소 대입 
				System.out.println("축구게임 탑재");
				
				게임스타트(gpad);
			
			}
			else if(ch==2){
				gpad = new 비행기게임(); 
				System.out.println("비행기게임 탑재");
				
				게임스타트(gpad);
				
			}
			
		}
		
		
	}
	
	public static void 게임스타트(게임패드 gpad) {
		
		
		while(true) {
			char 버튼 = scanner.next().charAt(0);
			if(버튼 =='A') {gpad.A버튼();}
			if(버튼 =='B') {gpad.B버튼();}
			if(버튼 =='C') {gpad.C버튼();}
			if(버튼 =='E') {return;}
			
		}
	}
	
}
