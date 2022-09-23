package java1.Ch11String;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex3_date클래스 {

	
		public static void main(String[] args) {
			//1.date 클래스:  현재 날짜/ 시간 호출
			Date now = new java.util.Date();  System.out.println(now);
			String strnow1 = now.toString();  System.out.println(strnow1);
			
			//2.simpledateformat()   : 날짜/시간 형식[모양] 변환
				//1. SimpleDateFormat 객체명 = new SimpleDateFormat("형식")
				//2. 객체명.format(데이터)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
			String strnow2 = sdf.format(new Date());
			System.out.println(strnow2);
			
			//3. calendar 클래스
			Calendar cal =  Calendar.getInstance(); //운영체제에서 설정되어 있는 시간대 날짜와 시간의 정보 호출 
				//객체명.get(해당 필드명) : 해당 번호의 정보 호출
					//번호 : calendar.필드 => Calendar.YEAR => 1
			int year = cal.get(Calendar.YEAR); System.out.println(year);
			int month = cal.get(Calendar.MONTH)+1; System.out.println(month); 
				//1월[0] ~12월[11]
			int day = cal.get(Calendar.DAY_OF_MONTH); System.out.println(day);					
			int time = cal.get(Calendar.HOUR); System.out.println(time);
			int week = cal.get(Calendar.DAY_OF_WEEK);
			String strweek = null;
			switch (week) { //일 [1]~토[7]
			case Calendar.MONDAY: strweek = "월"; break;
			case Calendar.TUESDAY: strweek = "화"; break;
			case Calendar.WEDNESDAY: strweek = "수"; break;
			case Calendar.THURSDAY: strweek = "목"; break;
			case Calendar.FRIDAY: strweek = "금"; break;
			case Calendar.SATURDAY: strweek = "토"; break;
			default             :        strweek = "일"; break;
		
				}
				System.out.println(strweek);
		
				int ampm = cal.get(Calendar.AM_PM);
						//오전 [0] 오후[1]
				if(ampm==Calendar.AM) {System.out.println("오전");}
				else {System.out.println("오후");}
				
				System.out.println(cal.get(Calendar.HOUR));
				System.out.println(cal.get(Calendar.MINUTE));
				System.out.println(cal.get(Calendar.SECOND));
		
				//다른 클래스의 메소드 호출하는 방법
				//1. Static 정적 멤버일 경우 : 클래스명.메소듬ㅇ
				//2. new 객체 생성 -> 객체명.메소드명
				//3. 싱글톤 -> 클래스ㅡ명.get싱글톤.메소드명
					//현재 클래스의 메소드 호출시 : 메소드명()
				new Ex4_달력().run();
		}
}
