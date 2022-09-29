package java1.Ch07상속.Ex5_타이어예제;

public class Tire {
	//1. 필드
	public int maxRotation; //최대 회전수(타이어수명)
	public int accumulatedRotation; //누적 회전수
	public String location;
	
	
	
	//2. 생성자
	public Tire(int maxRotation, String location) {
		// super(); //object 생성자꺼
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//3. 메소드
	public boolean roll() {
		++accumulatedRotation; //누적회전수 1씩증가
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "tire의 수명 :" +
					(maxRotation-accumulatedRotation)+"회");
			return true;// 수명이 있을경우
		}else {System.out.println("*** "+location+ "tire 펑크 ***");
		return false; 	// 수명없을 경우 false [펑크일경우]
		}
	}
	
	
}
