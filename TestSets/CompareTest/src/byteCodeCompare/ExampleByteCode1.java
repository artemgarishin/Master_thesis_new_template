package byteCodeCompare;

public class ExampleByteCode1 {

	public void main(String arg[]){
		
	}
	
	public void byteCode1(int i){
		String s = null;
		if(i > 20){
			i++;
			s = s + "more";
		}
	}
	
	public void byteCode2(double i){
		String str = null;
		str = "first";
		if(i > 20){
			str = str + "more";
			i++;
		}
	}
	
	
	
}
