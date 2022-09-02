package java1.c조건문반복문;

import java.util.Scanner;

public class Ex2_if연습문제 {
	public static void main(String[] args) {
		
		Scanner 입력 = new Scanner(System.in);
		/*
		 * System.out.println("점수를 입력해주세요"); int 점수1 = 입력.nextInt();
		 * System.out.println("점수를 입력해주세요2");int 점수2 = 입력.nextInt(); if(점수1>점수2) {
		 * System.out.println("점수1이 더큽니다"+ 점수1); }else if(점수2>점수1){
		 * System.out.println("점수2가 더큽니다" + 점수2); }else {
		 * System.out.println("두개의 점수는 같습니다"); }
		 */
	
	
		//2
		/*
		 * System.out.println("점수입력 1 :"); int 점수3 = 입력.nextInt();
		 * System.out.println("점수입력 2 :"); int 점수4 = 입력.nextInt();
		 * System.out.println("점수입력 3 :"); int 점수5 = 입력.nextInt(); int 최대값 = 점수3;
		 * if(최대값<점수4) { 최대값 = 점수4; }if(최대값<점수5){ 최대값 = 점수5;
		 * }System.out.println("가장큰수는 :"+점수5);
		 * 
		 * System.out.println("값을 입력해주세요"); int 값1 = 입력.nextInt();
		 * System.out.println("값을 입력해주세요"); int 값2 = 입력.nextInt();
		 * System.out.println("값을 입력해주세요"); int 값3 = 입력.nextInt(); 
		 * if(값1>값2) {int 깡통 =값1; 값1=값2; 값2=깡통;} 
		 * if(값1>값3) {int 깡통 = 값1; 값1=값3; 값3=깡통;} 
		 * if(값2>값3) {int 깡통 =값2; 값2=값3; 값3=깡통;} 
		 * System.out.println(값1+" "+값2+" "+값3);
		 */
	
	
		/*
		 * System.out.println("점수를 입력해주세요"); int 등급= 입력.nextInt(); if(등급>=90)
		 * {System.out.println("합격입니다.");} else {System.out.println("불합입니다");}
		 */
		//문제5
		/*
		 * System.out.println("점수를 입력해주세요"); int 등급2= 입력.nextInt(); if(등급2>=90)
		 * {System.out.println("a");} else if(등급2>=80) {System.out.println("b");} else
		 * if(등급2>=70) {System.out.println("c");} else {System.out.println("재시험");}
		 */
		
		//문제6
		/* 문제6
        [ 입력 ] : 국어,영어,수학 입력받기
        [ 조건 ]
           평균이 90점 이상이면서 
              국어점수 100점 이면 '국어우수' 출력
              영어점수 100점 이면 '영어우수' 출력
              수학점수 100점 이면 '수학우수' 출력
           평균이 80점 이상이면서 
              국어점수 90점이상 이면 '국어장려' 출력
              영어점수 90점이상 이면 '영어정려' 출력
              수학점수 90점이상 이면 '수학장려' 출력
           그외 재시험 */
		
		  System.out.println("국어점수를 입력해주세요"); int 등급= 입력.nextInt();
		  System.out.println("영어점수를 입력해주세요"); int 등급1= 입력.nextInt();
		  System.out.println("수학점수를 입력해주세요"); int 등급2= 입력.nextInt(); double 평균 = (등급1+
		  등급2 +등급)/3; if(평균>=90){ if(등급==100){System.out.println("국짱");}
		  if(등급1==100){System.out.println("영짱");} if(등급2==100)
		  {System.out.println("수짱");} } 
		  else if(평균>=80){
		  if(등급>=90){System.out.println("국장");} if(등급1>=90){System.out.println("영장");}
		  if(등급2>=90) {System.out.println("수장");} }else { System.out.println("재시험"); }
		 
		//문제7 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고 
		//           비밀번호가 1234 일 경우에는 
		//          로그인 성공 아니면 로그인 실패 출력
		/*
		 * System.out.println("아이디를 입력해주세요"); String 아이디= 입력.next();
		 * System.out.println("비밀번호를 입력해주세요"); int 비밀번호= 입력.nextInt();
		 * if(아이디.equals("admin")){ //비교연산자는(기본자료형에서만사용가능) 비교연산자를 사용해서 비교할거면
		 * 객체명.equals(비교대상) //클래스(객체)는 비교연산자x if(비밀번호==1234){
		 * System.out.println("로그인성공"); } }else{System.out.println("로그인실패");}
		 */
  }
}		
	