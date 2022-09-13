package java1.ch5클래스.Ex5;

public class Ex5실행 {
	public static void main(String[] args) {
		//1.객체 선언: 빈생성자
		car car1 = new car();
		
		//2. 객체 선언: 매개변수가 1개인 생성자
		car car2 = new car("자가용");
		
		//3. 객체 선언 매개변수가 2개인 생성자
		car car3 = new car("자가용","빨강");
		
		//4. 객체선언 ㅣ 매개변수가 3개인 생성자
		car car4 = new car("택시","검정",200);
	}
}
