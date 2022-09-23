package java1.Ch11String;

public class Ex1_String {
	
	public static void main(String[] args) {
		
			
		 byte b = 72;
		 char c = (char) b; System.out.println(c);
		 byte[] bytes = {72,101 ,108,108,111,32,74,97,118,97};
		 char[] chars = new char[10];
		 for (int i = 0 ; i<bytes.length ; i++) {
			chars[i] = (char)bytes[i];
		 }
		 for(int i =0; i<chars.length; i++) {
			 System.out.print(chars[i]);
		 }
		 
		String str1 = new String(bytes);
			System.out.println("\n"+str1);

	
		String str2 = new String(bytes, 6,4);
	
			System.out.println(str2);
			
			//2. 
			byte[] byte2 = new byte[100];
			System.out.println("입력 :");
			try {
				
			int readbyteno = System.in.read(byte2);
				/*for(int i =0; i<=byte2.length; i++) {
					System.out.println(byte2[i]);
				}*/
				String str3 = new String(byte2,0,readbyteno-2);
				System.out.println(str3);
				System.out.println("==========심영선=========");
				
				
			}
			catch (Exception e) { }
			
			}
		}


