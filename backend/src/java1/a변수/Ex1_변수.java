package java1.a변수;	//패키지명
//1. 클래스 선언 [모든 코드 클래스 에서 
public class Ex1_변수 {	// c s

		 //main 함수 :코드를 읽어주는 역활 
		public static void main(String[] args) {
			//48
			//변수  : 변하는 수 [데이터 1개 저장가능한 메모리]
			//52
			int value; //변수 선언 [자료형 변수명] 
			//오류발생 변수에 값이 (초기값) 없기때문
			//System.out.println(value); //console
			//syso + 자동완성 	
			value = 10; //변수에 값 대입
			System.out.println(value);
			
			int result = value + 10;
			System.out.println(result);
			
			//53
			int hour = 3;
			int minute = 5;
			System.out.println(hour+"시간"+minute+"분");
					//js : console `(${변수명})`
						//1. 연결 연산자 " 문자" + 변수
							//3+ java => 3java
						//2. 더하기 연산자 : 변수[숫자] + 변수[숫자]
			int total = (hour*60) + minute;	//+더하기 연산자
			System.out.println("총 :"+total +"분");	//+연결 연산자 
				
				//53
				int x = 3;
				int y = 5;
				System.out.println("x : "+x +" ,y: " +y);
					//동시처리x 
				//임시 보관	[문제 해결 = 임시 변수 생성]
				int temp = x;
				x = y;
				y = temp;
				System.out.println("x : "+x +" ,y: " +y);
				
			/*
			 * Double = value2; value2 = 10+"돼지"; System.out.println(value2);
			 */
			
			  int value2; 
			  value2 = 86;
			  int 안태섭 = value2; 
			  System.out.println("안태섭 :"+안태섭+"kg입니다");
			 
			
			
		}
}// c e
/*밖에서는 실행 x */

/*
	변수 선언
		1. 자료형[변수크기]
		2. 변수명 [   ]=----------> 메모리 주소 찾아가기
		3. 값 [변수에 들어있는 데이터]
		
		int  value  = 10
		1	   2  	  3


*/