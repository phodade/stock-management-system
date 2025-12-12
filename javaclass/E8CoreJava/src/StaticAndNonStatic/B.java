package StaticAndNonStatic;

public class B {
	static int x;
	static int y;
	
	public static void main(String[] args)
	{
		int x=34;
		y=125;
		System.out.println(x);
		System.out.println(y);
		System.out.println(B.x);
		System.out.println(B.y);
		test();
		System.out.println(x);
		System.out.println(y);
		System.out.println(B.x);
		System.out.println(B.y);
	}

	public static void test()
	{
		x=123;
		int y=56;
		System.out.println(x);
		System.out.println(y);
		System.out.println(B.x);
		System.out.println(B.y);
		B.y=18;
		int x=7;			
	}
}
