package textCheck;

import java.util.Random;

public class Checker {

	public void allesOk1(){
		Random r = new Random();
		double d = r.nextDouble();
		switch ((int)d) {
		case 0:
			System.out.println("d = 0");
			break;

		case 4:
			System.out.println("d = 4");
			break;

		default:
			break;
		}
		String favotite = "Hello my test1";
	}
	
	public void allesOk2(){
	
		String f = "Hello my test2";
		Random r = new Random();
		double d = r.nextDouble();
		
		switch ((int)d) {
		case 4:
			System.out.println("d = 4");
			break;
			
		case 0:
			System.out.println("d = 0");
			break;

		case 1:
			f += " and it equal to 1";
			break;
		

		default:
			break;
		}
	}
	
}

