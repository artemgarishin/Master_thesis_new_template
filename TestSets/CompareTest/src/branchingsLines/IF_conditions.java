package branchingsLines;

public class IF_conditions {

	public void test1(){
		int i = 0;
		
		if(i > 0){
			System.out.println();
		}
	}
	
	public void test2(){
		int i = 0;
		
		if(i < 0){
			System.out.println();
		}
	}
	
	public void test3(){
		int i = 0;
		if(i < 0){
			System.out.println();
		}
	}
	
	public void test4(){
		int i = 0;
		if(i < 0){
			System.out.println();
		} else{
			System.out.println("123");
		}
	}
	
	public void test5(){
		int o = 0;
		if(o >= 0 || o != 1){
			System.out.println("123");
		} else{
			System.out.println();
		}
	}
}
