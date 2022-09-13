package java1.ch5클래스.EX1;

public class Ex1실행 {
		public static void main(String[] args) {
			/*
			 * 1. 클래스 기반으로 객체 선언 
				 * 1. 클래스명 : 객체 생성시 사용되는 설계도 
				 * 2. 변수명 : 객체이름으로 사용할 임의로 정하기 
				 * 3.new 연산자: 힙영역에 메모리 할당후 주소값을 스택영역 활당
				 *  4. 생성자명 : 객체 생성시 초기값 담당 [클래스명과 동일]
			 */
			student s1 = new student();
			//1 	2  =  3    4 
			//  스택 영역 = 힙 영역
			System.out.println("s1 변수가 student 객체를 참조합니다.");
			
			student s2 = new student();
			System.out.println("s2 변수가 student 객체를 참조합니다.");
			
			//s1== s2 xx
			//!! : 동일한 클래스로 객체 선언시 서로 객체[주소가 다름 ]가 생성
		}
}
