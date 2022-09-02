package java1.b연산자;

import java.util.Scanner;
import java.util.function.Function;

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
		
		/*
		 * System.out.print("배수입력:"); int 배수= 급여.nextInt(); //입력된 데이터를 인트로 가져옴 String
		 * 결과3 = 배수 % 7==0 ?"7배수 맞습니다" :"아닙니다"; // 삼항연산자 조건 ? 참 : 거짓
		 * System.out.println("정수입력:" + 결과3);
		 * 
		 * //문제 4
		 * 
		 * System.out.println("문제4 ) 정수입력 :"); int 문제4 = 급여.nextInt(); String 결과4 = 문제4
		 * %2 == 1 ?"홀수" : "짝수"; System.out.println("결과4)" +결과4);
		 * 
		 * //문제5 System.out.print("문제5) 정수입력:"); int 문제5 = 급여.nextInt(); String 결과5 =
		 * (문제5 %7 == 0 && 문제5%2 ==0) ?"참" :"거짓"; System.out.println("결과5)"+결과5); //문제6
		 * System.out.println("문제6_1) 정수입력 :" ); int 문제6_1 =급여.nextInt();
		 * System.out.println("문제6_2) 정수입력 : "); int 문제6_2 =급여.nextInt();
		 * System.out.println("결과6: "+(문제6_1 >문제6_2 ? 문제6_1 :문제6_2));
		 * 
		 * 
		 */
		/*
		 * //문제7 System.out.println("문제7) 정수입력 :"); Double 반지름 =급여.nextDouble();
		 * System.out.println("문제7)" + ((반지름*반지름*3.14)));
		 */
		 //문제 8
			/*
			 * System.out.println("문제8) 실수입력 : "); double 실수1 =급여.nextDouble();
			 * System.out.println("문제8_2) 실수입력2: "); double 실수2 = 급여.nextDouble();
			 * System.out.printf("결과 : %.2f%%" ,(실수1 / 실수2)*100); //문제9
			 * System.out.println("문제9)윗변 :"); double 윗변 = 급여.nextDouble();
			 * System.out.println("문제9)밑변 :"); double 밑변 =급여.nextDouble();
			 * System.out.println("문제9)높이 :"); double 높이 =급여.nextDouble();
			 * System.out.println("결과 :"+((윗변*밑변)*높이/2));
			 * 
			 * //문제10 System.out.println("문제10) 키:"); double 키 = 급여.nextDouble();
			 * System.out.println("결과:" + ((키-100)*0.9));
			 */
		 //문제11
			/*
			 * System.out.print("문제11) 키:"); double 키2 =급여.nextDouble();
			 * System.out.print("문제11) 몸무게:"); double 몸무게 = 급여.nextDouble();
			 * System.out.printf("BMI :%10.0f" , (몸무게/((키2/100)*(키2/100)))); //문제 12
			 */		 
		//문제12
		System.out.println("문제12) :"); double inch = 급여.nextDouble();
		System.out.println("결과 : cm : " + (inch*2.54));
		 
		//문제13
		System.out.println("문제13) :"); double 중간고사 = 급여.nextDouble() *0.3;
		System.out.println("문제13) :"); double 기말고사 = 급여.nextDouble() *0.3;
		System.out.println("문제13) :"); double 수행평가 = 급여.nextDouble() *0.3;
		System.out.printf("결과 : %.2f" ,(중간고사+기말고사+수행평가));
		
		//문wp14
		/*
		1.x 변수에 10 대입한다. x=10
		2.y 변수에 대입 
			1. x-- :10 [후위감소 = 가장 나중에 할 예정]
			2. --x :9 [먼저갑소]
			3. 10 + 5+ 9 :24
			4. = [대입 = 이 마지막]
		    5. x-- : 후위감소이기 때문에 값을 가지고 감소 
					3. 출력
			x= 8
			y= 23
		
		*/
		
	}//m e
}//c e