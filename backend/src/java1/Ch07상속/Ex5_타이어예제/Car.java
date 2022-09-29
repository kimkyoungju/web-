package java1.Ch07상속.Ex5_타이어예제;

import java.util.ArrayList;

public class Car {
	//1.필드[변수,객체, 상수 ,배열,리스트]
	
	Tire frontLeftTire1  = new Tire(6,"앞왼쪽");
	Tire frontRightTire2 = new Tire(2,"앞오른쪽");
	Tire backLeftTire3   = new Tire(3,"뒤왼쪽");
	Tire backRightTire4  = new Tire(4,"뒤오른쪽");
	
	
	//2.생성자
	
	//3.메소드

	
	//int resultcar = backLeftTire3.maxRotation;
	
	
	boolean[] run() {
		System.out.println("[자동차가 달립니다]");
		boolean[] tirestate = new boolean[4];
		tirestate[0] = frontLeftTire1.roll();
		tirestate[1] = frontRightTire2.roll();
		tirestate[2] = backLeftTire3.roll();
		tirestate[3] = backRightTire4.roll();
		
		for(boolean b : tirestate) {
			if(b== false) {stop(); break;}
		}
		return tirestate;
		}
	
	
	void stop() {System.out.println("[자동차가 멈춥니다]");}
	
}
