package loopingStatements;

public class DivisibleBy_2_5_7 {
	public static void main(String[] args)
	{
		int n=75;
		if(n%2==0)
		{
			if(n%5==0)
			{
				if(n%7==0)
				{
					System.out.println(n+" is divisible 2,5 and 7");
				}
					
			}
		}
		else
		{
			System.out.println(n+" is not divisible by 2,5 and 7");
		}
	}

}
