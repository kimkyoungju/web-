package java1.Ch10예외처리;

public class Ex1_예외처리 {

	
	public static void main(String[] args) {
		//1.nullpointer
//		String data = null;
//		System.out.println(data.toString());
//		
		
//		//2. arrayindexoutofbounds
//		String data1 = args[0];
//		String data2 = args[1];
//		System.out.println("data1:" + data1);
		
		////////////////
//		int[] 정수배열 = new int[3];
//		for(int i = 0; i<=정수배열.length-1; i++) {
//			System.out.println(정수배열[i]);
//		}
		
		//3. numberformat
		//자료형 입력 안했을떄 기본적으로 들어가는 자료형
		//123 <---int
		//int 정수 = 123
		
//		String data1 = "100"; //문자열 100
//		String data2 = "a100";
//			//메소드 호출방법1 : static메소드는  : 클래스명.메소드명()
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		
//		int result = value1+ value2;
//		//System.out.println);
		
		
		//1. 자식객체 선언
		Dog dog = new Dog();
		changeDog(dog);
		
		//2. 자식객체 선언
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal;
		System.out.println("개로 변환");
		}
		System.out.println("고양이는 불가변환");
	}
	
}


