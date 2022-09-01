package java1.b연산자;

public class Ex_연산자 {
	public static void main(String[] args) {
		
		int 정수1 =10;
		int 정수2 =20;
		System.out.println("더하기:"+정수1 + 정수2);
		System.out.println("더하기:"+ (정수1+정수2));
		System.out.println("빼기 :" +(정수1-정수2));
		System.out.println("곱하기 :"+ (정수1*정수2));
		System.out.println("나누기:"+(정수1/정수2));
		System.out.println("나머지:"+(정수1%정수2));
		
		//2. 비교
		
		System.out.println("이상 :" +(정수1>=정수2));
		System.out.println("이하:"+(정수1<=정수2));
		System.out.println("초과:"+(정수1>정수2));
		System.out.println("이하:"+(정수1<정수2));
		System.out.println("같다:"+(정수1==정수2));
		System.out.println("같지않다:"+(정수1!=정수2));
		
		//3.논리연산자
		int 정수3=30;
		int 정수4 =40;
		System.out.println("&&[and]"+(정수1>=정수2 &&정수3>=정수4));
		System.out.println("||[or]"+(정수1>=정수2 || 정수4>=정수3));
		//4. 증가
		int 정수5 =10;
		System.out.println("후위증가:"+(정수5++)); //출력후에 1증가
		System.out.println("확인 :" +정수5);
		System.out.println("선위증가 :"+(++정수5));
		System.out.println("후위감소 :"+(정수5--));
		System.out.println("확인:"+(정수5));
		System.out.println("선위감소 :" +(--정수5)); //출력전에 감소
		
		//5. 대입연산자
		int 정수6 =10; // = 대입
		정수6 += 3;  //+= :오른쪽에 데이터를 왼쪽에 더한후에 대입
			//1. 정수 6 +3 ->13 	2.정수6 = 13
		System.out.println("대입결과:"+정수6);
		
		정수6-=5; //1. 정수6 -5 -> 8 2. 정수6 = 8
		System.out.println("대입결과:"+정수6);
		
		//6.삼항연산자
		
		int 점수= 85;
		char 등급 = 점수 > 90 ? 'a' :'b'; //조건식 ? 참:거짓
					//만약에 점수가 90점 이상이면 a대입 아니면 b대입
		System.out.println("등급결과 :" +등급);
		char 등급2 = 점수>90? 'a' : 점수>80? 'b' : 'c';
		System.out.println("삼항 등급 조건 많을떄:"+등급2);
		
		/*
		 * String 심영="의지박약" ; String 의지 = 심영+"1시간탈주";
		 * 
		 * System.out.println(심영+의지);
		 */
		
	
	}
}

/*
	연산자 : 계산시 사용되는 특수 문자
		
		
		1.산술연산자
	    	+ 더하기 -빼기 *곱하기 /나누기 %나머지
	    	+ 연결연산자
	    2.비교연산자	-> 결과 : true 혹은 false
			>=이상 [크거나 같다] >초과[크다] ==[같다]
			<=이하 [작거나 같다] <미만[작다] !=[같지않다]
	    3.논리연산자 : 비교연산자 2개이상 작성
	    	 5<= a <=10 [x] --> and / or --> a>=5 && a<=10
	    	 && : and [이면서 면서 이고 그리고 모두]
	    	 || : or [이거나 거나 또는 하나라도 
	    	 ! 	: not [부정(반대) : true -> false /false -> true
		4.대입연산자
			 = [오른쪽에 데이터를 왼쪽에 저장(대입)
			 += : 오른쪽 데이터를 왼쪽 데이터와 더한후 왼쪽에 대입
			 
		5.증감연산자
		 	변수++[1증가]
			변수--[1감소]
		6.삼항연산자
			조건식 ? 참 : 거짓
			조건식 ? 조건식 ? 참1 --> 조건식이 많으면 가독성 떨어짐 -> if 사용
			
*/