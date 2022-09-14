package java1.ch5클래스.Ex10;

public class Ex10_실행 {
	public static void main(String[] args) {
		//1. 객체 선언
		car myCar = new car();
		
		//2. 객체에 메소드 호출 [인수o 반환x]
		myCar.setGas(5); //매개변수 5/ 반환x
		
		//3. 객체에 메소드 호출
		boolean gasstate= myCar.isLeftGas();
			//매개변수 x/ 반환 boolean
		//4.
		if(gasstate) {
			System.out.println("출발합니다.");
			myCar.run();	//매개변수 x/반환 x
		}
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 있습니다.");
		}else {
			System.out.println("가스를 주입하세요");
		}
	}
}
