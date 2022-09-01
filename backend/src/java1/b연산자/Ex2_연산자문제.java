package java1.b연산자;

import java.util.Scanner;

public class Ex2_연산자문제 { //c s
	public static void main(String[] args) { //m s
		
		//문제1 : 급여 명세서 
		/*
		 * 문제1 :급여계산
		 * 	[조건] 입력받기 :기본급 , 수당
		 * 	[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
		 * 
		 * 문제2 : 지페 개수세기
		 * 	[조건] 십만원 단위의 금액을 입력받기
		 * 	[출력] 입력받은 금액의 지폐수 출력
		 * 	[예시] 356789
		 * 		십 : 3장
		 * 		만원 : 5장
		 * 		천원 : 6장
		 * 
		 * 문제3 : 하나의 정수를 입력받아 7의 배수면 맞다 아니면 아니다 출력[if x]
		 * 문제4 : 하나의 정수를 입력받아 홀수이면 홀수 아니면 짝수[if x]
		  
		 */
		
		Scanner 급여 = new Scanner(System.in);
		/*
		 * System.out.println("기본급을 입력해주세요:");int 기본급 = 급여.nextInt();
		 * System.out.println("수당을입력해주세요:"); int 수당 = 급여.nextInt(); int 세금 =
		 * 기본급+수당-(int)(기본급*0.1); System.out.println("실수령액:"+세금);
		 */
		
		//문제2
		
		/*
		 * System.out.println("금액을 입력해주세요\n"); int 금액= 급여.nextInt();
		 * System.out.println("십만원:"+ (금액/100000)+"장"); 금액-=(금액/100000)*100000;
		 * System.out.println("만원"+(금액/10000)+"장"); 금액-=(금액/10000)*10000;
		 * System.out.println("천원"+(금액/1000)+"장");
		 */
		//문제 3
		
		System.out.println("정수입력:");
		int 배수= 급여.nextInt();
			배수 =7 % 2;
		
		
	}//m e
}//c e