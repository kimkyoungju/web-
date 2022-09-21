package 잡걸.개인과제;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 랜덤뽑기 {
	
	
	
	/*-----------------------------*/
	public static void main(String[] args) {
		
		//DAO dao = new DAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수를 입력하세요"); int 인원수 = scanner.nextInt();
		System.out.println("벌칙을 선택하세요"); String 벌칙 = scanner.next();
		if(인원수>=10) {
			System.out.println("인원이 너무 많습니다");return;
		}else {System.out.println("룰렛을 돌립니다");}

	
		while(true) {
			//ArrayList<DTO>list =dao.랜뽑();
			Random 뽑기 = new Random();
			int 누구 = 뽑기.nextInt((인원수)+1);
			//for(DTO dto :list) {
			System.out.println(누구+"번 :"+벌칙+" 당첨!!");	
			//System.out.println(dto.name_list);
			break;
				}
			//}
		}
	
}


