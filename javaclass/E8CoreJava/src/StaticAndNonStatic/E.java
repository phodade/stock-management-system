package StaticAndNonStatic;

public class E {
	public static void main(String[] args)
	{
		System.out.println("main()started");
		System.out.println(factorial(5));
		System.out.println("main()ended");	
	}
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
