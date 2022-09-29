package java1.Ch07상속.Ex5_타이어예제;

public class HankookTire extends Tire{

	
	//1.필드
	
	//2. 생성자
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	//3. 메소드
		//1. roll재정의
		@Override
		public boolean roll() {
			++accumulatedRotation; //누적회전수 1씩증가
			if(accumulatedRotation < maxRotation ) {
				System.out.println(location + "HankookTire의 수명 :" +
						(maxRotation-accumulatedRotation)+"회");
				return true;// 수명이 있을경우
			}else {
				System.out.println("*** "+location+ "HankookTire 펑크 ***");
			return false; 	// 수명없을 경우 false [펑크일경우]
			}
		}

}
