package java1.ch5클래스.EX6;

import java.util.Scanner;

public class EX6실행 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		member[]memberobject = new member[100];
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("아이디 :"); String id = scanner.next();
				System.out.println("비밀번호 :"); String password = scanner.next();
				System.out.println("이름 :"); String name = scanner.next();
				//객체 선언
				member signupinfo = new member(id,password,name,1000);
				int index = 0;
				for(member temp : memberobject) {
					index++;
					if(temp == null) {
						//temp = signupinfo;
						memberobject[index] =signupinfo; //원본에 수정
						//해당 인덱스의 새로운 객체 대입 [객체의 주소값 대입]
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("아이디 :"); String id = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				
				//객체 선언
				member logininfo = new member(id,password);
			
				for(member temp : memberobject) {
					if(temp != null&&temp.id.equals(logininfo.id)&&temp.password.equals(logininfo.password)) {
						System.out.println("로그인성공");
						break;
					}
				}
			}
			
		}
	}
}
