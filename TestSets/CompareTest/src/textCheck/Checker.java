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
	
	public void allesWirdGut1(){
		int i = 0;
		switch (i) {
		default:
			i++;
			break;
		case 0:
			i--;
			break;
		}
		boolean b = true;
	}	

	public void allesWirdGut2(){
		int i = 1;
		switch (i) {
		case 0:
			i--;
			break;
		default:
			i = i + 1;
			break;
		}
		
	}	
}

