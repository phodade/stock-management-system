package practice;

public class E
{
	public static int factorial(int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		factorial(4);
		System.out.println(factorial(4));
	}

}
