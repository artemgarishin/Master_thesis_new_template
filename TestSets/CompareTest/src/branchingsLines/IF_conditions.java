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
	
	public void test6(){
		int o = 0;
		boolean t = true;
		
		int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
        }
	}
	
	public void test7(){
		int o = 0;
		for(int i = 90; i < 1; i-- ){
			if(i < 50){
				System.out.println("we");
			}
			else{
				o++;
			}
		}
	}
	
}
