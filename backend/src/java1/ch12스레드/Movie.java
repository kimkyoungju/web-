package java1.ch12스레드;

public class Movie implements Runnable {
	//
	private boolean stop = true;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			while( stop ) {
				System.out.println("영화 재생중");
				try {Thread.sleep(1000);}
				catch (Exception e) {
					// TODO: handle exception
				}
					
			}
	}
	
}
