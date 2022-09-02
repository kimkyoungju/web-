package java1.c조건문반복문;

import java.util.Scanner;

public class Ex_4자판기 {
	public static void main(String[] args) {
		//0.입력객체
		Scanner scan = new Scanner(System.in);
		
	//1. 공통 변수 ( 제품3개 ->3개 ,장바구니 제춤 3개 ->3개)
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;//각변수 10대입[재고]
		int 콜라구매수 = 0; int 환타구매수 =0; int 사이다구매수 = 0; //2. 각 변수에 0을 대입해서
		while(true) {//2. 무한루프 [무한반복]
			System.out.println("----[안태서빙무한자판기]----");
			System.out.println("메뉴 : 1. 콜라(300원) 2.환타(400억) 3.사이다는(500원) 4.장마구니");
			System.out.println("선택 : "); int 메뉴선택 = scan.nextInt();
			if(메뉴선택 == 1) {
				if(콜라재고>0) {
					콜라재고--; 콜라구매수++;
					System.err.println("콜라드릴게용(장마구니로)");
					}else {
				System.err.println("재고없음[알아서 사먹어]");
				}
			}//1을 입력 했을때
			else if(메뉴선택 == 2) {if(환타재고>0) {
				환타재고--; 환타구매수++;
				System.err.println("환타드릴게용(장마구니로)");
				}else {
			System.err.println("재고없음[알아서 사먹어]");
				}
			}//2를
			else if(메뉴선택 ==3) {if(사이다재고>0) {
				사이다재고--; 사이다구매수++;
				System.err.println("사이다드릴게용(장마구니로)");
				}else {
			System.err.println("재고없음[알아서 사먹어]");
			}}//3을
			else if(메뉴선택 ==4) {
				System.out.println("=========장마구닝=======");
			    System.out.println("제품명\t구매수\t가격");
			    if(콜라구매수>0) {System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300)+"원");}
			    if(환타구매수>0) {System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*400)+"원");}
			    if(사이다구매수>0) {System.out.println("사이다\t"+사이다구매수+"\t"+(사이다구매수*500)+"원");}
			    int 총결제금액 = (콜라구매수*300)+(환타구매수*400)+(사이다구매수*500);
			    System.out.println("안내 ) 너는 이만큼 내야해 :"+(총결제금액)+"원");
			   
			    
			    
			    System.out.println("결제할래? [y] [n]"); String 결제여부 =scan.next();
			    Boolean 결제성공 = false;
			    if(결제여부.equals("y") || 결제여부.equals("Y")) {
			    	System.out.println("안내) 돈 넣어"); int 투입금액 = scan.nextInt();
			    	if(총결제금액>투입금액) {System.out.println("안내) 돈 부족해[너뭐해]?");}
			    	else {결제성공 = true;
			    		System.out.println("안내) 구매완료 또와 ㅎ [잔돈 :"+(투입금액-총결제금액)+"원]");
			    	}if(결제성공) {//결제 성공:장바구니 0으로 초기화
			    		콜라구매수 = 0 ; 환타구매수=0; 사이다구매수 =0;
			    	}else {//결제취소 : 금액이 부족하거나 ,결제 여부가 n이면 => 재고를 구매수만큼 다시 채우기
			    		콜라재고+=콜라구매수; 환타재고+=환타구매수; 사이다재고+=사이다구매수;
			    	}
			   	
			    }
			    
			}
			    //4를
			else {System.err.println("안내) 선택할수 없는 번호야[다시선택-_-죽는다]");}
		}
		
		
	}//main e
}//class e

/*
 * 자판기 프로그램
 * [조건]
 * 	1. 제품 : 콜라 , 환타,사이다
 * 	2. 초기재고 : 각 10개
 * 	3. 메뉴판에서 선택한 제품을 장바구니 담기
 * 	4. 결제를 선택했을때 장바구니 현황 표시 결제[돈입력 ]
 * 	5. 결제예정인 금액보다 투입금액이 부족하면 결제 취소 금액이 초과
 * [화면구현]
 *  1.메뉴판 : 1번 콜라 2번 환타 3번 사이다 4 결제
 *  [추가기능
 *  1. 제품 구매 수량 차감 메뉴
 *  2. 관리자 메뉴 ( 비밀번호 : 1234)
 *   	재고추가		// 5번 int로 5추가후 재고현황 볼수 있게 남은 수 띄우기  
 *   	매출현황 		// 전체구매수+ 
 	
 *
 *
 */


