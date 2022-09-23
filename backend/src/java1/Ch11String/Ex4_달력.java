package java1.Ch11String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Ex4_달력 {
	
	//1. 필드
	Scanner scanner  = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int year = cal.get( Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	//2.생성자
	
	//3.메소드
	void run() {
		
		while(true) {
		/////////////////////////////////////////////
		//현재 날짜를 이용한 1일의 요일 찾기[] 		
		cal.set(year, month-1, 1); //현재월의 1일 날짜 
		int sweek = cal.get(Calendar.DAY_OF_WEEK); //현재 월의 1일의 요일
		// 현재 날짜의 마지막 일수 찾기 | getActualMaximum : 마지막 일수 찾는 함수 
		int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 출력 코드 ////
		System.out.printf("==================%d 년 %d월 의 달력==================\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//1. 1일의 전까지 공백 반복문
		for (int i = 1; i<sweek; i++) {System.out.print("\t");}
		
		//2. 1일 ~ 마지막 일수 까지 일수를 출력하는 반복문
		for(int i =1; i<=eday ; i++) {System.out.printf("%2d \t",i);
		//토요일 이후에 줄바꿈처리
		if(sweek % 7 == 0) {System.out.println();}
		sweek ++;// 일수를 출력할때마다 요일도 증가처리
		}
		
		//////////////////////////////////////////////////////////
		일정출력();
		System.out.println("\n====================================================");		
		System.out.println("<이전[1]  >다음달[2]  검색[3(연도/월)]  일정추가[4] :");
		int btn = scanner.nextInt();
			// 이전달 : 월에서 1차감 [ 만일 월이 0 이면 월 = 12 설정 연도 1차감
		if(btn ==1) {month--; if(month ==0) {month=12; year--;}}
			//다음달  : 월에서 1증가
		else if(btn==2) {month++; if(month==13) {month= 1; year++;}}
		else if(btn==3) {System.out.println("연도입력해주세여");
						int ye = scanner.nextInt();
						System.out.println("월을 입력해주세요");
						int mm = scanner.nextInt();
						if(ye <1900|| ye>9999 &&mm<1|| mm>12 ) {System.out.println("지원하지 않습니다.");}
						else { year = ye; month = mm;}
						
		}
		else if(btn==4) {일정추가();}
		
		
		
			}
		}
		void 일정추가() {System.out.println("일정을 추가할 날짜를 선택해주세요");String daye = scanner.next();
		System.out.println("추가할 내용을 적어주세요"); String memoadd = scanner.next();
		boolean resuly = 달력dao.getInstance().일정추가(daye, memoadd);
		if(resuly ) {System.out.println("일정등록");}
		else {System.out.println("등록실패");}
		}	//날짜 메모등
		
		void 일정출력() { 
			System.out.println();
			System.out.println("번호\t날짜\t\t메모");
			String strmonth = ""; 
					if(month <10) {strmonth  = "0"+month;}
					else {strmonth = month + "";}
			HashMap<Integer, ArrayList<String>> map=
			 달력dao.getInstance().일정출력(String.valueOf(year), strmonth);
			
			for(Integer key : map.keySet()) {
				System.out.print(key +"\t");
				for( String list : map.get(key)) {
					System.out.print(list+"\t");
				}
				System.out.println();
			}
			
		}
	}

