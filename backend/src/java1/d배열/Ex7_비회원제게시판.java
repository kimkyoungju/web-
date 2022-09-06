package java1.d배열;

import java.util.Scanner;

public class Ex7_비회원제게시판 {
	public static void main(String[] args) {
		String[][] main = new String[100][2];
		Scanner scanner = new Scanner(System.in);
		int 작성 = 0;
		while(true) {
			System.out.println("===========비회원제게시판==========");
			System.out.print("1.글쓰기           2.글보기");
			System.out.println("선택 : "); int choice = scanner.nextInt();
			System.out.println("===============================");
			
			if(choice == 1) {
				System.out.println("==========글쓰기페이지=========");
				System.out.println("제목 :"); String 제목 = scanner.next();
				System.out.println("내용 :"); String 내용 = scanner.next();
				System.out.println("글쓴이 :"); String 글쓴이 = scanner.next();
				System.out.println("비밀번호 :"); String 비밀번호 = scanner.next();
				작성 = 1;
				}if(작성==1){
					
					for(int i = 0; i<main.length; i++) {
					System.out.println("=========커뮤니티========"); 
						System.out.print("번호"+i);			 
						System.out.print("\t작성자");
						System.out.println("\t제목");
						System.out.println("=====================");
						i++;
						break;
					}
				}
						else if(choice ==2) {
				System.out.println("==========글보기=========");
				System.out.println("작성자 :" );
				System.out.println("제목 : ");
			}//else if e
		
			else {System.out.println("안내) 선택할 수 없는 숫자입니다.");
					
			}//else e
		}//w e
	}//m e
}//c e
