package java1.ch4배열;

import java.util.Scanner;

public class Ex5_학생점수관리 {
	public static void main(String[] args) {
		
			boolean run = true; //무한루프제어 변수
			int studentNum = 0; //학생 수 저장 할 변수
			int[] scores = null; //여러개 점수를 저장할 배열[ 메모리 할당 전]
			
			Scanner scanner = new Scanner(System.in);
			
			while(run) { //종료조건 : 5입력
				System.out.println("------------------");
				System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료 6.재시작");
				System.out.print("선택 : "); int selectno = scanner.nextInt();
			
				if (selectno== 1) 
				{ 	System.out.println("학생수 :");
					studentNum =scanner.nextInt();scores = new int [studentNum]; //입력 받은 학생수 만큼 배열에 메모리 (길이) 할당
					System.out.println("배열에 " + studentNum+ "명의 점수 입력가능");
				} // 1입력했을때
				else if(selectno== 2) //2입력했을때 (학생수)
				{
					for(int i = 0; i<scores.length; i++) { //i는 0부터 배열의 길이까지 1씩 증가 반복
						System.out.print("score["+i+"] : "); 
						scores[i] = scanner.nextInt(); //i번쨰 인덱스의 입력값을 대입 
					}
				}	
				else if(selectno== 3) //3 "
				{
					
					for(int i = 0; i<scores.length; i++) {
						//System.out.println("scores["+i+"]>"+scores[i]);
						System.out.printf("scores[%d]> %d \n" , i, scores[i]);
					}
				}	
				else if(selectno== 4) //4 "
				{	
					int max = 0;	// 최고점수
					int sum = 0;	//평균 구하기 전에 합계
					for(int value : scores) {
						if(value > max) {max = value;}
						sum += value; //해당 값을 sum변수에 누적 더하기
					}System.out.println("최고점수:"+max);
					System.out.println("평균점수 :" + (sum/scores.length));
					
					// 내림 차순 // 값이 큰 사람을 맨앞으로  이동
					
					for(int i= 0; i<scores.length; i++) {
						for(int j = i+1; j<scores.length; j++ ) {
							if(scores[i]>scores[j]) {
								int rank = scores[i];
								scores[i] = scores[j];
								scores[j] = rank;
								}
						}
						
					 
					} int num = 1;
					for(int value : scores) {
						System.out.println(num+"순위"+value);
						num++;
					}
				}	
				else if(selectno== 5) 
				{run = false;}	//5 :
				else if(selectno == 6) {
					return;
				}
				else{System.out.println("모르는 번호인데용??");}			//그외
			}//w e
			System.out.println("프로그램 종료");
	}// me 
}// ce
