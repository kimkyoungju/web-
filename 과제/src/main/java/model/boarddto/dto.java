package model.boarddto;

public class dto {
	
	
	int num;
	String title; 
	String writer;
	String content;
	String pw;
	String day;
	int view;
	
	public dto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "dto [num=" + num + ", title=" + title + ", writer=" + writer + ", content=" + content + ", pw=" + pw
				+ ", day=" + day + ", view=" + view + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public dto(int num, String title, String writer, String content, String pw, String day, int view) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.pw = pw;
		this.day = day;
		this.view = view;
	}
	
	
	
	
	
}
	
	