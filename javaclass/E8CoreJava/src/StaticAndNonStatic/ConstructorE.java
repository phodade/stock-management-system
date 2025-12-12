package StaticAndNonStatic;

public class ConstructorE {
	
	ConstructorE()
	{
		System.out.println("ConE() constructor");
	}
	
	public static void main(String[]args)
	{
		ConstructorE obj=new ConstructorE();
		System.out.println(obj);
	}
}
