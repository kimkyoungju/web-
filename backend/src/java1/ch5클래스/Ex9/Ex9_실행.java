package java1.ch5클래스.Ex9;

import java.util.Scanner;

public class Ex9_실행 {
	public static void main(String[] args) {
		
		
		//1객체 생성
		Calculator myCalc = new Calculator();
		
		
		//2. 메소드 호출(매개변수x반환x)[객체명.메소드명();
		myCalc.powerOn();
		
		
		//3. 메소드 호출(매개변수 5, 6 반환 1개)
		System.out.println("result1 :"+ myCalc.plus(5, 6));
		int result1 = myCalc.plus(5, 6);
			//메소드가 돌려준 값 [반환값]을 result1 변수에 저장
			//반환 타입과 변수의  자료형 동일해야 한다
		System.out.println("result1:" +result1);
		
		//3.
		byte x =10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 :" +result2);

		myCalc.powerOff();
	}
}
