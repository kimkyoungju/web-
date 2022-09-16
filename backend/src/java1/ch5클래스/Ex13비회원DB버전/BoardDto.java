package java1.ch5클래스.Ex13비회원DB버전;



public class BoardDto {

	
	//1. 필드
	int b_no;
	String b_title;
	String b_content;
	String b_weiter;	
    String b_passward;  
    int b_view;
	//2. 생성자
    public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	public BoardDto(int b_no,  String b_title,String b_content, String b_weiter, String b_passward, int b_view) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_weiter = b_weiter;
		this.b_passward = b_passward;
		this.b_view = b_view;
	}
    
	
}

