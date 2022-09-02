package java1.c조건문반복문;

import java.util.Scanner;

public class Ex_1if {

	public static void main(String[] args) {
		
		//예 1 : 참 실행문이 1개일때는 중괄호 생략가능
		if(3>1) System.out.println("예3 ) 3이 1보다 크다");
		//예2
		if(3>5) System.out.println("예2 ) 3이 5보다 크다");
		//조건이 false 이기 때문에 실행 안됌
		
	
		//예3 )136		[예상: 점수가 93점 이기 때문에 첫번째 if만 실행]
		int score= 93;	//점수 변수
		if(score >=90) {
			System.out.println("점수가 90보다큽니다");
			System.out.println("등급은 a입니다");
		}if(score<90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은b입니다");
		}
	
		//예4 )137
		int 점수 = 85;
			//변수 선언시 : 중복이름 불가능
		if(점수>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 a 입니다");
		}else { //위 조건이 false이면 실행
			System.out.println("점수가 90보다 작습니다");
			System.out.println("b등급입니다");
		}
	
		//예제5 )138
		Scanner scanner	=new Scanner(System.in);
		int 점수1 = scanner.nextInt();
		if(점수1>=90) {System.out.println("점수가 100~90이상입니다");System.out.println("등급은 a입니다");}
		else if(점수1>=80) {System.out.println("점수가 80~89입니다"); System.out.println("등급은 b입니다");}
		else if(점수1>=70) {System.out.println("점수가 70~79입니다"); System.out.println("등급은 c입니다");}
		else {System.out.println("점수가 70미만입니다"); System.out.println("등급은 d입니다");}
		
		//예제6
		int score2 = 95;
		char 성별 = 'm' ;
		if(score2 == 100) {
			if(성별=='m') {
				System.out.println("100점 이면서 남자이다");
			}else{
				System.out.println("100점이면서 여자이다");
			}
		}else {
			if(성별== 'f' ) {
				System.out.println("100점 아니면서 여자이다");
			}else {
				System.out.println("100점이 아니면서 남자이다");
			}
		}
	
	}
}
/*
IF 문 : 조건식의 결과에 따라 블록 실행 여부 결정
	If(조건식)
		{조건이 true}
		-조건식 : true /false //비교연산자 ,논리 연산자 ,변수,함수 가능
		
	if 형태
		1. 
			if(조건) 참 		: 참 [true] 위치에 실행문[;] 이 1개이면{}생략가능 
		2. 
			if(조건){참}		: 참[true] 위치에 실행문[;] 이 2개이상일때
		3.
			if(조건){참}
			else{거짓}
		4. 
			if(조건){참}
			else if(조건2) {참}
			else if(조건3) {참}
			else{거짓}
		5.
			if(조건) {
				if(조건){
					참
				}else{
					거짓 
				}
			}
*/