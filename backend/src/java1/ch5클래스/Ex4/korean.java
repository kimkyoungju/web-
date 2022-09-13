package java1.ch5클래스.Ex4;

public class korean {

	//필드
	String nation = "대한민국";
		//클래스 내부에 미리 초기화 -?> 객체 생성시 대한민국으로 초기화
	String name;
	String ssn;
	//1. 매개변수가 있는 생성자
	korean(String n, String s){
		name = n;
		ssn = s;
	}
	
	//2. 매개변수가 없는 생성자
	public korean() {}
	//메소드
}



