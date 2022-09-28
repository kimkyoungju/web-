package 개인과제.ch2_의지마켓;

import java.util.Scanner;

public class 의지마켓 {
	
	public static void main(String[] args) {
		String [][] state = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("==============상품현황==============");
		System.out.println("|순서|상품명\t가격\t판매자\t");
		for(int i =0; i<state.length-1; i++){
			if(state[i][0]!=null) {
		System.out.println("|"+i+" |"+state[i][0]+"\t\t"+state[i][1]+"원\t"+state[i][2]+"|");}
		}
		System.out.println("=================================");
		
			
			System.out.println("1.구매하기\t\t\t2.판매하기"); int ch = scanner.nextInt();
			if(ch==1&&state[0][0]==null) {System.out.println("등록된상품이없습니다");}
			else if(ch==1&&state[0][0]!=null) {
				System.out.println("어떤 상품을 보시겠습니까? 순서를 선택해주세요");int ch2 = scanner.nextInt();
				for(int i=0; i<state.length; i++){
					
					if(ch2==i) {
							System.out.println("상품명:"+state[i][0]);
							System.out.println("가격:"+state[i][1]);
							System.out.println("판매자:"+state[i][2]);
							System.out.println("거래지역:"+state[i][3]);
							System.out.println("상품설명:"+state[i][4]);		
					}
				}
			}
			else if(ch==2){
				System.out.println("상품명을 적어주세요");String productname = scanner.next();
				System.out.println("판매자의 성함을 적어주세요");String seller = scanner.next();
				System.out.println("가격을 작성해주세요"); String price = scanner.next();
				System.out.println("선호 거래 방식을 선택해주세요");String dealarea = scanner.next();
				System.out.println("상품의 설명을 적어주세요");String dealcontent = scanner.next();
				for(int i = 0; i< state.length; i++) {	
				if(state[i][0]==null) {
					 state[i][0] =	productname;
					 state[i][1] =  price;
					 state[i][2] =  seller;
					 state[i][3] =  dealarea;
					 state[i][4] = dealcontent;
					 
					 break;
					
					}
				}
			}
			else {System.err.println("누를수 없습니다.");}
			
		}//w e
		
		
		
	}//m e
}// c e
