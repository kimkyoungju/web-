package java1.d배열;

import java.util.Scanner;

public class Ex781_비회원 {
	public static void main(String[] args) {
		String[][] 배열 = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("=====게시판=====");
		System.out.print("1.글쓰기\t");
		System.out.print("2.글보기\t");
		System.out.print("선택 : "); int 선택 = scanner.nextInt(); 
		
		for(int i = 0 ; i<배열.length; i++) {
		if(배열[i][0]!=null) {
		System.out.println("=========커뮤니티========");
		System.out.println(배열[i][0]);
			}
		}
		for(int  i = 0; i<배열.length; i++ ) {
			if(선택==1) {
				System.out.println("제목"); String 제목 = scanner.next();
				System.out.println("내용"); String 내용 = scanner.next();
				System.out.println("글쓴이"); String 글쓴이 = scanner.next();
				System.out.println("비밀번호"); String 비밀번호 = scanner.next();
					if(배열[i][0]!=null)
					배열[i][0] = 제목; 
					배열[i][1] = 내용;
					배열[i][2] = 글쓴이;
					배열[i][3] = 비밀번호;
					break;
				}else if(선택==2) {
					
				}
			}
		
		}
	}//me
}// ce
