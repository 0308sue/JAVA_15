package stream.inputstream;

import java.io.IOException;

public class SystemlnTest2 {

	public static void main(String[] args) {
	System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != '\n');{
				System.out.println((char)i);		
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	} 

}
