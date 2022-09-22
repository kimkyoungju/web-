package java1.ch13컬렉션프레임워크;

import java.util.ArrayList;

public class LinkedList {
	public static void main(String[] args) {
		
		ArrayList<String>list1 = new ArrayList<>();
		java.util.LinkedList<String>list2 = new java.util.LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime(); // 현재 시간을 나노로 출력
		for(int i = 0; i<1000000; i++) {
			list1.add(0,i+""); //숫자 -> 문자열 변환 : 1. 숫자 +"" 2. String.valueOf(숫자)
		}
		endTime = System.nanoTime();
		System.out.println("arraylist 10000개를 삽입하는데 걸리는 시간 :" + (endTime-startTime)+"ns");
		//
		
		startTime = System.nanoTime();
		for(int i = 0; i<1000000; i++) {
			list2.add(0,i+"");
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 10000개를 삽입하는데 걸리는 시간 :" + (endTime-startTime)+"ns");
		//
	}
}
