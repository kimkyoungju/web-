package java1.키오스크.관리자;

public class MenuDTO {
	
	private int mno;
	private String mname;
	
	public MenuDTO() {}

	public MenuDTO(int mno, String mname) {
		super();
		this.mno = mno;
		this.mname = mname;
	}
	//3. 메소드 필드 접근 

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	
}
