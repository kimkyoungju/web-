package java1.c조건문반복문;

import java.util.Scanner;

public class Ex_과제 {
		
		public static void main(String[] args) {
			Scanner 값 = new Scanner(System.in);
			System.out.println("값입력1");int 값1= 값.nextInt();
			System.out.println("값입력2");int 값2= 값.nextInt();
			System.out.println("값입력3");int 값3= 값.nextInt();
			if(값1>값2) {
				int 깡통 = 값1;
					값1 =값2;
					값2= 깡통;		
			}if(값1>값3) {
				int 깡통 = 값1;
					값1 = 값3	;
					값3= 깡통;
				}if(값2>값3) {
					int 깡통 = 값2;
					값2= 값3;
					값3= 깡통;
				}System.out.println(값1 + " "+ 값2 + " "+값3);
		
		
				for(int i = 2; i<=9; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}
		
		}
}


