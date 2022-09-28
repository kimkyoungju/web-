package java1.ch12스레드.타이머스레드;

import java.util.Scanner;

public class Ex_실행 {
	
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		Timer timer = new Timer(); //멀티 스레드 선언
		boolean timerstate = false;
		boolean waitstate = true;
		
		
		while(true) {
			System.out.println("1.타이머  2.리셋  3.저장[db]");
			int ch = scanner.nextInt();
			
			if(ch==1 && timerstate == false && waitstate == true) {//1.타이머 처음 켰을때 
				timer.start(); timerstate = true;
				}
		
			else if(ch==1 && timerstate == true && waitstate == true) {//2.타이머가 켜져있을때 일시정지
				timer.setWait(false); waitstate = false;
			}
			//3.타이머가 켜져있을떄 일시정지 해제

			else if(ch==1 && timerstate == true &&waitstate == false) {//2.타이머가 켜져있을때 일시정지
				timer.setWait(true); waitstate = true;
			}
			
			//4. 타이머가 켜져있을떄 리셋
			else if(ch==2) {// timer.stop(); 비권장
			timerstate = false; timer = new Timer();
			timer.setstop(false); //안전하게 종료
			waitstate = true;
			}

		}
	}
}
