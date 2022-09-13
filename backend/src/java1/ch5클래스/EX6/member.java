package java1.ch5클래스.EX6;

public class member {
	//1.필드
	String id;
	String password;
	String name;
	int point;
	//2.생성자
		//1.빈생성자
		public member() {}
		//2. 회원가입시 사용되는 객체 생성자	
		member(String id, String password,String name,int point){
		 this.id = id; //this 사용 이유 [내부필드와 매개변수의 이름이 동일할 경우 식별용]	
		 this.password = password;
		 this.name = name;
		 this.point =point;
		}
			//3. 회원 수정시 비밀번호 변경시 사용되는 객체 생성자
		member(String password){
			this.password = password;
		}
			//로그인[아이디,비밀번호]시 사용되는 객체 생성자
		member(String id, String password){
			this.id = id;
			this.password = password;
		}
	//3.메소드
}
