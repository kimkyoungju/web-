package java1.Ch8인터페이스;

public class 비행기게임 implements 게임패드{

	
	@Override
	public void A버튼() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}@Override
	public void B버튼() {
		// TODO Auto-generated method stub
		System.out.println("비행기 교체");
	}@Override
	public void C버튼() {
		// TODO Auto-generated method stub
		System.out.println("수진이 던지기");
	}
}
