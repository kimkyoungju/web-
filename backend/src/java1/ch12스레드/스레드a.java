package java1.ch12스레드;

public class 스레드a extends Thread {

	
		//생성자
		public 스레드a() {
			setName("스레드a");
			//setname 메소드는 부모 클래스인 Thread 클래스로부터 물려받은 
		}
		//메소드
		@Override //@Override :재정의 | 부모 클래스인 Thread클래스의 메소드를 재정의
		public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
		}
	
}
