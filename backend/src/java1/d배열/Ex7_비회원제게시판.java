package java1.d배열;

import java.util.Scanner;

public class Ex7_비회원제게시판 {
	public static void main(String[] args) {   // 0은 제목 //1은 내용 //2 글쓴이 //3 비밀번호
		String[][] main = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		int 작동 = 0;
		while (true) {	
			System.out.println("=============비회원제게시판============");
			System.out.print("1.글쓰기\t");
			System.out.print("2.글보기\t");
			System.out.print("선택 : "); int 선택 = scanner.nextInt(); 
										
			
			for(int i = 0; i<main.length; i++) {
				if(main[i][0]!=null){
					System.out.print("순서\t"+ "내용\t"+ " 글쓴이\n");
					System.out.println((i+1) +"\t"+main[i][0]+"\t" + main[i][2]);
					
				
			}if(작동==2) {
				System.out.println("=========================");
				System.out.println("수정이나 삭제를 할려면 비밀번호를 입력하세요"); String 비번 = scanner.next();
				
				if(main[선택][3].equals(비번))
					main[i][0] =null;
					main[i][1] =null;
					main[i][2] =null;
					main[i][3] =null;
				break;
			}
				
				
			
			else if(선택==2&&main[i][0]!=null) {
					System.out.println("보실순서를 선택하세요 선택:"); int 선택1 = scanner.nextInt();
					{
					System.out.println("번호 :"+선택1);
					System.out.println("제목 :"+main[i][0]);
					System.out.println("글쓴이 :" + main[i][2]);
					System.out.println("내용 :" +main[i][1]);
					작동 = 2;
					}
				}if(main[i][0] == null){
					System.out.println("등록된 글이 없습니다.");
					break;
				}
					
			}
			
			//--- 1글쓰기 자리
			
			
			if(선택==1) {
			System.out.println("제목 :"); String 제목 = scanner.next();
			System.out.println("내용 :"); String 내용 = scanner.next();
			System.out.println("글쓴이 :"); String 글쓴이 = scanner.next();
			System.out.println("비밀번호"); String 비번 = scanner.next();
			
			
		
			/*------------------------------------------*/
			
			for(int  i =0; i<main.length; i++) {
			if(main[i][0]==null) {
				main[i][0] = 제목;
				main[i][1] = 내용;
				main[i][2] = 글쓴이;
				main[i][3] = 비번;  
				break;
					}else if(선택==2) {
							System.out.println(main[i][0]);
							System.out.println(main[i][2]);
							System.out.println(main[i][1]);
						
							
						
						}
					}
				}
			
			//for e
			
		}	
	}//m e
}//c e

/*

if(board[btn3][3].equals(pww)) {
						board[btn3][0] = null ; 
						board[btn3][1] = null ; 
						board[btn3][2] = null ; 
						board[btn3][3] = null ;
						for(int j = btn3 ; j<board.length ; j++) {
							board[j][0] =board[j+1][0];
							board[j][1] =board[j+1][1];
							board[j][2] =board[j+1][2];
							board[j][3] =board[j+1][3];
							if(board[j+1][0]==null) {break;}
						}
					}
					else {System.out.println("비밀번호가 틀렸습니다.");}					
				}
				
*/