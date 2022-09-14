package java1.ch5클래스.Ex11;

public class Ex11_실행 {
	
	public static void main(String[] args) { //코드를 읽어주는[스레드] 포함된 함수
		
		//run 메소드 호출  = 동일한 클래스에 존재
		//방법 1. 메소드 선언시 main함수가 해당 메소드 먼저 읽기 static 사용
		run();
		//방법 2.
		Ex11_실행 ex11_실행 = new Ex11_실행();
		ex11_실행.run2();
	}//me
	
	//1. 함수 선언[반환x 매개변수x ]
	static void run(){
		while(true) {System.out.println("1.회원가입 2.로그인 :");}
	}
		void run2(){
		while(true) {System.out.println("1.회원가입 2.로그인 :");}
	}
	
	
}
