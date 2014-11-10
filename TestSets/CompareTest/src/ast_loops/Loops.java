package ast_loops;

public class Loops {

	public void fragment1(){
		int frameGroupLine = 10;
		for(int Cnt = 1; Cnt < frameGroupLine;  Cnt =+ 2)
		{
			if(Cnt*4 != 2){
				frameGroupLine++;
			}
		}
	}
	
	public void fragment2(){
		int frameTeamLine = 10;
		for(int Counter = 1; Counter < frameTeamLine;  Counter =+ 2)
		{
			if(Counter*4 != 2){ 
				frameTeamLine = frameTeamLine + 1;
			}
		}
	}
	
	public void test3(){
		int frameTeamLine = 10;
		for(int i = 1; i < frameTeamLine;  i =+ 2)
		{
			if(i*4 != 2){ 
				frameTeamLine ++;
			}
		}
	}
	public int i;
	public void method1(){
		if(i > 1) i++;
	}
	
	public void method2(){
		if(i > 1) 
		i++;
	}
}
