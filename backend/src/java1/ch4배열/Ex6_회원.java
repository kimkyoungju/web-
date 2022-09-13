package java1.ch4배열;

import java.util.Scanner;

public class Ex6_회원 {
	
		public static void main(String[] args) {
				//0 메모리
			String[][] memberlist = new String[100][4];//문자열 400개
			Scanner scanner = new Scanner(System.in); //입력객체
			
				//1. 무한루프 [프로그램 실행]
			while(true) {//종료조건 x
				System.out.println("==========회원제 페이지==========");
				System.out.println("메뉴 : 1. 로그인  2.회원가입  3.아이디찾기  4.비밀번호 찾기");
				System.out.println("==============================");
				System.out.println("선택 :"); int btn = scanner.nextInt();
				
				if(btn==1) {System.out.println("================로그인==============");
							System.out.println("아이디 "); String id = scanner.next();
							System.out.println("비밀번호 "); String pass = scanner.next();
							
							int login = 0; //로그인 처리에 대한 상태를 저장하는 변수
							for(int  i = 0; i<memberlist.length ; i++) {
								if(memberlist[i][0] !=null){
									if(memberlist[i][0].equals(id))
										login = 2;
										if(memberlist[i][1].equals(pass))
									System.out.println("로그인성공");
									login = 1;  //로그인 성공 [ 아이디외 비번은 모두 맞았을때
									while(true) {
									System.out.println("회원메뉴 : 1.회원탈퇴 2.로그아웃" );
										int btn2 = scanner.nextInt();
										if(btn2 == 1) {
											//=------------------------------
												//i =로그인 성공한 인덱스 = 로그인한 외원의 인덱스
												memberlist[i][0] = null;memberlist[i][1] = null;
												memberlist[i][2] = null;memberlist[i][3] = null;
												//삭제한 회원뒤로null 당기기
												for(int j = i; j<memberlist.length; j++) {
													memberlist[i][0] =memberlist[i+1][0];
													memberlist[i][1] =memberlist[i+1][1];
													memberlist[i][2] =memberlist[i+1][2];
													memberlist[i][3] =memberlist[i+1][3];
													if(memberlist[i+1][0] ==null) break;
												}
											//=-----------------------------
											System.out.println("안내) 회원탈퇴완료");
											break;
										}
										else if (btn2== 2) {break;}
										}
									break;
									}
								}
								
							
							if(login==0) {System.out.println("로그인실패 아아디 없다");}
							else if(login ==2) {System.out.println("안내) 비밀번호가 일치하지 않다");}
							else if(login ==1) {System.out.println("로그아웃되었습니다.");}
			}//1 
						else if(btn==2) {
					
					System.out.println("================회원가입==============");
					System.out.println("아이디:"); String id = scanner.next();
					
					//중복체크
					boolean idchack = true; //아이디ㅣ 중복여부
					for(int i = 0; i<memberlist.length; i++) {
						if(memberlist[i][0] !=null && memberlist[i][0].equals(id)) {
							//입력받은id와 배열내 id 같다 . [중복찾음]
							System.out.println("안내)사용중인 아이디");
							idchack = false; break;
						}
					}
					// 아이디 중복 흐름제어
					if(idchack) { //중복이 없으면 실행 
						
						System.out.println("비번:"); String pass = scanner.next();
						System.out.println("이름:"); String name = scanner.next();
						System.out.println("전화번호:"); String phone = scanner.next();
						
						//1. 배열내 빈 행 찾는다.
						for(int i = 0; i<memberlist.length; i++) {
						if(memberlist[i][0] == null) {
										// 아이디가 null d이면 회원이 없다 !!
						memberlist[i][0] =id; memberlist [i][1] =pass;
						memberlist [i][2] =name; memberlist [i][3] = phone;
						System.out.println("안내) 회원가입 성공");	
						//2.3 저장했으면 반복문 종료 
								break;
							}
							if(i == 99) {System.out.println("안내) 인원이 최대입니다. 가입 불가능");}
						}
					}
				}//2
				else if(btn==3) {
					System.out.println("================아이디찾기==============");
					System.out.println("이름"); String name = scanner.next();
					System.out.println("전화번호"); int phone = scanner.nextInt();
					int log= 0;
					for(int i =0 ; i<memberlist.length; i++) {
							if(memberlist[i][0] !=null&&
								memberlist[i][2].equals(name)&&
								memberlist[i][3].equals(phone)){
								System.out.println(memberlist[i][0]);
								log = 1;
								break;
							}if(i==memberlist.length-1) {
								System.out.println("안내) 동일한 정보가 없다");
							}
					}
				}	//3
				else if(btn==4) {
					System.out.println("아이디 :"); String id = scanner.next();
					System.out.println("이름 :"); String name = scanner.next();
					int log = 0;
					for(int i = 0; i<memberlist.length; i++ ) {
						if(memberlist[i][0] !=null &&
							memberlist[i][0].equals(id)&&
							memberlist[i][3].equals(name)) {
							System.out.println("비밀번호 : "+ memberlist[i][0]);
							log = 1;
							break;
						}
					}if(log==0) {
						System.out.println("없는 아이디입니다");
					}
				}	//4
				else {System.out.println("알수 없는 번호인데용");}//그외
				}//w e
			
		}//me
}//ce
/*
 * 
 * 회원제 프로그램 구현
 * 	[조건]
 * 		1.2차원 배열
 * 	[기능]
 * 		1.회원가입
 * 			1.아이디 비밀번호 이름 전화번호 입력받아 등록
			2.아이디 중복체크
			3.최대 회원 100명
					1명 4개 아이디 400개
					행 당 1명
					0열 : 아이디, 1열 : 비밀번호 ,2열: 이름 , 3열 : 전화번호
 * 		2.로그인기능
 * 			아이디 비밀번호가 동일하면 로그인 성공
 * 		3.아이디찾기
 * 			이름 전화번호가 동일하면 아이디 알려주기
 * 		4.비밀번호찾기 기능	
 * 			아이디 전화번호가 동일하면 비밀번호 알려주기
 * 	[출력]
 * 		1.메뉴 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
 * 
 * System.out.println("================비번찾기==============");
					System.out.println("이름"); String name = scanner.next();
					System.out.println("아이디"); String id = scanner.next();
					int log= 0;
					for(int i =0 ; i<memberlist.length; i++) {
							if(memberlist[i][0] !=null&&
								memberlist[i][2].equals(name)&&
								memberlist[i][1].equals(id)){
								System.out.println("비밀번호 : "+memberlist[i][0]);
								log = 1;
								break;
							}
						}if(log==0) {
						System.out.println("안내) 없는비밀번호입니다");
					}
 * 	
 */