package java1.c조건문반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex6_가위바위보 {
	/*
	 * 가위바위보 
	 * 	[조건]
	 * 	1. 플레이어 에게 가위[0] , 바위 [1] , 보[2] 중에 입력
	 * 	2. 컴퓨터 난수 [0~2 ] 생성 (random.nextInt(3)
	 * 		random 클래스
	 * 		random 변수명 = new random()
	 * 			변수명.nextInt(수) : 0~수-1 까지의 난수  발생 
	 *	3. 승리자 판단[경우의 수]
	 *	4.게임종료시 최종 승리자가 출력
	 *
	 */
	public static void main(String[] args) {
		int 플레이어; int 컴퓨터; int 이긴수 = 0; int 게임판수=0;
		 while(true) { 
			 Scanner scan = new Scanner(System.in);
			 System.out.println("선택해주세요) 가위[0] 바위[1] 보[2] 종료 :[3]"); 플레이어 = scan.nextInt();
			 if(플레이어>=0 &&플레이어<=2) {
				
			
			 Random 난수 = new Random(); // 랜덤 객체 생성
		  	컴퓨터 = 난수.nextInt(3); 	// 랜덤 객체를 이용한 int형 난수 생성 : 객체명. nextint
			 
			 if((플레이어==0&& 컴퓨터==2)||(플레이어==1&&컴퓨터==0)||(플레이어==2&&컴퓨터==1)){
				 System.out.println("플레이어승");
				 	이긴수++;
			 }
			 
			 else if((플레이어==2&&컴퓨터==2)||(컴퓨터==1&&플레이어==1)||(컴퓨터==2&&플레이어==2)) {
				 System.out.println("무승부");}
			 
			 else{{System.out.println("컴퓨터승");이긴수--;}}
			 게임판수++;
			 }
			 else if(플레이어==3) {
				 if(이긴수==0) {
					 System.out.println("무승부"+" "+이긴수);
				 }else if(이긴수>=1) {
					 System.out.println("플레이어승리"+" "+이긴수);
				 }else {
					 System.out.println("컴퓨터승리"+" "+이긴수);
				 }
				 break; 
			 }else{
				 System.out.println("0과1의 세계 당신은 그안에 현실이내겐 가상매트릭스 같네요");
			 }
		 } 
	}//m e
}//c e
