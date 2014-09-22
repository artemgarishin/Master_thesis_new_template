package byteCodeCompare;

import java.util.Random;

public class ExampleByteCode1 {

	public void main(String arg[]){
		
		int i = 0;
		i = getnumber();
		if(i > 5){
			System.out.println("i > 5");
		}
		else{
			System.out.println("i < 5");
		}
	}
	
	public int getnumber(){
		Random r = new Random();
		return r.nextInt(10);
	}
}
