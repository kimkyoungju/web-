package java1.Ch11String;

import java.util.Scanner;

public class Ex2_String메소드 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//1. 문자열. charAt(인덱스 : 해당 인덱스의 문자 추출
		
		String ssn = "010624-2230123"; // 문자열
		char sex = ssn.charAt(7);		//7번 인덱스의 추출
		System.out.println(sex);
			switch(sex) {
			case '1':
			case '3' :
				System.out.println("남자입니다");break;
			case '2':
			case '4' : 
				System.out.println("여자입니다");break;	
			}
			//2.문자열 equals (문자열2) : 두문자열 비교
			String strvar1 = new String("한문철");
			String strvar2 = "한문철";
				int 정수 = 10; // 정수의 기본자료형은 int
			if(strvar1 == strvar2) {System.out.println("같은 String 객체를 참조");}
			else {System.out.println("(스택값 다르다)다른 String 객체를 참조");}
		
			if(strvar1.equals(strvar2)) {System.out.println("(힙 값이 같다)같은 문자열가짐\t"+strvar1+"tv");}
			else {System.out.println("(힙 값이 다르다)다른 문자열 가짐"+strvar2);}
	
			//3. getbytes(인코딩타입):
			String str = "안녕하세요";
			byte[] bytes1 = str.getBytes(); // 인코딩타입 생략시 : 1. java[jvm]버전 2. 프로젝트설정
			System.out.println("문자열 -> 바이트열변환 길이 :"+bytes1.length);
			String str1 = new String(bytes1); System.out.println("바이트열 -> 문자열 :" + str1); 
			
			try {
				// EUC-KR : 한글 / 영문 지원 영문1바이트 한글2바이트
				byte[] bytes2 = str.getBytes("euc-kr");
				System.out.println("문자열 -> 바이트열(euc-kr) :" +bytes2.length );
				String str2 = new String(bytes2,"euc-kr");
				System.out.println("바이트열 -> 문자열 :"+str2);
				// UTF-8 : 전세계 언어 지원 영문 1바이트 한글3바이트
				byte[] bytes3 = str.getBytes("UTF-8");
				System.out.println("문자열 -> 바이트열(UTF-8) :" +bytes3.length );
				String str3 = new String(bytes3, "UTF-8");
					System.out.println("바이트열 -> 문자열 : " +str3);
					
			} catch (Exception e) {}
	
			//4. indexOf("문자") : 해당 인덱스의 문자 인덱스번호 찾기
			String subject = "자바 프로그래밍";
			System.out.println(subject.indexOf("프로그래밍"));
			
			int location = subject.indexOf("프로그래밍");
			if(location != -1) {System.out.println("찾았다");}
			else {System.out.println("못찾았다");}
			
			//5. length() : 문자열 길이
			String ssn1 = "41424108942";
			int  length = ssn.length();
			if(length == 13) {System.out.println("주민번호 자리수가 맞습니다");}
			else {System.out.println("주민번호 자리수가 틀립니다");}
	
			//6. replace() :치환
			String oldstr = "자바는 객체 지향 언어입니다. 자바는 풍부한 api를 지원합니다.";
			String newstr = oldstr.replace("자바","java");
			
			System.out.println(oldstr);
			System.out.println(newstr);
			
			//7.toLowerCase : 소문자 변환 , toUpperCase: 대문자 변환
			String str2 = "java Programming";
			System.out.println("소문자변환"+str2.toLowerCase());
			System.out.println("대문자변환"+str2.toUpperCase());
			
			//8.trim() : 앞뒤 공백 제거 
			String tel1 = "      02";
			String tel2 = " 123      ";
			String tel3 = "        한문          철";
			System.out.println(tel1.trim());
			System.out.println(tel2.trim());
			System.out.println(tel3.trim());
			
			//9. valueOf() : 다른 자료형 --> 문자열 변환
			System.out.println(10+""); //문자열 10 출력 
			System.out.println(String.valueOf(10)); // 정수형 10 ->문자열 10 출력
			System.out.println(String.valueOf(10.5));// 실수형 10.5 ->문자열 10.5출력
			System.out.println(String.valueOf(true)); //논리형 true ->문자열 true변환
			
			//10.subString( [시작인덱스(포함)],[끝인덱스]) : 문자열 자르기
			String ssn3 = "404040-2132312 ";
			String firstnum = ssn3.substring(0,6);
			System.out.println(firstnum);
					//0번  : 8      6번  :  -          404040
			String secondnum = ssn3.substring(7);
					//7번 : 1  생략 :끝까지   2132312
			System.out.println(secondnum);
		
			//11. split (["기준문자"]) : 기준이 명확하면 split 
				
			String[] result =  ssn3.split("-");
			//'-' 기준으로 자르기 때문에 String 2개 -> 배열
			System.out.println(result[0]);
			System.out.println(result[1]);
			
			"ASD".contains("A");
		
	
	}
}
