package java1.Ch07상속;
//하위 [ 자식 ] 클래스로 사용할 목적
public class DmbcellPhone extends CellPhone {

		//1.필드
		int channel;
		//2.생성자
		 DmbcellPhone( String model , String color , int channel) {
			this.model = model;  //부모클래스의 필드 
			this.color = color;   //부모클래스의 필드 
			this.channel = channel; //본인 클래스의 필드 
		}
	
		//3.메소드
	
		 void trunonDmb() {
			 System.out.println("채널 :" +channel+"번 DMB 방송 수신을 시작합니다");
		 }
	
}
