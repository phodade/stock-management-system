package StaticAndNonStatic;

public class I {
	
	int a;
	
	I(int a)
	{
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		I obj1=new I (18);
		System.out.println(obj1.a);
		obj1.m1();
	}

}
