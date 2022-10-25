package model.Dto;

public class pcatagoryDto {

	private int pcno   ;
	private String pcname;
	public int getPcno() {
		return pcno;
	}
	public void setPcno(int pcno) {
		this.pcno = pcno;
	}
	public String getPcname() {
		return pcname;
	}
	public void setPcname(String pcname) {
		this.pcname = pcname;
	}
	@Override
	public String toString() {
		return "pcatagoryDto [pcno=" + pcno + ", pcname=" + pcname + "]";
	}
	public pcatagoryDto(int pcno, String pcname) {
		super();
		this.pcno = pcno;
		this.pcname = pcname;
	}
	
	public pcatagoryDto() {
		// TODO Auto-generated constructor stub
	}
}
