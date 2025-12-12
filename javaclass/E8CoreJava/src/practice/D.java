package practice;

public class D 
{
	public static void reverse(int num)
	{
		int tem=num;
		int rev=0;
		while(num!=0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		System.out.println("reverse number is "+rev);
		
	}
	public static void main(String[] args) 
	{
		reverse(987);
	}

}
