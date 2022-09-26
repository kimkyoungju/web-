package java1.ch12스레드;

import java.awt.Toolkit;

public class Ex1_스레드 {
		
	
	public static void main(String[] args) {
		
		
		//1.p.525
		System.out.println("--싱글스레드시작--");
		//싱글스레드 : 소리가 5번 출력되고 문자열 5번 출력된다
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //ui제공 console ui 제공 
		for(int i  = 0; i<10; i++) {
		toolkit.beep();//비프음 소리 함수 [소리 속도보다 반복문이 더 빠르다.[스레드가 더 빠르다.]
		try {
			Thread.sleep(500); //thead.sleep(밀리초) : 밀리초 만큼 현재 스레드 일시정지
				//밀리초 : 1000/1초
				//Thread :현재 스레드
				//.sleep (밀리초) : 스레드 일시정지[무조건 예외처리필수 try 발생]
			} catch (Exception e) { }
		
		}
	
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//////////////////////////////////////////////////////
		System.out.println("--멀티스레드시작--");
		//2. p526
		Runnable beepTask = new beeptask();//구현객체
		Thread thread = new Thread(beepTask);
		thread.start(); //run메소드 호출 
		//main 스레드 생성된 스레드 실행후 다음 코드 실행
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//3. p527 : 익명 구현 객체 
		System.out.println("--익명 구현 객체 멀티스레드--");
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); 
				for(int i  = 0; i<10; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} 
				catch (Exception e) { }
				
				}
				
			}
		});
		thread2.start();
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		System.out.println("==Thread 클래스를 이용한 멀티스레드==");
		
		
		//4.p.529 :thread 클래스 객체
		BeepThread Thread3 = new BeepThread();
		Thread3.start();
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		//5.p.530 : 클래스명 객체명 = new 생성자(){멤버 재정의}
		System.out.println("==Thread 클래스를 이용한 익명자식객체 멀티스레드==");
		Thread thread4 = new Thread(); //객체생성
		
		Thread thread5 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); 
				for(int i  = 0; i<10; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} 
				catch (Exception e) { }
				}
			
			}
			
		};
		thread4.start();
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
		
		
		
		
		return;
	}
}
