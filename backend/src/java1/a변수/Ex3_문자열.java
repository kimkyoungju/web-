package java1.a변수;

public class Ex3_문자열 {
	public static void main(String[] args) {
		
		//p64 String 타입 {string 클래스}
		//char 문자 = "자바"; //char는 문자 1개만 저장가능
		String 문자열 ="자바";
		
		//65
		String name = "홍길동";	System.out.println(name);
		String job ="\"백수\"";		System.out.println(name+"="+job+"입니다");
		
		//66p
		System.out.println("안녕하세요");	//println 출력후 줄바꿈 처림
		System.out.print("자바입니다");	//print   출력후 줄바꿈 x
		System.out.println("hahaha");
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\"");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다");
		System.out.println("봄\\여름\\가을\\겨울\\\n비 갠뒤엔\t비애대신에\"\"happy\"and");
		
		System.out.print("예1.\n\\   /\\\n");
		System.out.println(" ) ( ')");
		System.out.println("(  /  )");	
		System.out.print(" \\(__)|");
		
		System.out.println("\n예2.\n|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("||_/=\\\\_|");
		
		System.out.print("\n예3. \t[[ 출석부]]\n");
		System.out.print("------------------------------\n");
		System.out.print("\n이름\t|1교시\t|2교시\t|3교시");
		System.out.print("\n김경주\t|출석\t|도망\t|월담");
		System.out.print("\n안태섭\t|출석\t|월담\t|먹방");
		System.out.print("\n오찬솝\t|먹방\t|도망\t|행방불명");
		System.out.print("\n------------------------------");
		
		
	}
}
/*
	문자[한글자]		:char	'자'
	문자열[두글자 이상]	: String	"자바 입니다"
	
	console 화면에 출력함수  
		print()			:출력만		(한줄로감)
		printin()		:출력하고 줄바꿈[\n] 포함
		printf()		:형식문자 출력 
	-제어[이스케이프]문자
		1.\n :줄바꿈 2.\t : 들여쓰기 [tab 5칸]
		3.\" :" 출력
*/