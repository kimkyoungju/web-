package java1.ch5클래스.Ex14_인스턴스멤버;

public class Ex14실행 {

	public static void main(String[] args) {
		//1. 객체선언
		// 클래스명 객체명 = new 생성자 
		car myCar = new car("포르쉐");
		car yourCar = new car("벤츠");
		myCar.run();
		yourCar.run();
		
	}
	
}
