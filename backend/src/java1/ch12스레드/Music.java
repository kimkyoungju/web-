package java1.ch12스레드;

public class Music extends Thread{
	
    private	boolean stop = true; 
	//run 무한루프 제어변수 //on/off변경하는 변수 
	
    
    //on/off변경하는 메소드 
    public void setStop(boolean stop) {
    	this.stop = stop;
    }
    
	@Override
	public void run() {
			
		while(stop) {
			System.out.println("음악재생중~~");
			try {Thread.sleep(1000);}
			 catch (Exception e) {}
		}
	}
	
}
