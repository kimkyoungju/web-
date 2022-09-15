package 개인과제;

import java.util.Scanner;

public class 과제1 {
	public static void main(String[] args) {
		//1. 산수
		int 정수1 = 10; int 정수2= 20;
		System.out.println("1.더하기 "+정수1 + 정수2);
		System.out.println("2.더하기" +(정수1+정수2));
		System.out.println("3.빼기" + (정수1 - 정수2));
		System.out.println("4. 곱하기 " +(정수1*정수2));
		System.out.println("5.나누기 " +(정수1/정수2));
		System.out.println("6나머지" + (정수1 % 정수2));
		//2.비교
		System.out.println("7.이상 :"+(정수1 >=정수2));
		System.out.println("8.이하 :" + (정수1<=정수2));
		System.out.println("9초과 :"  + (정수1>정수2));
		System.out.println("10.미만  :" +(정수1<정수2));
		System.out.println("11. 같다 :" + (정수1==정수2));
		System.out.println("12. 같지 않다 :" + (정수1!=정수2));
		
		//3. 논리
		int 정수3 = 30; int 정수4 = 40;
		System.out.println("13. &&{and} " + (정수1>=정수2&&정수3>=정수4 ));
		System.out.println("14.||{or}" + (정수1>=정수2||정수4>=정수3));
		//4. 증감
		int 정수5 = 10; 
		System.out.println("후위증가 : " + (정수5++));
		System.out.println("확인 : " + 정수5);
		System.out.println("선위증가 :" + (++정수5));
		System.out.println("후위감소 :" + (정수5--));
		System.out.println("확인 :" + 정수5);
		System.out.println("선위감소 :" +(--정수5));
		
		//5. 대입연산자
		int 정수6 = 10; //= 대입
		정수6 += 3; //+= :오른쪽 데잉터를 왼쪽에 더한후에 대입
					//1. 정수6 +3 -> 13 2.정수6 =13
		System.out.println("대입결과 :" + 정수6);
		
		정수6 -= 5;	//1. 정수6-5 -> 8 2..정수6 = 8
		System.out.println("대입 결과 :" +정수6);
		
		//3. 삼항 연산자
		int 점수 = 85;
		char 등급 = 점수>90 ? 'A' :'B'; //조건식? 참 : 거짓
			//만약에 점수가 90 점초과이며면 'a' 대입 아니면 'b'대입
		System.out.println("등급 결과 :" +등급);
		 
		char 등급2 = 점수 >90 ?'A' : 점수 > 80? 'B' :'C' ;
		System.out.println("등급결과 :" +등급2);
	}
	
}/*
연산자 : 계산시 사용되는 특수 문자
1. 산술연산자
 + 더하기 - 빼기 *곱하기/ 나누기 %나머지
 +연결연산자
 2. 비교연산자 -> 결과 : true or false
  >=이상 [크거나 같다] > 초과 [크다] ==[같다]
		  <= [이하 작거나 같다] <미만[작다] != [같지않다/디르다] 
3. 논리 연산자 : 비교연산자 2개이상이면 작성
5 <= a<=10 [x] --> and /or --> a>=5 &&a<=10
&& : and [이면서 면서 이고 그리ㅏ고 모두]
		||:or [이거나 거나 또는 하나라도]
				! " nopt [부정(반대)" : true -> false /false -> true
4. 대입 연산자
	= : 오른쪽 데이터를 왼쪽에 저장
	+= : 오른쪽 데이토ㅓ를 왼쪽데이터와 더한후에 왼쪽에 데ㅐ입
	*= /= %= -=
5. ㅡ증감 연산자
변수 ++[1증가]
변수-- [1감소]
		
6. 삼항 연산자
조건식 ? 참 : 거짓
		조건식1 ? 조건식2 ? 참2 : 거짓 2 : 거짓1 --> 조건식이 많으면 가독성 떨어짐 ->if사용*/