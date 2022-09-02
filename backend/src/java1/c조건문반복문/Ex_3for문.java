package java1.c조건문반복문;

public class Ex_3for문 {
		
	public static void main(String[] args) {
		
		//p154 1~10까지 출력
		
		for( int i= 1; i<=10; i++) { //초기값 ; //조건문 ;//증감식;
			System.out.println(i);	
		}
	
		int i= 1;				//1.초기값
		while(i<=10) {			//2.조건문
			System.out.println(i);//3.실행문
			i++;	//4.증감식
		}
		//-=-----------------------------------//
		//p151 1~100까지
			int 값1= 0;
			for(int j = 1; j<=10; j++) {
				값1 +=j;
			}
			//while
			int 합계 = 0;
			int h =1;
			while(h<=10) {
					합계 += h;
				h++;
			}
			System.out.println(값1);
			System.out.println(합계);
		//-----------------예3 1부터 100까지의 7의 배수 누적합계
			int 예3 = 0;
			for(int x=0; x<=100; x++) {
				if(x % 7 == 0 )
					예3 += x;
			}System.out.println(예3);
		//방법 2
				int 예제3_2 =0;
				for(int x =0; x<=100; x+=7) {
					예제3_2 +=x;
				}System.out.println(예제3_2);
			
			 //------------구구단
				//예4 2단 출력
				for(int 곱 = 1; 곱<=9; 곱++) {
					System.out.println("2x" +곱+"="+(2*곱));
				}
				//while 문 버전
				int 곱2 = 1;
				while(곱2 <=9) {
					int 연산결과 = 2*곱2;
					System.out.println("2x" +곱2+"="+연산결과);
					곱2++;
				}
			//-------------------------
		
			//1.구구단
				/*
				 * 	단: 2부터 9까지 
				 * 	곱: 1부터 9까지
				 * --단 1번당 곱은 모두(9번)실행--단 마다 곱은 9개 존재 --단이 곱을 포함하고 있다.
				 * 
				 */
				int 실행횟수 = 0;
				for(int 단 = 2; 단<=9; 단++) {
					//단 2부터 9까지 1씩증가
					for(int 곱 = 1; 곱<=9 ; 곱++) {
						System.out.printf("%2d x%2d = %2d \n" ,단,곱,(단*곱));
						실행횟수 ++;
					}
				}System.out.println("총 반복횟수 :" +실행횟수);
			//2 무한루프= 무한루프
			/*
			 * for(int y= 0; true; y++){ System.out.println("실행"); if(y % 2== ) {
			 * System.out.println("바보"); } }
			 */
				///3. 
					//1. break : 반복문 종료 키워드 [가장 가까운 반복문 탈출]
					//2. contiune : 반복문으로 이동 키워드 [증감식이동]
				
	}
}
/*
	반복문: 조건이 true이면 반복 아니면 x 
		//조건반복 = for 사용 //무한반복 = while사용
		
		1.for (1.초기값 ; 2.조건문 ;3.증감식){실행문}
		2.
		
		초기값
		while(조건문){
			실행문
			증감식
		}	
		
	

*/