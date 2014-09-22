package byteCodeCompare;

import java.util.Random;

public class ExampleByteCode2 {

	public void main(String arg[]){
			
			int k = 0;
			k = getnumber();
			if(k > 5){
				System.out.println("i > 5");
			}
			else{
				System.out.println("i < 5");
			}
		}
		
		public int getnumber(){
			Random randomV = new Random();
			return randomV.nextInt(10);
		}
}
