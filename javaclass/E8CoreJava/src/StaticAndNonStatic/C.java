package StaticAndNonStatic;

public class C {
	static String s="good night";
	static int t;
	static double u= 14.5;
	
	static
	{
		t=18;
		System.out.println("SIB1");
	}
	
	static
	{
		System.out.println(t);
		System.out.println("SIB2");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main() started");
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		System.out.println("main() ended");
		
	}

}
