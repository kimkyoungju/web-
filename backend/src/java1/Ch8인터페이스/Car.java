package java1.Ch8인터페이스;

public class Car {

	
	Tire frontlefttire = new HankookTire();
	Tire frontrighttire = new HankookTire();
	Tire backlefttire = new HankookTire();
	Tire backrighttire = new HankookTire();
	void run() {
		frontlefttire.roll();
		frontrighttire.roll(); 
		backlefttire.roll(); 
		backrighttire.roll();
	}
}
