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
	
	public void test1(){
		int i = 1;
		boolean b = true;
		if(i > 1){
			i++;
			b = false;
		}
	}
	
	public void tes2(){
		int i = 0;
		boolean b = false;
		if(i > 1){
			b = false;
			i++;
			b = true;
		}
		double d = 1.1;
	}
	
	public void testedDec1(){
		int i = 1;
		--i;
	}
	
	public void testedDec2(){
		int i = 1;
		i = i -1;
	}
	
	public static void main2(String[] args){
		int i = 0;
		i = i + 3;
	}
	public static void main(String[] args){
		int b = 0;
		for(int i = 1; i <= 10; i++ ){
			b = b + 1;
			System.out.println(b);
		}
		System.out.println();
		int y = 0;
		int i = 0;
		while(i != 10){
			y++;
			i++;
			System.out.println(y);
		}
		
	}
	
	public void loop1(){
		int b = 0;
		for(int i = 1; i <= 10; i++ ){
			b = b + 1;
			System.out.println(b);
		}
	}
	
	public void loop2(){
		int y = 0;
		int i = 0;
		while(i != 10){
			y++;
			i++;
			System.out.println(y);
		}
	}
	
}

