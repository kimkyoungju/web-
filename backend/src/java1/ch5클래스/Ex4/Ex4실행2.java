package java1.ch5클래스.Ex4;

public class Ex4실행2 {

	public static void main(String[] args) {
		//1.객체 선언
		korean k1 = new korean("안태섭","001006-123213");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		
		korean k2 = new korean();
		k2.name = "김경주";
		k2.ssn = "010101-010123";
		
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
	
	}
}
/*매개변수[인수] :외부로 부터 들어오는 변수




 */