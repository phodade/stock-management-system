package loopingStatements;

public class SmallestNumberAmong3 { 
	public static void main(String[] args)
	{
		int a=3;
		int b=4;
		int c=1;
		
		if(a < b && a < c)
		{
			System.out.println(a+" is minimum");
		}
		else if(b < c && b < a)
		{
			System.out.println(b+" is minimum");
		}
		else
		{
			System.out.println(c+" is minimum");
		}
	}

}
