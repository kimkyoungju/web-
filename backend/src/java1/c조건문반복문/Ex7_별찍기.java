package java1.c조건문반복문;

import java.util.Scanner;

public class Ex7_별찍기 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); 
			/*
			 * System.out.println("줄수를 입력해주세요");int 입력= scan.nextInt();
			 * 
			 * //1. for(int i= 1; i<=입력; i++) {System.out.print("☆"+"\n");} //2.
			 * System.out.println("줄수를 입력해주세요");int 입력1= scan.nextInt(); for(int i= 1;
			 * i<=입력1; i++) { System.out.print("☆"); if(i%3 ==0) {System.out.println();} }
			 */
			//3
			/*
			 * System.out.println("줄수를 입력해주세요");int 입력2= scan.nextInt(); for(int i=1;
			 * i<=입력2; i++) { for(int x= 1; x<=i; x++) { System.out.print("☆"); }
			 * System.out.println(); }
			 */
			//4.
			System.out.println("줄수를 입력해주세요");int 입력3= scan.nextInt();
				for(int i = 0; i<입력3; i++) {
					for(int j = 1; j<입력3-i+1; j++) { //j = 0 ; j 는 입력값보다  작거나 같아질떄까지 감소
						System.out.print("☆");
					}System.out.println();
				}
			//5
			System.out.println("줄수를 입력해주세요1");int 입력4= scan.nextInt();	
				for(int i = 0; i<=입력4; i++) {
					//공백
					for(int s=0; s<입력4-i; s++) {
						System.out.print(" ");
					}for(int b= 0; b<i; b++) {
						System.out.print("★");
					}System.out.println();
					//별
				}
			//6
				System.out.println("줄수를 입력해주세요2");int 입력5= scan.nextInt();
				for(int i = 0; i<=입력5; i++) {
					//공백
					for(int s=0; s<i; s++) {
						System.out.print(" ");
					}for(int b= 0; b<입력5-i; b++) {
						System.out.print("★");
					}System.out.println();
					//별
				}
			//7
				System.out.println("줄수를 입력해주세요3");int 입력6= scan.nextInt();
				for(int i = 0; i<=입력6; i++) {
					//공백
					for(int s=0; s<입력6-i; s++) {
						System.out.print(" ");
					}for(int b= 0; b<i*2-1; b++) {
						System.out.print("★");
					}System.out.println();
					//별
				}
				System.out.println("줄수를 입력해주세요4");int 입력7= scan.nextInt();
				int num =0;
				for(int i = 0; i<=입력7; i++) {
					//공백
					for(int s=0; s<입력7-i; s++) {
						System.out.print(" ");
					}for(int b= 0; b<i*2-1; b++) {
						System.out.print(num);
					}System.out.println();
					//별
					num++;
				}
				System.out.println("줄수를 입력해주세요5");int 입력8= scan.nextInt();
				for(int i = 1; i<=입력8; i++) {
					//공백
					for(int x = 0; x<i; x++) {
						System.out.print("*");
					}for(int j = 0; j<입력8*2-1-i; j++) {
						System.out.print("☆");
					}
					
					System.out.println();
					//별
				}
		} //m e
}// c e
