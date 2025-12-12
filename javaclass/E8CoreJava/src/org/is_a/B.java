package org.is_a;

public class B  extends A
{
	static int j=35;

	
	public static void m2()
	{
		System.out.println("m2() method");
	}
	
	static
	{
		System.out.println("child class is loading");
	}
}
