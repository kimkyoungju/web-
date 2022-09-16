package java1.ch5클래스.Ex13비회원DB버전;

public class BoardControl {
	BoardDao boardDao = new BoardDao();
	//1. 
	boolean regist(String b_title, String b_content, String b_writer, String b_password) {
		//로직 or dao 호출 작성 예정
		//1. 4개의 매개변수를 받는다.
		//2. 변수가 많을때 이동하면 매개변수 코드가 많으니까 객체화 하자
		BoardDto boardDto = new BoardDto(0, b_title, b_content ,b_writer ,b_password,0);
		//3. 
		//4.db처리
		boolean result=	boardDao.regist(boardDto); //dao .regist 
		return result;
	}
	//2.
	BoardDto[] getBoardlist() {
		BoardDto[] boardlist = null;
	    boardlist   = boardDao.getBoardlist();
		return boardlist; //반환
	}
	//3. 
	BoardDto getBoard(int b_no) {
		BoardDto board = null;
		board = boardDao.getBoard(b_no);
		return board;
	}
	//4. 
	boolean update(int b_no, String b_password , String new_title , String new_content ) {
		return false;
	}
	//5.
	boolean delete( int b_no, String b_password) {
		//로직 or dao 호출 작성 예정
		return false;
	}
}
