package java1.ch5클래스.Ex15_정적멤버;

public class Calculator {
	//1.필드
	double pi =3.14159; //인스턴스 필드 = 객체마다 메모리할당 
	static double pi2 = 3.14159; // 정적필드 = 메소드영역 메모리 할당
	
	int plus1(int x , int y){
		return x+y;
	}
		static int plus(int x, int y) {
			return x +y;
	}
		int minus1(int x, int y) {return x - y;} 
	
		static int minus2(int x, int y) {return x - y;} 
}
