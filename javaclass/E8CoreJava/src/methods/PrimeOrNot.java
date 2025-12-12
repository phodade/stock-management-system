package methods;

public class PrimeOrNot {
	public static void primeNumber(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		
		if(count == 2)
		{
			System.out.println(num + " is prime number ");
		}
		else
		{
			System.out.println(num + " is not prime number ");
		}
	}
	
	public static void main(String[] args)
	{
		primeNumber(56);
		primeNumber(71);
		primeNumber(18);
		primeNumber(7);
	}

}
