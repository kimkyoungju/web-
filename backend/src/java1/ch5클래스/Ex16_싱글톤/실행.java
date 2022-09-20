package java1.ch5클래스.Ex16_싱글톤;

public class 실행 {
	public static void main(String[] args) {
		
		//객체 선언[ 클래스명 객체명 = new 생성자명]
		//1. 
		//Singleten s1 = new Singleten();
	    
		//Singleten.s1; //오류 : s1객체 private
		Singleten s3 =  Singleten.getInstance();
		Singleten s4 =  Singleten.getInstance();
	
		//s3 이랑 s4는 같다.
		if(s3 == s4) {
			System.out.println("주소값이 같다");
		}else {
			System.out.println("다르다");
		}
	}
}
