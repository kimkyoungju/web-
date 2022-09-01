package java1.a변수;

//1. 모든 코드는 class 안에서
public class Ex2_자료형 {	//c s
	//2. 실행할 코드는main안에서 작성 
	public static void main(String[] args) { //main s
		//p. 61
		// 정수타입 [10진수]
		//1. byte : +-128정도
		byte 바이트변수1 = -128; System.out.println("바이트 1:" +바이트변수1);
		byte 바이트변수2 = 127; System.out.println("바이트 2:" +바이트변수2);
		
		//byte 바이트변수3 = 128; System.out.println("바이트 3:" +바이트변수3); //오류발생 : 저장범위 초과
		
		//2 .char [한글자 1개] : 유니코드 
			//문자[1개]입력시 :  ' ' 작은 따음표
			//문자열 [여러개] 입력시 : " " 큰따음표
		char 문자변수1 = 65; System.out.println("문자변수1 :"+문자변수1);
		char 문자변수2 = 'A'; System.out.println("문자변수2:" + 문자변수2);
			int 문자변수3 ='A'; System.out.println(문자변수3);
		char 문자변수4 = '가' ; System.out.println(문자변수4);
			int 문자변수5= '가'; System.out.println(문자변수5);
		//3.  short [10진수] : +-3만정도
		short 쇼트변수1 = 30000; System.out.println("쇼트번수1 :"+쇼트변수1);
		/* short 쇼트변수2 = 40000; System.out.println("쇼트번수1 :"+쇼트변수2); *///쇼트는 3만까지
		
		//4. int [*정수 기본 자료형] : +- 20억정도 가능 
		int 인트변수1 = 1000000000; System.out.println(인트변수1); 
			//int 인트변수  = 30000000000; //오류발생 : 저장 범위 초과
		//5. long[- 입력숫자 뒤에L] : int 이상 
		long 롤변수1 = 1000000000; System.out.println(롤변수1);
		long 롱변수2 = 3000000000000L; System.out.println(롱변수2 );
		
		//실수 타입
		//1. float		[입력 숫자 뒤에 f] [소수점 7자리]
		//2. double		[*실수 기본 자료형]	[소수점 15자리]
		float 실수1 = 3.14f; System.out.println(실수1);
		double 실수2 =3.14; 	System.out.println(실수2);
		double 실수3 = 0.123456787912345677124124; 
			System.out.println(실수3); 			//소수점 17자리 까지만 가능 
		float 실수4 = 0.12345678923124124f; //소수점 8까지만 가능
			System.out.println(실수4);
		
		
		//6.int : 10진수 정수를 저장하는 자료형 [상자]
		int var1 = 0b1011;	//2진수[0b : 2진수 작성 가능]
		System.out.println("2진수 :"+var1);
		int var2 =0206;			//8진수
		System.out.println("8진수 :"+var2);
		int var3 =365;			//10진수
		System.out.println("10진수 :"+var3);
		int var4 =0xb3;			//16진수
		System.out.println("16진수 :"+var4);
		 
		//논리 타입
			//1.boolean :true or false
		boolean 논리변수 = true; System.out.println("논리변수:"+논리변수);
		
		
	}//main e
}// c e
/*
진수
	*2진수를 다른 진수로 변환해서 다양한 표현 단위 사용 가능 --> 많은 단위를 표현가능 
		2진수
		8
		10 					
		16					10---->16
						
	용량[저장단위]
		bit : 0혹은 1					[1bit-> 0혹은 1]
		byte : bit 8개가 모이면 		[1 byte ->01010101->8bit]
		kbyte : 1024byte -> 1kbyte
		mbyte : 1024kb -> 1mb
		gb : 1024mb -> 1gb
	자료형
		*미리 만들어진 변수의 크기 [상자]
		*효율적으로 저장할 데이터의 변수 크기 선택해서 사용하기
		1.정수형
			1.byte		1바이트 +-100정도
			2.char		2바이트	유니코드[영/한글] 한문자
			3.short		2바이트 +-3만정
			*4.int		4바이트 +-20억정도
			5.long		8바이트 +-20이상정도
		2.실수형	
			1.float		4바이트	소수점 8자리 표현
			*2.double	8바이트	소수점 17자리 표현
		3.논리타입
			1.boolean 	1바이트	true,false
*/


