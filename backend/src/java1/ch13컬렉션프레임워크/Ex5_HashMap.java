package java1.ch13컬렉션프레임워크;

import java.util.HashMap;

public class Ex5_HashMap {

		public static void main(String[] args) {
			
			//1. Hash Map <key, value> 선언
			HashMap<String, Integer>map = new HashMap<>();
			
			//2. 저장 : entry (키,값)저장  두개를 합치면 entry {키 = 값,키2=값2,} 
			//*키 (해시코드 ) :중복 불가능 값 : 중복가능   
			//	만일 키가 중복이면 기존 엔트리 제거후 새로운 엔트리 추가
			map.put("신용권", 85); System.out.println(map.toString());
			map.put("홍길동", 90); System.out.println(map.toString());
			map.put("동장군", 80); System.out.println(map.toString());
			map.put("홍길동", 95);System.out.println(map.toString());
			System.out.println("엔트리(키,값) 수 : " +map.size());
			//size = 수 
			//3. 호출 [.get(키)]
					//키 통해 값을 호출할 수 있다
			System.out.println(".get(키) -> 값 반환 :" +map.get("신용권"));
			
			//4.모든 key호출 [.keyset()]
			for(String key : map.keySet()) {
				System.out.println("키"+key);
				System.out.println("값 "+map.get(key));
			}
			//5. 
			map.remove("홍길동");
			//6. 
			map.clear();
		}
}
