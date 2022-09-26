package java1.ch12스레드;

public class 스레드b extends Thread {

	public 스레드b() {setName("스레드b");}
	@Override
	public void run() {
		for(int i =0 ; i<2 ; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}

}
