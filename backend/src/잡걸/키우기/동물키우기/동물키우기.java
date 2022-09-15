package 잡걸.키우기.동물키우기;

import java.util.Random;
import java.util.Scanner;

public class 동물키우기 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			String[][] 키우기 = new String[9][10];	
			
			System.out.println("어서오세요 동물농장입니다.");
			System.out.println("========동물키우기========");
			System.out.println("설명) 동물은 10까지의 경험치를 쌓으면 다음 클래스로 넘어갑니다. \n시작 = s");String 시작 = scanner.next();
			
			System.out.println("동물이 지정됩니다");
			System.out.println("=======나의 동물 상태=======");
		
			while(true) {
				for( int row = 0 ; row<키우기.length; row++ ) {
					
					for( int col = 0 ; col<키우기[row].length ; col++ ) {
						
						System.out.print( 키우기[row][col] );
						
					}
					
					System.out.println();
					
				}
				
				if(시작.equals("s")){	
					for(int i = 0; i<키우기.length; i++) {
						if(키우기[0][0]==null){
							System.out.println("토끼를 키워주세요");	
							키우기[0][0] = "토끼";
							키우기[1][0] = "고양이";
							키우기[2][0] = "사슴";
						    키우기[3][0] = "고래";
							키우기[4][0] = "하마";
							키우기[5][0] = "기린";
							키우기[6][0] = "늑대";
							키우기[7][0] ="호랑이";
							키우기[8][0] ="사자";
							break;
								}
					}
					
					System.out.println("1.먹이주기 (+3)2.산책(+5) 3.떠나기"); int 선택 = scanner.nextInt();
				if(선택==1){
					for(int i = 0; i<키우기.length; i++) {
						if(키우기[0][0]!=null){
							키우기[0][i+1] = "■";
							break;
						}else {}
					}
				} 	
				else if(선택==2){
					System.out.println("하..");
				}
				else {System.out.println("뭘까이게");}	
				
					}
				}
			
		}
}		
/*for(int i = 1; i<키우기.length; i++ ) {
	if(키우기!=null) {
	if(i==1) {System.out.println("토끼"+토끼);}
	if(i==2) {System.out.println("고양이"+고양이);}	
	}
	while(true) {
		Random 랜덤 = new Random();
		int 난수  =  랜덤.nextInt(9);
		break;
	}
							토끼 = 키우기[0][i];
							고양이 = 키우기[1][i];
							사슴 = 키우기[2][i];
							고래 = 키우기[3][i];
							 하마 = 키우기[4][i];
							 기린 = 키우기[5][i];
							늑대 = 키우기[6][i];
							호랑이 = 키우기[7][i];
							사자 = 키우기[8][i];
}
String 토끼 = 키우기[0][0];
			String 고양이 = 키우기[1][0];
			String 사슴 = 키우기[2][0];
			String 고래 = 키우기[3][0];
			String 하마 = 키우기[4][0];
			String 기린 = 키우기[5][0];
			String 늑대 = 키우기[6][0];
			String 호랑이 = 키우기[7][0];
			String 사자 = 키우기[8][0];
*
*if(시작.equals("s")){System.out.println("토끼를 키워주세요"+토끼);
			System.out.println("1.먹이주기 + (3경험치)"); int 먹이주기 = scanner.nextInt();					
			
*for(int i= 0; i<키우기.length; i++) {
	if(토끼==키우기[0][9]) {
		System.out.println(키우기[i][0]+"다음 동물을 키워주세요");
	}
}
System.out.println("1.먹이주기 + (3경험치)"); int 먹이주기 = scanner.nextInt();			
		for(int i = 0; i<키우기.length; i+=3 ){
					if(먹이주기==1){ 
							토끼 = 키우기[0][i];
							System.out.println("경험치가 증가합니다");}
						if(!토끼.equals(null)||토끼.equals(키우기[0][10])){
							System.out.println("다음 동물을 키우세요");}
						}
					}
			else {System.out.println("처음으로 돌아갑니다.");}
			
				}//e
			}	
			while(true) {
			for(int i = 0; i<키우기.length; i++) {
				if(키우기[0][0]==null){
					String 토끼 = 키우기[0][0];
					String 고양이 = 키우기[1][0];
					String 사슴 = 키우기[2][0];
					String 고래 = 키우기[3][0];
					String 하마 = 키우기[4][0];
					String 기린 = 키우기[5][0];
					String 늑대 = 키우기[6][0];
					String 호랑이 = 키우기[7][0];
					String 사자 = 키우기[8][0];	
					break;
						}
						
						
						
				for( int row = 0 ; row<키우기.length; row++ ) {
					
					for( int col = 0 ; col<키우기[row].length ; col++ ) {
						
						System.out.print( 키우기[row][col] );
						
					}
					
					System.out.println();
					
				}
			for(int i = 0; i<키우기.length; i++) {
						if(키우기[0][0]==키우기[0][9]&&키우기[1][i]==null) {	
							키우기[1][i] = "■";	
							키우기[1][i+1] ="■";
							키우기[1][i+2] ="고양이";
							System.out.println(키우기[1][i]+"가 밥을 좋아합니다");	
							if(키우기[1][0]==키우기[1][9]) {
								System.out.println("어~어??"+키우기[1][0]+"이가 몸이 이상해");}break;}
						}
			}			\
			for( int i = 0 ; i<키우기.length; i++ ) 
						if( 키우기[0][i] == null ) {
							키우기[0][i] ="■";
							키우기[0][i+1] ="■";
							키우기[0][i+2] ="■";
							System.out.println("토끼가 밥을 좋아합니다");	
							if(키우기[0][0]==키우기[0][9]) {
								System.out.println("어~어??"+키우기[0][0]+"이가 몸이 이상해");}
							break;}
						}
					for(int i = 1; i<키우기.length; i++) {
						
						System.out.println( 키우기[0][0] );
						System.out.println( 키우기[0][9] );
						System.out.println( 키우기[1][0] );
						
						
						if( 키우기[1][i] == null &&  키우기[0][9] != null && ( 키우기[0][9].equals("■") )&&(키우기[1][0].equals("고양이"))) {
							
							
							
							키우기[1][i] = "■";	
							키우기[1][i+1] ="■";
							키우기[1][i+2] ="■";
							System.out.println(키우기[1][i]+"가 밥을 좋아합니다");	
							if(키우기[1][0]==키우기[1][9]) {
								System.out.println("어~어??"+키우기[1][0]+"이가 몸이 이상해");}break;}
						}
					for(int i = 0; i<키우기.length; i++) {
							if(키우기[1][0]==키우기[1][9]&&키우기[2][i]==null) {	
								키우기[2][i] = "사슴";	
								키우기[2][i+1] ="사슴";
								키우기[2][i+2] ="사슴";
								System.out.println(키우기[2][i]+"가 밥을 좋아합니다");	
								if(키우기[2][0]==키우기[2][9]) {
									System.out.println("어~어??"+키우기[2][0]+"이가 몸이 이상해");}break;}
							
							}for(int i = 0; i<키우기.length; i++) {
								if(키우기[2][0]==키우기[2][9]&&키우기[3][i]==null) {	
									키우기[3][i] = "고래";	
									키우기[3][i+1] ="고래";
									키우기[3][i+2] ="고래";
									System.out.println(키우기[3][i]+"가 밥을 좋아합니다");	
									break;
									}
								}for(int i = 0; i<키우기.length; i++) {
									if(키우기[3][0]==키우기[3][9]&&키우기[4][i]==null) {	
										키우기[4][i] = "하마";	
										키우기[4][i+1] ="하마";
										키우기[4][i+2] ="하마";
										System.out.println(키우기[4][i]+"가 밥을 좋아합니다");	
										break;
										}
									}
								for(int i = 0; i<키우기.length; i++) {
									if(키우기[4][0]==키우기[4][9]&&키우기[5][i]==null) {	
										키우기[5][i] = "기린";	
										키우기[5][i+1] ="기린";
										키우기[5][i+2] ="기린";
										System.out.println(키우기[5][i]+"가 밥을 좋아합니다");	
										break;
										}
									}for(int i = 0; i<키우기.length; i++) {
										if(키우기[5][0]==키우기[5][9]&&키우기[6][i]==null) {	
											키우기[6][i] = "늑대";	
											키우기[6][i+1] ="늑대";
											키우기[6][i+2] ="늑대";
											System.out.println(키우기[6][i]+"가 밥을 좋아합니다");	
											break;
											}
										}for(int i = 0; i<키우기.length; i++) {
											if(키우기[6][0]==키우기[6][9]&&키우기[7][i]==null) {	
												키우기[7][i] = "호랑이";	
												키우기[7][i+1] ="호랑이";
												키우기[7][i+2] ="호랑이";
												System.out.println(키우기[7][i]+"가 밥을 좋아합니다");	
												break;
												}
											}for(int i = 0; i<키우기.length; i++) {
												if(키우기[7][0]==키우기[7][9]&&키우기[8][i]==null) {	
													키우기[8][i] = "사자";	
													키우기[8][i+1] ="사자";
													키우기[8][i+2] ="사자";
													System.out.println(키우기[8][i]+"가 밥을 좋아합니다");	
													break;
													}
												}
				}else{System.out.println("선택이 불가합니다.");break;}
				}
				for( int row = 0 ; row<키우기.length; row++ ) {
						
						for( int col = 0 ; col<키우기[row].length ; col++ ) {
							
							System.out.print( 키우기[row][col] );
							
						}
						
						System.out.println();
						
					}
				}
*
*/