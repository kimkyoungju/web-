package 잡걸.가계부;

public class boarderdto {
	int num;
	String bday;
	int price;
	String content;
	
	public boarderdto() {}
	
	public boarderdto(int num, String bday, int price, String content) {
		super();
		this.num = num;
		this.bday = bday;
		this.price = price;
		this.content = content;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
