package methods;

public class CountDigits {
	public static void count(int num)
	{
		int tem=num;
		int count=0;
		do
		{
			count++;
			num=num/10;
		}
		while(num != 0);
		System.out.println("Count of digit in "+ tem + " is : "+ count);
	}
	
	public static void main(String[] args)
	{
		count(123456789);
		count(123);
	}

}
