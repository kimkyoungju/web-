package 개인과제.copy;

import java.util.Random;
import java.util.Scanner;

public class 개인뽑기 {
	
	Scanner scanner = new Scanner(System.in);
	control acon = new control();
	public static void main(String[] args) {
		개인뽑기 개인뽑기 = new 개인뽑기();	
		개인뽑기.random();
		
	}
		
		void random() {
		System.out.println("인원수를 입력해주세요");int 인원수 = scanner.nextInt();
				System.out.println("벌칙을 정해주세요"); String 입력 = scanner.next();
				if(인원수>10) {System.out.println("인원이 너무 많습니다 다시 시작해주세요");return;}
				else {System.out.println("룰렛을 돌립니다 두구두구!!");}
				
				while(true) {
					Random 랜덤 = new Random();
					int 난수  = 랜덤.nextInt((인원수)+1);
					System.out.println(난수+"번"+입력 +"당첨");
					main();
					return;
				}
			}
		void main() {
			System.out.println("당첨자를 적어주세요");String name_list = scanner.next();
			boolean result = acon.main(name_list);
			if(result) {System.out.println("당첨축하 ㅋㅎㅋㅎ 기록할게요 벌칙 잘당해 ^^");}
			else {System.out.println("값이 안넘어가 --");}
		}
	
	}
