package inheritance;

public class L2 extends L1
{
	L2(double d)
	{
		super(false);
		System.out.println("L2(double)");
	}
	L2()
	{
		this('h');
		System.out.println("L2()");
		
	}

}
