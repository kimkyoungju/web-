package java1.Ch07상속;
										//자동 타입 변환 : 역방향  
class A{}									// A : 슈퍼 클래스
										 // B      C
class B extends A{}                      // D      E
class C extends B{}

class D extends B{}
class E extends C{}

public class Ex4_타입변환 {

	public static void main(String[] args) {
		
		B b = new  B();
		C c = new  C();
		D d = new  D();
		E e = new  E();
		
		A a1 = b;    A a2 = c;
		A a3 = d;    A a4 = e;
		
		B b1 = d;    C c1 = e;
		
		B b3 = e;
		
		
		
	}
	
}
