package 개인과제.copy;

import java.sql.Connection;
import java.util.Random;
import java.util.Scanner;

public class 개인뽑기 {
	
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요");int 인원수 = scanner.nextInt();
				System.out.println("벌칙을 정해주세요"); String 입력 = scanner.next();
				while(true) {	
					Random 랜덤 = new Random();
					int 난수  = 랜덤.nextInt((인원수)+1);
					System.out.println(난수+"번"+입력 +"당첨");
					break;
				
			}
		
	}
}
/*for(int i = 0; i<인원수; i++) {*/