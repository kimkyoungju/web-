package java1.ch5클래스.Ex10;

public class car {	//클래스 [설계도 정의 선언만]
	//1.필드 
	
	int gas;	//gas 수량을 저장하는 int형 필드[변수]
	//2. 생성자
	
	//3. 메소드
	
	//1. 반환값 x 매개변수1개	 int
	void setGas(int gas) {
		this.gas = gas;
		return;
	}
	
	//2. 반환값 boolean 매개변수x
	boolean isLeftGas() {
		if(gas==0) {	//만일 가스 변수가 0이면 
			System.out.println("가스가 없습니다.");
			return false;
		}else {//아니면 
			System.out.println("가스가 있습니다.");
			return true;	
		}
	}
	//3. 반환값x 매개변수x
	void run() {
		while(true){ //무한 반복
			if(gas>0) {
				System.out.println("달립니다.[가스잔량:"+gas+"]");
				gas-=1;
			}else {
				System.out.println("멈춥니다.[가스잔량:"+gas+"]");
				return;
			}
			
		}// we
	}//m e
}
