package java1.Ch8인터페이스;

public class Television implements RemoteControl{
			//구현을 안해서 빨간줄
	//RemoteControl 인터페이스의 추상메소드를 구현하자

	
	//1.필드
	private int volume;
	//2. 생성자
	
	
	//3.메소드
	
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다");
	}
	
@Override
	public void turnOff() {
	// TODO Auto-generated method stub
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
	// TODO Auto-generated method stub
			if(volume> RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume< RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
	
			}
			System.out.println("현재 tv 볼륨 : " +this.volume);
	}
}
