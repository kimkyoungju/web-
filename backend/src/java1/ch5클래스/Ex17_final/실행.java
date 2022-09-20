package java1.ch5클래스.Ex17_final;

public class 실행 {
	public static void main(String[] args) {
		//1. 객체 선언
			// 클래스명 객체명 = new 생성자();
			
			person p2 = new person("123412-1244211","홍길동");
			 
			//p2.nation = "usa";	//오류 : final 필드는 수정 불가
			//p2.ssn = "010101-1244144";
			p2.name = "홍삼원";  //final 아니기 때문에 수정가능
	
			
	}
}
