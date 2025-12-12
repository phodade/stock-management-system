package methods;

public class AsciiValue {
	public static void generateAscii(char c)
	{
		int ascii=c;
		
		System.out.println("Ascii value of "+ c +" is "+ ascii);
	}
	
	public static void main(String[] args)
	{
		generateAscii('$');
		generateAscii('a');
		generateAscii('A');
	}

}
