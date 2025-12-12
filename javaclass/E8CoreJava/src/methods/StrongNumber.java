package methods;

public class StrongNumber {
	public static void main(String[] args)
	{
		int n=145;
		int sum=0;
		int temp=n;
		
		while(n!=0)
		{
			int ld=n%10;
			sum=sum+factorial(ld);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a strong number");
		}
		else
		{
			System.out.println(temp+"is not a strong number");
		}
	}
	
	public static int factorial (int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

}
