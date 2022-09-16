package java1.ch5클래스.Ex13비회원DB버전;

import java.awt.print.Pageable;
import java.util.Scanner;

import java1.ch5클래스.Ex12.Board;

public class Boardpage {
	Scanner scanner = new Scanner(System.in); //입력객체[함수 밖에 만든 이유]
	BoardControl control = new BoardControl();
	
	public static void main(String[] args) {
		// 메소드  호출 방식 : 1. static 2. new
		Boardpage page = new Boardpage();
		page.view();
		
	}//main e
	//0. 메인화면 
	void view() {
		Boardpage page = new Boardpage(); // 메소드 호출용 객체
		while(true) {
			page.getBoardlist();
			System.out.println("1. 글쓰기 2.글제목 선택 :");//1.안내 [출력] -> 입력 [scanner ]
			int btn = scanner.nextInt(); //int 변수를 쓰는이유??
			//경우의 수 2개 +1개 (그외)
			if(btn==1) {page.regist();} 	//1번 입려하면 등록함수 호출
			else if(btn==2) {page.getBoard();}//2번 입력하면 개별 게시물 출력화면 함수 호출
			else {System.out.println("알수 없는 번호입니다.");}
			
		}
	}
	//1.등록화면
	void regist() {
		 System.out.println("===>>>>등록페이지");
		 //1. 출력 -> 입력 -> 저장
		 System.out.println(">>제목 :");		String b_title = scanner.nextLine();
		 System.out.println(">>내용 :");		String b_content= scanner.nextLine();
		 System.out.println(">>작성자  :");	String b_writer = scanner.next();
		 System.out.println(">>패스워드 :");	String b_password= scanner.next();	
		 scanner.nextLine(); // nextLine(
		 //2.입력받은 view에서 입력받은 데이터를 control 이동 [다른 클래스의 메소드 호출]
		 boolean result =  control.regist(b_title, b_content, b_writer, b_password);
		 //3. control처리된  결과를 result 에 저장한다음에 제어 [control 실행후의 결과의 경우의 수] 반환값을 result 에 저장한다음 제어
		 if(result) {System.out.println("안내)게시물 등록 완료");}
		 else {System.out.println("안내) 게시물 등록 실패");}
		 
	}	
	//2.모든 게시물 출력화면
	void getBoardlist() {
		 System.out.println("===>>>>게시판");
		 System.out.println("번호\t작성자\t제목\t조회수");
		 BoardDto[] boardlist =control.getBoardlist(); // control 게시물 호출
		 
		 for(BoardDto dto : boardlist) {	//모든 게시물 
			 //for(  배열의 자료형 반복변수 : 배열 )
			 System.out.print(dto.b_no+"\t");	     System.out.print(dto.b_weiter +"\t");
			 System.out.print(dto.b_title +"\t");  System.out.print(dto.b_view +"\n");
		 
		 }
	}
	//3. 개별게시물 출력화면
	void getBoard() {
		 System.out.println(">> 게시물 번호 :"); int b_no = scanner.nextInt(); //1. 보고싶은 게시물 번호 입력 받는다
		 BoardDto board = control.getBoard(b_no);	// 2. 입력받은 번호를 get board 메소드에 전달하면 해당 게시물 정보를 가져온다 
		 if(board == null) {System.out.println("경고 )해당 게시물이 없습니다."); return;}
		 
		 System.out.println("===>>>개별조회");
		 System.out.print("제목 : " + board.b_title +"\t");
		 System.out.print("작성자 :" + board.b_weiter+"\t");
		 System.out.println("조회수 : " + board.b_view);
		 System.out.println("내용 :" + board.b_content);
		 //출력
		 System.out.print("1. 뒤로가기 2. 수정 3. 삭제:");
		 int btn = scanner.nextInt();
		 Boardpage page = new Boardpage();
		 if(btn==1) {return;}
		 else if (btn==2) {page.update();}//2번 선택시 업데이트 함수 호출
		 else if (btn==3) {page.delete();}//3번 선택시 삭제함수 호출
		 else {}
	}
	///4. 수정처리 화면 출력
	void update () {
		 System.out.println("===>>>>수정처리페이지");
		 System.out.println("비밀번호를 입력해주세요");
		 
	}
	//5. 삭제처리 출력화면
	void delete() {
		 System.out.println("===>>>>삭제처리페이지");
	}
	
}
