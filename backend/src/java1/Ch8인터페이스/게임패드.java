package java1.Ch8인터페이스;

public interface 게임패드 {
	
	
	// 추상메소드
	
	public void  A버튼(); //추상메소드 = 선언만O 구현 x -> 객체마다 다르게  
	public void  B버튼();
	public void  C버튼();
	
	public default void 게임() {}
	
	
}
