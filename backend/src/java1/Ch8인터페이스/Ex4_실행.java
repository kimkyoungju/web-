package java1.Ch8인터페이스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex4_실행 {
	public static void main(String[] args) {
		//1.인터페이스 변수에 구현객체 대입
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//2.인터페이스에 없는 메소드 이므로 사용불가 
		//vehicle.checkFare(); //사용불가
		
		//3. 형변환 [ 인터페이스 -> 객체] instanceof 클래스명  : 관계 확인 
			//      강제 형 변환
		System.out.println("관계확인"+(vehicle instanceof Television));
			//      강제 형 변환
		System.out.println("관계확인"+(vehicle instanceof Bus));
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		
		///컬렉션 프레임워크
		
		List<String>list; //인터페이스 변수 선언
			//1. 인터페이스 변수 에 array list 탑재
		list = new ArrayList<>();
			list.add("안태섭");
			//2.인터페이스 변수에 vecter탑재
		list = new Vector<>();
			list.add("김경주");
			//3. 인터페이스 변수에 linkedlist객체 탑재
		list = new LinkedList<>();
			list.add("zz");
		
			System.out.println(list.toString());
	}
}
