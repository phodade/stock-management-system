package inheritance;

public class L1 
{
	L1()
	{
		this(null);
		System.out.println("L1()");
	}
	
	L1(String s)
	{
		System.out.println("L1(String)");
		
	}
	L1(boolean b)
	{
		this(b+" ");
		System.out.println("L1(bollean)");
	}

}
