package java1.ch5클래스.Ex8;

public class member {
	
	//자동완성 필드 : 소스에서 아래에서 3번째
	//멤버 
		//1.필드
		String id;
		String password;
		String name;
		
		//2. 생성자 : 객체 생성시 초기값 [필드의 처음값 설정] [처음값이 없으면 안써도 되긴함]
			//* : 생성자가 하나도 정의하지 않으면 기본 생성자 자동추가 
			//주의 : 클래스명과 이름 동일
			//*매개변수 개수에 따라 오버로딩[여러개 사용가능]
		
		//1. 빈 생성자 : 기본생성자
		member(){}
		
		//매개변수가 1개
		member(String id) {this.id = id;}	
		
		//매개변수가 2
		 member(String id, String password) {
				this.id = id;
				this.password = password;
			}	
		
		// 풀 생성자 [ 매개변수가 3개
		 member(String id, String password, String name) {
			this.id = id;
			this.name = name;
			this.password = password;
		}	
		
		//3. 메소드
	
}
