package inheritance;

public class L4 extends L1
{
	L4(double a)
	{
		super("hii");
		System.out.println("L4(double)");
	}
	L4(String s,int a)
	{
		super();
		System.out.println("L4 (String,int)");
	}

}
