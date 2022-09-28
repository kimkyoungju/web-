package java1.Ch07상속;

public class Ex1_상속 {

	public static void main(String[] args) {
		//1. 객체 생성 [ 클래스명 객체명 = new 생성자]
		
		
		DmbcellPhone dmbcellPhone = new DmbcellPhone("자바폰", "검정", 10);
		
		//2.객체가 상속받은 필드 호출
		System.out.println("모델:"+dmbcellPhone.model);
		System.out.println("색상:" +dmbcellPhone.color);
		
		
		//3.본인 클래스
		System.out.println("채널:"+dmbcellPhone.channel);
		
		
		//4. 객체[클래스]가 상속받은 메소드 호출
		dmbcellPhone.poweron();
		dmbcellPhone.bell();
		dmbcellPhone.sendVoice("여보세요.");
		dmbcellPhone.receiveVoice("안녕하세요 저는 김경주인데요.");
		dmbcellPhone.sendVoice("누구라고요?");
		dmbcellPhone.hangup();
		
		//5.본인클래스
		dmbcellPhone.trunonDmb();
	}
	
	
}
