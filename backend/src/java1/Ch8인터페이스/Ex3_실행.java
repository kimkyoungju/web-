package java1.Ch8인터페이스;

public class Ex3_실행 {
	
	
	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		mycar.run();
		//구현ㄱ 객체 교체
		
		mycar.frontlefttire = new  KumhoTire();
		mycar.frontrighttire = new  KumhoTire();

		mycar.run();
	}
}
