package StaticAndNonStatic;

public class A {
	static int a;
	static boolean b;
	
	public static void main(String[] args)
	{
		String a="Hello";
		double b=12;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(A.a);
		System.out.println(A.b);
	}

}
