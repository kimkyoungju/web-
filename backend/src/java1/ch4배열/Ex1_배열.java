package java1.ch4배열;

import java.lang.reflect.Array;

public class Ex1_배열 {
	public static void main(String[] args) {
		//180
		//배열선언
		int[] scores = {83,90,87}; // int 배열선언, 3개 값 초기화, 인덱스 0~2
		//2. 배열 호출
		System.out.println("배열0 :"+scores[0]);
		System.out.println("배열1 :"+scores[1]);
		System.out.println("배열2 :"+scores[2]);
		System.out.println("배열 :"+ scores); //배열명 주소[번지] 호출
		//3. 배열 반복문 활용
		int sum = 0;
		for(int i =0; i<scores.length; i++) { //길이는 1 인덱스는 0
			sum += scores[i];
			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + (sum/3));
		}
	
		//예2
		//1.new 연산자를 이용한 선언 
		int[] 배열 = new int[3]; //int 형 3개를 저장할수 있는 배열[고정길이]
		//2.for배열내 모든 인덱스 호출
		for(int i=0; i<배열.length; i++) {
			System.out.println(배열[i]);
		}
		//3. 배열에 각 인덱스에 데이터 넣기
		배열[0]= 100; 배열[1]= 93; 배열[2]=20;
		//4
		for(int i = 0; i<배열.length; i++) {
			System.out.println(배열[i]);
		}
		//5 향상된 for문
		for(int temp : 배열) {
			//for (반복변수 : 배열명) : 배열내 첫번째인덱스부터 마지막인덱스까지 반복변수
			System.out.println(temp);
		}

	}
}
/*
	변수 : 데이터 1개 저장
	배열 : 
		1. 같은 타입[자료형/클래스]의 데이터를 연속된 공간에 나열 
		2. 인덱스 : 저장되는 순서번호
		3.[]
		4. 제공받는 메소드 x --> array 클래스 
			push splice	
			배열선언
				1. 타입[] 배열명;
				2. 타입 배열명[];
			배열 생성
				1. 타입[] 배열명 = {값0, 값1, 값2,값3~~~} : 배열선언과 동시에 값 대입
					//배열에 미리 값을 넣을때
				2. 타입[] 배열명 = new 타입[길이]		 : 배열의 길이만큼 선업[초기값]
					// 배열의 길이를 미리 설정할떄				정수 : 0 실수 :0.0 클랙스:null
			배열 호출
				배열명 : 배열의 메모리 주소(번지)
				 1. 배열명[인덱스번호]
				 
*/