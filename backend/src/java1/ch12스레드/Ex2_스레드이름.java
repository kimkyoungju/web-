package java1.ch12스레드;

public class Ex2_스레드이름 {
	
	public static void main(String[] args) {
		
		Thread 메인스레드 = Thread.currentThread();	//Thread.currentThread : 현재 스레드 호출 
		System.out.println("main 함수에 있는 스레드 이름 :" +메인스레드.getName());
	
		스레드a 스레드A = new 스레드a();
		스레드A.start();

		스레드b 스레드b = new 스레드b();
		스레드b.start();
	}
	
}
