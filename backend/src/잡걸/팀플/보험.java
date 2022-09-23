package 잡걸.팀플;

import java.util.Scanner;

public class 보험 {
		
	
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		System.out.println("[1] 차량보험 [2] 건강보험 [3]주택보험 [4]기타보험"); int 보험 = scanner.nextInt();
		
		if(보험==1) {System.out.println("[1]대인  [2] 자동차사고대인벌금Ⅱ ");}
		if(보험==2) {System.out.println("[1]암 [2]심장 ");}
		if(보험==3) {System.out.println("~~");}
		
		
	}
}
