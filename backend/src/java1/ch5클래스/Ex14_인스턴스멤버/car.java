package java1.ch5클래스.Ex14_인스턴스멤버;

public class car {
	//클래스의 멤버 구성
	
	//1.필드
	String model;	//인스턴스멤버
	int speed;		//인스턴스멤버	
	//2. 생성자		: new 다음
		//쓰임 : 객체 선언시 객체필드의 초기값 설정메소드 : 클래스명가 동일하다
		//클래스명 객체명 = new 생성자();
	public car(String model) {
		//생성자명(인수) {필드 초기화}
		//model = model ; [x] 현재클래스의 model 필드명와 매개병수명 동일할 경우 식별 불가능 
		super();
		this.model = model;	//this 키워드 :자신(나) : 식별용 
								//this.필드명 : 현재 클래스의 필드 호출
								//this.메소드명 : 현재 클래스의 메소드 호출
								//this() : 현재 클래스의 생성자 호출
	}
	
	
	//3. 메소드
	void setspeed(int speed) {
		this.speed = speed;
	}
	void run() {
	for(int i = 10; i<=50; i+=10) {
		this.setspeed(i);
		System.out.println(this.model + "가달립니다.(시속 :"+this.speed+"km/h");
		}
	}
}
