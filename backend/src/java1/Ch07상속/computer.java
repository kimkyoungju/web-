package java1.Ch07상속;

public class computer extends Calculator {
	
	double areaCircle(double r) {
		System.out.println("컴퓨터 객체의 원 넓이 함수 실행");
		return Math.PI * r * r;
	}
	
}
