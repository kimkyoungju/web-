package java1.ch13컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;

public class Ex4_HashSet {

	public static void main(String[] args) {
		//1. 선언
		HashSet<String> set = new HashSet<>();
	
		//2. 추가
		set.add("java");System.out.println("set 현황 :"+set.toString());
		set.add("jdbc");System.out.println("set 현황 :"+set.toString());
		set.add("sevlet/jsp");System.out.println("set 현황 :"+set.toString());
		set.add("java");System.out.println("set 현황 :"+set.toString()); // 중복발생  [set 해시코드사용 : 데이터 -> 주소값으로 변환 저장]
		set.add("ibatis");System.out.println("set 현황 :"+set.toString());
	
		//해시코드 함수 확인
		System.out.printf( "java 문자열의 해시 코드 변환 : %x \n","java".hashCode());
		System.out.printf( "java 문자열의 해시 코드 변환 : %x \n","java1".hashCode());
		
		System.out.println("set 내 객체수 : "+ set.size());
		
		
			//Iterator () : 순회[순서없는 자료들을 하나씩 순회하는 Iterator 인터페이스(배열,컬렉션 프레임워크)]
		
		Iterator<String>iterator = set.iterator();
		while( iterator.hasNext()) { 			//.hasNext : 다음 객체가 존재하면 true/false
			String element = iterator.next();   // ..next () : 다음객체로 이동 호출
			System.out.println("\t"+ element);
		}
		for(int i = 0; i<set.size(); i++) { //우리가 직접 순회 
			
		}
		for(String s: set) { 
			System.out.println("\t"+s);
		}
	}
	
}
