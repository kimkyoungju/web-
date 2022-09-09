package java1.d배열;

import java.util.Scanner;

public class Ex781_비회원 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String list[][]= new String [100][4];
		while (true) {
			
			System.out.println("==============게시판================");
			System.out.println("순서\t 제목\t 글쓴이");
			for(int i = 0; i<list.length-1; i++) {
				if(list[i][0]!=null) {
					System.out.println(i+"\t"+ list[i][0]+"\t"+ list[i][1]);
					
				}
			}
			System.out.println("===============메뉴===============");
			System.out.println("1.글쓰기\t\t\t2.글보기 선택:");
			int 선택 = scanner.nextInt();
			
			if(선택==1) {
				System.out.println("제목 :"); String 제목 = scanner.next();
				System.out.println("글쓴이 :"); String 글쓴이 = scanner.next();
				System.out.println("내용 :"); String 내용 = scanner.next();
				System.out.println("비밀번호 :"); String 비밀번호 = scanner.next();
				for(int i = 0; i<list.length; i++) {
					if(list[i][0]==null) {
						list[i][0] = 제목;
						list[i][1] = 글쓴이;
						list[i][2] = 내용;
						list[i][3] = 비밀번호;
						break;
					}
				}
				
			}//if e
			else if (선택==2) {
				if(list[0][0]!=null) {
				System.out.println("몇번째의 글을 보시겠습니까?");int choci =scanner.nextInt();
				System.out.println("제목 : "+list[choci][0]+"\t\t"+"글쓴이 :"+list[choci][1]+"\n내용:"+list[choci][2]);
				System.out.println("1. 뒤로가기 2. 수정하기 3.삭제하기");
				int 선택2 = scanner.nextInt();
							if(선택2== 1) {}
							else if(선택2==2) {
								System.out.println("비밀번호를 입력해주세요"); String scan = scanner.next();
								if(list[choci][3].equals(scan)) {
									System.out.println("내용을 수정해주세요");String 입력2 = scanner.next();
									list[choci][2] = 입력2;
									System.out.println("수정이 완료되었습니다");
									break;
								}else {
									System.out.println("비밀번호가 다릅니다");
								}
									
							}
							else if(선택2==3){
									System.out.println("비밀번호를 입력해주세요"); String scan = scanner.next();
								if(list[choci][3].equals(scan)) {
									System.out.println("삭제할까요? \ty\\s");String 입력3 = scanner.next();
									if(입력3.equals("y")||입력3.equals("Y")) {
										System.out.println("삭제하겠습니다.");
										list[choci][0] =null;
										list[choci][1] =null;
										list[choci][2] =null;
										list[choci][3] =null;
											for(int x = choci; x<list.length; x++) {
												list[x][0] = list[x+1][0];
												list[x][1] = list[x+1][1];
												list[x][2] = list[x+1][2];
												list[x][3] = list[x+1][3];
												if(list[x+1][0]==null)
												break;
											}
									}else if(list[choci][3]!=(scan)){System.out.println("비밀번호가다릅니다");}
									else{System.out.println("취소하겠습니다 돌아갑니다");}
								}
							}
					}else if(list[0][0]==null) {
						System.out.println("등록된 글이 없습니다 ");
						break;
					}
				}
			
			else {System.out.println("선택불가능한 숫자입니다.");}
		}
		
	}//me
}// ce
