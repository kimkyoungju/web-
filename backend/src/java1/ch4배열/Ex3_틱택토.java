package java1.ch4배열;

import java.util.Random;
import java.util.Scanner;

public class Ex3_틱택토 {
	public static void main(String[] args) {
		//문자 9개 저장하는 배열 선언과 초기값 [처음값]
		
		Scanner scanner = new Scanner(System.in); 
		String 승리자 = "c";
		String[ ] 게임판 = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
	
		while(true) {
		for(int i = 0; i<9; i++) {
		if(i % 3 == 0){System.out.println();}
		System.out.print(게임판[i]);
			}

		
		while(true) {
			System.out.print("입력해주세요");int 입력 = scanner.nextInt();
			if(입력<0 || 입력>9) {System.out.println("깔수없다");}
			if(게임판[입력].equals("[ ]")) {게임판[입력] = "[o]"; break;}
			else {System.out.println("안내 이미 존재하는 위치입니다");}
		}
		
		
		int 빈공간 = 0;
		for(int i = 0; i<9; i++) {if( !게임판[i].equals("[ ]") ) 빈공간++;}
		if( 빈공간 == 9 ) { System.out.println("무승부"); break; }
		
		
		
			// 난수 생성
			 while(true) {
				Random 랜덤 = new Random();
				int 난수  =  랜덤.nextInt(9);
				 if(게임판[난수].equals("[ ]")) {게임판[난수] ="[x]";  break;}
			}
			 
			
			 for(int i= 0; i<=6; i+=3) { // 0 1 2  
					if(!게임판[i].equals("[ ]")&&게임판[i]==게임판[i+1]&&게임판[i+1]==게임판[i+2]) {
						승리자 = "i";
						break;
			 			}	
			 }for(int i= 0; i<3; i++) { // 0 1 2  
					if(!게임판[i].equals("[ ]")&&게임판[i]==게임판[i+3]&&게임판[i+3]==게임판[i+6]) {
						승리자 = "i";
						break;
			 			} 
			 	}
			 if(!게임판[0].equals("[ ]")&&게임판[0]==게임판[4]&&게임판[4]==게임판[8]) {
					승리자 = "i";
					
		 			} 
			 if(!게임판[2].equals("[ ]")&&게임판[2]==게임판[4]&&게임판[4]==게임판[6]) {
					승리자 = "i";
		 			} 
			 for(int i= 0; i<=6; i+=3) { // 0 1 2  
					if(!게임판[i].equals("[ ]")&&게임판[i]==게임판[i+1]&&게임판[i+1]==게임판[i+2]) {
						승리자 = "y";
						break;
			 			}	
			 }for(int i= 0; i<3; i++) { // 0 1 2  
					if(!게임판[i].equals("[ ]")&&게임판[i]==게임판[i+3]&&게임판[i+3]==게임판[i+6]) {
						승리자 = "y";
						break;
			 			} 
			 	}
			 if(!게임판[0].equals("[ ]")&&게임판[0]==게임판[4]&&게임판[4]==게임판[8]) {
					승리자 = "y";
					
		 			} 
			 if(!게임판[2].equals("[ ]")&&게임판[2]==게임판[4]&&게임판[4]==게임판[6]) {
					승리자 = "y";
		 			} 
			 
			 
			 if(승리자.equals("i")) {
				 System.out.print("알림) 이겨따 내가");
		}else if(승리자.equals("y")) {
			System.out.println("컴퓨터가 이겨써");
			}
			 
		}
	
	}//m e
}//c e	
/*
	틱택토 게임 
	[조건] 
	1. 게임판 9칸사용 => 배열 [0~8]
		1. string 배열 클래스는 비교연산자 불가능 --> ==[x] 그래서 
		문자열.equles(문자열)
		!문자열1.equles(문자열2)
	2. 사용자가 알을 두고자하는 위치 [인덱스] 입력 [0~8]
		1. 선택된 위치가 이미 다른 알이 존재하면 재입력[중복제거]
	3. 컴퓨터가 난수 생성[0~8]
		1. 난수의 위치가 다른 알이 존재하면 재생성[중복제거]
	4. 승리자 판단[ 1. 가로로 2. 세로로 3.대각선 4. 무승부]
		
	[출력]
				출력 예시
					 [ ] [ ] [ ] 
					 [ ] [ ] [ ]
					 [ ] [ ] [ ]
	
while(true) {
			 for(int i = 0; i<=6; i+=3) {	// 0 1 2 // 3 4 5 // 6 7 8
					if(!게임판.equals("[ ]")&&(게임판.equals("[i]"))==게임판.equals("[i+1]")&&게임판.equals("[i+1]")==게임판.equals("[i+2]")) {	
							System.out.println("승리");return;
						}
				}
			}
*
*
*/