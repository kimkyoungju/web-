package java1.Ch07상속.Ex5_타이어예제;

public class Ex5_실행 {
	
	public static void main(String[] args) {
		//1.자동차 생성
		Car car = new Car();
			//tire 객체 4개
		
		//2. 자동차 5번회전
		for(int i = 1; i<=3
				
				; i++) {
			boolean[] result = car.run();
			//3. 만약에 펑크이면 타이어 교체
			if(!result[0]){ //앞왼쪽
				car.frontLeftTire1 = new HankookTire(15,"앞왼쪽");
			}
			if(!result[1]){//앞 오른쪽
				car.frontRightTire2 = new HankookTire(13,"앞오른쪽");
			}
			if(!result[2]){//뒤 왼쪽
				car.backLeftTire3 = new KumhoTire(14,"뒤왼쪽");
			}
			if(!result[3]){//뒤 오른쪽
				car.backRightTire4 = new KumhoTire(17,"뒤오른쪽쪽");
			}	
		}
	}
}
