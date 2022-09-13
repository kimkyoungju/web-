package java1.ch5클래스.EX2;

public class Ex2실행 {
		public static void main(String[] args) {
			//1. 객체 선언[car 클래스]
			car mycar = new car();
				//1. car   : 클래스명
				//2. mycar : 객체명
				//3. new   : 객체 선언시 사용되는 키워드
				//4. car() : 객체 선언시 초기값 담당
			//2. 필드 호출[객체명.필드명]
				//1.  .(점) 연산자를 이용한 멤버 호출
			System.out.println("제작회사 :"+ mycar.company);
			System.out.println("모델명 :"+mycar.model);
			System.out.println("색깔:"+mycar.color);
			System.out.println("최고속도:"+mycar.maxspeed);
			System.out.println("현재속도:"+mycar.speed);
			
			//3. 필드 값 변경 [ 객체명.필드명 = 새로운 값]
			mycar.speed = 60;
			System.out.println("수정된 먹방속도 : "+mycar.speed);
		}
}
