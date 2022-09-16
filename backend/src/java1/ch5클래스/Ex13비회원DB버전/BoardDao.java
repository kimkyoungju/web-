package java1.ch5클래스.Ex13비회원DB버전;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;

public class BoardDao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public BoardDao() {
			try {
       con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/boardtest",
				"root",
				"1234");
	
			}catch(Exception e){System.out.println("경고) db접속 실패" + e);}
	}

	//3. 메소드
	//1. 등록 메소드
	boolean regist(BoardDto boardDto) {
		//sql 코드 들어갈 예정
		String sql = " insert"
				+ 		"	into "
				+ 		"	board(b_title , b_content, b_weiter, b_passward,b_view)"
				+ 		" 	values(? , ?,? ,?,?)";
		//sql 연결 조작
		try {
		ps = con.prepareStatement(sql); //위에서 작성된 sql을 ps 인텊페이스 연결
			//? 에 변수 넣기
			ps.setString(1, boardDto.b_title); //1. 첫번째 ?
			ps.setString(2, boardDto.b_content); //1. 첫번째 ?
			ps.setString(3, boardDto.b_weiter); //1. 첫번째 ?
			ps.setString(4, boardDto.b_passward); //1. 첫번째 ?
			ps.setInt(5, 0); //1. 첫번째 ?
	ps.executeUpdate();				// ps인터페이스 sql 실행 
		return true; //등록 성공시 업데이트 성공시 true 
		//3. sql 결과
		}catch(Exception e) {System.out.println("경고)db오류 : "+e);}
		return false;	// 실패시 
	}
	//전체 게시물 수 메소드
	int getrows() {
		
		//1. sql 작성
		String sql = "select count(*) from board";
		
		//2. sql 조작
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {return rs.getInt(1);}	//레코드 [ 행 = 게시물] 개수 반환
		}catch(Exception e) {System.out.println("경고)db오류 : "+e);}
		//3. sql 결과
		return 0;	// 없으면 0
	}
	
		//2. 모든 게시물 리스트 들어갈 예정
	BoardDto[] getBoardlist() {
		int count = getrows(); //전체 게시물 수 함수 호출 -> 반환  count 저장
		BoardDto[] boardlist = new BoardDto[count];	// 배열 선언[배열의 길이 = 게시물 수]
		//1. sql 작성
		String sql = "select * from board";
		//2. sql 연결 / 조작
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();	//select : query //inset , updeat ,delet: executeupdate()
		//resultset re : 쿼리 [sql결과]에 조작
		//rs ->null --.next() --> 검색된 레코드[행] -> .next->다음 레코드 [ 행]
		int index = 0;	// 배열에 인덱스를 대체할 변수 선언
		while(rs.next()) {
			//레코드 한개당 6개의 필드 -> 6개 변수 -> 배열에 담아야지;
			//1. 해당 레코드의 필드를 호출해서 객체화1 
			int b_no= rs.getInt(1); //해당 레코드 게시물 번호 호출
			String b_title =rs.getString(2);
			String b_content=	rs.getString(3);
			String b_writer = rs.getString(4);
			String b_password= rs.getString(5);
			int b_view = rs.getInt(6);
			//1.객체화
			BoardDto board = new BoardDto(b_no, b_title, b_content ,b_writer ,b_password,b_view);
			//2. 객체를 배열에 저장
			boardlist[index] = board;
			//3. 인덱스 증가
			index++;
		}
			
	}catch (Exception e) {System.out.println("경고) db오류" + e);}
		
		//3. sql결과
		return boardlist;
}
	//  개별 코드
	BoardDto getBoard(int b_no) {
		BoardDto board = null;
		 
		String sql = "select * from board where b_no = ?"; //? 변수가 들어갈 자리 뜻
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_no);
			rs = ps.executeQuery(); 
			if(rs.next()) {
				board = new BoardDto(rs.getInt(1),
						rs.getString(2), rs.getString(3),
						rs.getString(4) , rs.getString(5),
						rs.getInt(6)
						);
				//검색된 레코드의 필드를 개체화
			}
		}catch (Exception e) {System.out.println("경고) db오류" + e);
			// TODO: handle exception
		}
		return board;
	}
	//4. 
	boolean update(int b_no , String b_passward, String new_title, String new_content) {
		BoardDto board = null;
		String sql = "update board set new_content = '?' where b_no = ?;";
		
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, new_content);
			ps.executeUpdate();
			if(rs.next());{
			}
			
		}catch (Exception e) {System.out.println("경고) 오류 "+ e);
			// TODO: handle exception
		}
		
		
		return false;
	}
		//5. 삭제 처리 메소드
	boolean delete(int b_no , String b_passward) {
		return false;
	}
}


