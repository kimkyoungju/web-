package java1.ch5클래스.Ex12;

public class Board{
	
	// 1. 필드
	String title;
	String content;
	String writer;
	String password;
	int view;
	// 2. 생성자
	public Board() {}
	public Board(String title, String content, String writer, String password, int view) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
	}
	// 3. 메소드 
}