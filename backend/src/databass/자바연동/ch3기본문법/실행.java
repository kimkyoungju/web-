package databass.자바연동.ch3기본문법;

import java.util.ArrayList;
import java.util.Scanner;






public class 실행 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		while(true) {
			for(int i = 1; i<=19 ; i++) {
			System.out.println(i+"번 select 예제결과");
				}
			System.out.println("예제 선택 : ");
				int ch = scanner.nextInt();
				// 메소드 호출 방법
					//1. static 선언된 함수 : 클래스명. 함수며ㅑㅇ()
					//2. 일반함수 : 객체명, 함수명()
				
				DAO dao = new DAO();
				//1. 
				if(ch==1) {
				ArrayList<MemberDto>list = dao.예제1결과();
				System.out.println("=========예제 1 결과물=========");
				//1
				for(MemberDto dto : list){
					System.out.print(dto.mem_id);
					System.out.print(dto.mem_name);
					System.out.print(dto.mem_number);
					System.out.print(dto.addr);
					System.out.print(dto.phone1);
					System.out.print(dto.phone2);
					System.out.print(dto.height);
					System.out.println(dto.debut_date);
					}
				}
				if(ch==2) {
					ArrayList<String>list= dao.예제2결과();
					for(String s : list  ) {
						System.out.print(s +"\t");
					}System.out.println();
				}
				if(ch==3) {
					ArrayList<MemberDto>list = dao.예제3결과();
					System.out.println("========예제 3 결과물=====");
					System.out.print(list.get(0).mem_id);
					System.out.print(list.get(0).mem_name);
					System.out.print(list.get(0).mem_number);
					System.out.print(list.get(0).addr);
					System.out.print(list.get(0).phone1);
					System.out.print(list.get(0).phone2);
					System.out.print(list.get(0).height);
					System.out.print(list.get(0).debut_date+"\n");
					
				}if(ch==4) {
					
						ArrayList<MemberDto>list = dao.예제4결과();
						System.out.println("=======예제4 결과물=====");
						for(MemberDto dto : list){
							System.out.print(dto.mem_id);
							System.out.println(dto.mem_name);
						}
					}if(ch==5) {
						ArrayList<MemberDto>list = dao.예제5결과();
						System.out.println("=======예제5 결과물=====");
						for(MemberDto dto : list){
							System.out.print(dto.mem_name+"\t");					
							System.out.print(dto.height+"\t");
							System.out.println(dto.mem_number);
					}
					
				}if(ch==6) {
					ArrayList<MemberDto>list = dao.예제6결과();
					System.out.println("=======예제6 결과물======");
					for(MemberDto dto : list) {
						System.out.print(dto.mem_id+"\t");
						System.out.print(dto.height+"\t");
						System.out.println(dto.mem_number);
					}
				}if(ch==7) {
					ArrayList<MemberDto>list = dao.예제7결과();
					System.out.println("=======예제7=======");
					System.out.print(list.get(0).mem_id);
					System.out.print(list.get(0).mem_name);
					System.out.print(list.get(0).mem_number);
					System.out.print(list.get(0).addr);
					System.out.print(list.get(0).phone1);
					System.out.print(list.get(0).phone2);
					System.out.print(list.get(0).height);
					System.out.print(list.get(0).debut_date+"\n");
					
				}if(ch==8) {
					ArrayList<MemberDto>list = dao.예제8결과();
					System.out.println("=======예제8=======");
					for(MemberDto dto : list) {
						System.out.print(dto.mem_id);
						System.out.print(dto.mem_name);
						System.out.print(dto.mem_number);
						System.out.print(dto.addr);
						System.out.print(dto.phone1);
						System.out.print(dto.phone2);
						System.out.print(dto.height);
						System.out.println(dto.debut_date);			
					}
				}if(ch==9) {
					ArrayList<MemberDto>list = dao.예제9결과();
					System.out.println("======예제9=====");
					for(MemberDto dto :list) {
						System.out.print(dto.mem_id+"\t");
						System.out.print(dto.mem_name+"\t");
						System.out.println(dto.debut_date);
					}
				}if(ch==10) {
					ArrayList<MemberDto>list = dao.예제10결과();
					System.out.println("======예제10======");
					for(MemberDto dto: list) {
						System.out.print(dto.mem_id+"\t");
						System.out.print(dto.mem_name+"\t");
						System.out.print(dto.debut_date+"\t");
						System.out.println(dto.height);
					}
				}if(ch==11) {
					ArrayList<MemberDto>list = dao.예제11결과();
					System.out.println("======예제11======");
					for(MemberDto dto: list) {
						System.out.print(dto.mem_id+"\t");
						System.out.print(dto.mem_name+"\t");
						System.out.print(dto.debut_date+"\t");
						System.out.println(dto.height);
					}
				}if(ch==12) {
					ArrayList<MemberDto>list = dao.예제12결과();
					System.out.println("======예제11======");
					for(MemberDto dto: list) {
						System.out.print(dto.mem_name+"\t");
						System.out.println(dto.height);
					}
				}
				
		}
	}
}
