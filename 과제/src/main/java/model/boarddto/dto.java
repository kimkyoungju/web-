package model.boarddto;

public class dto {
	
	
	int num;
	String title; 
	String content;
	String pw;
	String today;
	int view; 
	
	public dto() {}


	

	@Override
	public String toString() {
		return "dto [num=" + num + ", title=" + title + ", content=" + content + ", pw=" + pw + ", today=" + today
				+ ", view=" + view + "]";
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




	public String getToday() {
		return today;
	}




	public void setToday(String today) {
		this.today = today;
	}




	public int getView() {
		return view;
	}




	public void setView(int view) {
		this.view = view;
	}




	public dto(int num, String title, String content, String pw, String today, int view) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.today = today;
		this.view = view;
	}
	
	
}
