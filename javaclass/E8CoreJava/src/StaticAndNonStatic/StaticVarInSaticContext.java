package StaticAndNonStatic;

public class StaticVarInSaticContext {
	static int m=23;
	
	public static int test()
	{
		System.out.println("test()method");
		return 12;
	}
	
	public static void main(String[] args)
	{
		//i) directly
		System.out.println(m);
		System.out.println(test());
		
		//ii)Using className
		System.out.println(StaticVarInSaticContext.m);
		System.out.println(StaticVarInSaticContext.test());
		
		//iii)Using obj ref var
		StaticVarInSaticContext obj= new StaticVarInSaticContext();
		obj.m=18;
		int num=obj.test();
		
	}
	

}
