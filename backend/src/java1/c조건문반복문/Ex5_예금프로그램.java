package java1.c조건문반복문;

import java.util.Scanner;

public class Ex5_예금프로그램 {
	//1. 메인 스레드 내장
	public static void main(String[] args) {
		///161 확인문제
		boolean run = true; //종료하는 스위치 역활 변수;
		int balance = 0; //금액을 저장하는 변수?
		Scanner  금액입력 = new Scanner(System.in);	//입력 객체
		//객체 선언 : 클래스명 변수명 = new 생성자 ( 매개변수 )
			//객체마다 변수와 메소드(함수)포함 = 멤버 
			// 객체의 멤버 호출 (.) 접근연산자
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("=======================");
			System.out.print("선택>");int ch = 금액입력.nextInt();
			if(ch==1) {System.out.println("안내) 예금액>"); balance += 금액입력.nextInt();}
			else if(ch==2) {System.out.println("안내) 출금액>"); 
				int 돈 = 금액입력.nextInt();
				if(balance <돈){
					System.out.println("잔고부족");
				}else{balance -= 돈;}
			
			balance -= 금액입력.nextInt();}
			else if(ch==3) {System.out.println("안내) 잔고>"+ balance); }
			else if(ch==4) {System.out.println("안내) 종료");break;}
			else {System.out.println("알수 없는 그세계로 0과1의 세계로 떠납니다");}
		}
		System.out.println("프로그램 종료");
	}//m e
}//c e
