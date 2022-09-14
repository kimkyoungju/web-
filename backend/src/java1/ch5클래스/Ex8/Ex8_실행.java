package java1.ch5클래스.Ex8;

import java.util.Scanner;

public class Ex8_실행 {
	
	public static void main(String[] args) {
		//객체명에 . or 변수명.
		//클래스명.메소드명()[x]
		//0. 입력객체
		Scanner scanner = new Scanner(System.in);
			
		
		//1.객체 생성
		member m1 = new member();
			
			//객체가 멤버에 접근할때 .연산자
			m1.id = "qwe";
			m1.password = "qwe";
			m1.name ="qwe";
		
		//2객체 생성 [1개짜리]
		member m2 = new member("qwe");

		//2개짜리
		member m3 = new member("qwe","qwe");
		
		member m4 = new member("qwe","qwe","qwe"); 
		
	}
}
