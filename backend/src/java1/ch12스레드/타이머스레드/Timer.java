package java1.ch12스레드.타이머스레드;

public class Timer extends Thread{

	
	
	private boolean stop = true;
	private boolean wait = true;
	
	
	
	
	public boolean isWait() {
		return wait;
	}

	public void setWait(boolean wait) {
		this.wait = wait;
	}

	public void setstop(Boolean stop) {this.stop = stop;}
	
	public void run() {
		int i = 1;
		while(stop) { //외부에서 stop변수 조작해서 함수 종료시키자
			if(wait) {
			System.out.println(i+"초");			
			i++;
			}
				try {Thread.sleep(1000);}
				catch (Exception e) {}
				System.out.println("스레드 회전중");
		}
		
	}//e

	
}//e
