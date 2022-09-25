package java1.ch5클래스.Ex18_접근제한자.getset메소드;

public class Car {

	//1. 필드 | 필드의 안전성을 보호하기 위해 모든 필드는 private 권장
	private int speed; // 외부 호출 불가능
	//private boolean 
	
	
	
	
	
	//
	//2. 생성자
	//3. 메소드 [필드에 직접 접근이 불가능하니까 간접 접근을 위한 메소드선언] 
	public int getSpeed () {return speed;}
	
	public void setSpeed(int speed) {
		if(speed <0 ) {this.speed = 0; return;}
		else {this.speed = speed;}
	}
	//public boolean isStop () {return stop;}
	
	public void setStop(boolean stop) {
		//this.stop = stop ; this.speed = 0;
	}
}
