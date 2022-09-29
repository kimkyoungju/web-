package java1.Ch07상속.Ex5_타이어예제;

public class KumhoTire extends Tire{
			//빨간줄 이유 : 슈퍼클래스와 생성자가 달라서
	//1.
	
	//2. 

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	//3.
	public boolean roll() {
		++accumulatedRotation; //누적회전수 1씩증가
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "KumhoTire의 수명 :" +
					(maxRotation-accumulatedRotation)+"회");
			return true;// 수명이 있을경우
		}else {
			System.out.println("*** "+location+ "KumhoTire 펑크 ***");
		return false; 	// 수명없을 경우 false [펑크일경우]
		}
	}
	
	
}
