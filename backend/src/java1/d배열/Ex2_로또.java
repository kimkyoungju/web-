package java1.d배열;

import java.util.Random;
import java.util.Scanner;

/*
 *   로또 판별기
 *   1. 구매번호  : 사용자에게 6개 수 입력 -> 배열 저장
 * 	 	1. 1~45 사이만 입력받기 아니면 재입력 2. 중복 x
 *   2. 추첨번호  : 컴퓨터 난수 6개 생성 -> 배열저장
 * 		1. 1~45 사이 난수	 
 * 3. 구매번호와 추첨번호와 도일한 수의 개수
 */
public class Ex2_로또 {
	
	public static void main(String[] args) {
		//0. 메모리[변수/배열] 선언
		Scanner scan = new Scanner(System.in);
		int[] 구매번호 = new int[6]; //int 형 변수 6개를 저장할수 있는 공간
		int[] 추첨번호 = new int[6]; //int 형 변수 6개를 저장할수 있는 공간
		
		//1. 사용자에게 입력받는다 [6번]
		for(int i = 0; i<6 ; i++) { //i = 인덱스로 맞출려면 0부터 //i는 0부터 5까지 1씩증가 
			System.out.println("안내) 번호 뭐 고를래:" + (i+1)+"번째 번호선택 :");
			구매번호[i] = scan.nextInt();//입력받은 값을 i번쨰 인덱스에 저장한다.
			if(구매번호[i] <=0 || 구매번호[i]>46) { //만약에 입력값이 1보다 작거나 45보다 크면
				System.err.println("선택할수 없는 번호인데용");
				i--; continue; //continue 는 올리기 // i--는 i값을 무효화 시킨것
			}//if e
			//[조건2] //중복확인
			
			boolean 중복체크 = false;
			for(int j = 0;  j<i ; j++) {
				if(구매번호[j]== 구매번호[i]) {
					System.out.println("안내) 중복인데용");
					중복체크 = true; // 중복 찾음 
				
				}
			}//for e
				
				if(중복체크==true) {//중복체크 변수가 true 재입력
					i--; continue;}//[조건1 / 조건 2] 모두 통과 후 종료
				System.out.println(구매번호[i] +"숫자아아!!아!!아!.");
								
		}
		
		/*
		 * /-----------------------------------------/
		 */
		
		for(int i = 0; i<6; i++) {
			Random 난수 = new Random();
			추첨번호[i] = 난수.nextInt(45)+1;
				for(int j = 0; j<i ; j++) {
					if(추첨번호[j] == 추첨번호[i]) {i--; continue;}
			}	
		}//for e
		for(int tmep : 구매번호) {
			System.out.printf("%2d\t ",tmep);
		}
		System.out.println("추첨번호");
		for(int tmep : 추첨번호) {
			System.out.printf("%2d\t",tmep);
		}
		System.out.println();
		
		
		int 당첨갯수 = 0;
		for(int i=0; i<구매번호.length; i++) {
			for(int j = 0; j<추첨번호.length; j++) {
				if(구매번호[i]==추첨번호[j] ) {당첨갯수++;}
			
			}
		}System.out.println("당첨수"+당첨갯수);
		
	}// m e
}//c e 
