package StaticAndNonStatic;

public class NonStaticVarInNonStaticContext {
	
	int m=18;
	
	public void nsMethod()
	{
		System.out.println("nsMethod()");
	}
	
	public void execution() {
		//i)directly
		System.out.println(m);
		nsMethod();
		
		//ii)using this keyword
		System.out.println(this.m);
		this.nsMethod();
		
		
	}
	
	public static void main(String[] args)
	{
		NonStaticVarInNonStaticContext obj=new NonStaticVarInNonStaticContext();
		obj.execution();
	}

}
