package inheritance;

public class L3 extends L2
{
	L3()
	{
		this((char)100);
		System.out.println("L3()");
	}
	L3(char c)
	{
		super(c);
		System.out.println("L3(char)");
		
	}
	L3(int [] arr)
	{
		this();
		System.out.println("L3(int [])");
	}

}
