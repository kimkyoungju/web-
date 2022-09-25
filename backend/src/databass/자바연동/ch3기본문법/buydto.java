package databass.자바연동.ch3기본문법;

public class buydto {
	
	 int num;
	 String mem_id;
	 String prod_name;
	 String group_name;
	 int price;
	 int amount;
	 double amount1;
	 
	 public buydto(int num, String mem_id, String prod_name, String group_name, int price, int amount) {
		super();
		this.num = num;
		this.mem_id = mem_id;
		this.prod_name = prod_name;
		this.group_name = group_name;
		this.price = price;
		this.amount = amount;
	}


	public buydto() {
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}


	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public String getGroup_name() {
		return group_name;
	}


	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	 
	 
	 
}


