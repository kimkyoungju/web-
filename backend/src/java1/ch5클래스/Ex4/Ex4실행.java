package java1.ch5클래스.Ex4;

public class Ex4실행 {
	public static void main(String[] args) {
		//1. 객체 선언[오류발생 : 생성자에 매개변수 생략]
		car mycar = new car();	
		// 기본 생성자가 없기 떄문에
		// 문제해결 : 클래스 내부에 빈 생성자 생성 
		mycar.color = "검정";
		mycar.cc =3000;
		
		//2. 객체선언
		car mycar2 = new car("검정",3000);
	}
}
