package StaticAndNonStatic;

public class StaticVarInSNonStaticContext {
	
	static int m=33;
	
	public static void staticMethod()
	{
		System.out.println("StaticMethod()");
	}
	
	public void execution()
	{
		//i)directly
		System.out.println(m);
		staticMethod();
		
		//i)using className
		System.out.println(StaticVarInSNonStaticContext.m);
		StaticVarInSNonStaticContext.staticMethod();
		
		//iii)using this keyword
		System.out.println(this.m);
		this.staticMethod();
	}
	
	public static void main(String[] args)
	{
		StaticVarInSNonStaticContext obj=new StaticVarInSNonStaticContext();
		
	    obj.execution();}

}
