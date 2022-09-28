package java1.Ch07상속;

public class Ex3_상속 {
	
	public static void main(String[] args) {
		int r = 10;
		//부모 클래스가 객체 직접 선언
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		//자식 클래스가 객체 선언
		computer computer = new computer();
		System.out.println("원면적 : "+computer.areaCircle(r));
		
	}
}
