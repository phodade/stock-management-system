package StaticAndNonStatic;

public class D {
	static int a=test1();
	static int b=test1()+test2();
	
	static
	{
		test2();
		System.out.println("SIB");
	}
	
	public static int test1()
	{
		System.out.println("test1()");
		return 10;
	}
	
	public static int test2()
	{
		System.out.println("test2()");
		return test1()+20;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main()");
		System.out.println(a);
		System.out.println(b);
	}
	
}
