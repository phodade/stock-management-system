package StaticAndNonStatic;

public class NonStaticVarInStaticContext {
	
	int m=17;
	
	public void nsMethod()
	{
		System.out.println("nsMethod");
	}
	
	public static void main(String[] args)
	{
		NonStaticVarInStaticContext obj=new NonStaticVarInStaticContext();
		System.out.println(obj.m);
		obj.nsMethod();
				
	}

}
