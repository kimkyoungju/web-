package java1.Ch8인터페이스;

public interface RemoteControl {
	
	//Static final
	public static final int MAX_VOLUME =10;
	public int MIN_VOLUME = 0;
	
	//추상:abstract
	//1.[abstract] : 추상 키워드 생략시 자동으로 추상 선언
	//2. 선언만 하자 ---> 각 클래스에서 정의하자 [ 구현 객체] 
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
