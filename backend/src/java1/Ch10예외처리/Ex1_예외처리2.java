package java1.Ch10예외처리;

public class Ex1_예외처리2 {

	
	public static void main(String[] args) {
		
		//0.
		try {
		Class clazz = Class.forName("java.lang.String2");
				//class.forname : 일반예외발생
		}catch (ClassNotFoundException e) {
				System.out.println("클래스를 존재하지않음"+e);
		}finally {
			System.out.println("클래스 찾든 안찾든 무조건 실행");
			
			
		}
		
		//1.nullpointer
	try {
		String data = null;
		System.out.println(data.toString());
	}catch (NullPointerException e) {
		System.out.println("객체의 내용이 없습니다[참조없다]."+e);
	}
		
		//		
		
//		//2. arrayindexoutofbounds
	
		try {
		String data1 = args[0];
		String data2 = args[1];
		System.out.println("data1:" + data1);
		System.out.println("data2:"+ data2);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 없습니다. :"+e);
		}
		
		////////////////
		try {
		int[] 정수배열 = new int[3];
		for(int i = 0; i<=정수배열.length-1; i++) {
		System.out.println(정수배열[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){System.out.println("배열에 없는 인덱스 입니다"+e);}
		//3. numberformat
		//자료형 입력 안했을떄 기본적으로 들어가는 자료형
		//123 <---int
		//int 정수 = 123
		try {
		String data1 = "100"; //문자열 100
		String data2 = "a100";
			//메소드 호출방법1 : static메소드는  : 클래스명.메소드명()
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1+ value2;
		System.out.println(data1+data2+"="+result);
		}catch (NumberFormatException e) {
		System.out.println("정수형을 변환실패"+e);	// TODO: handle exception
		}
		
		try {
		//1. 자식객체 선언
			Dog dog = new Dog();
				changeDog(dog);
				
				//2. 자식객체 선언
				Cat cat = new Cat();
				changeDog(cat);
			}catch (ClassCastException e) {
			System.out.println("클래스형 변환 실패");// TODO: handle exception
			}
		
		}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal;
		System.out.println("개로 변환");
		}
		System.out.println("고양이는 불가변환");
	}
	
}


