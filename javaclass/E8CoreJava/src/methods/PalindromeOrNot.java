package methods;

public class PalindromeOrNot {
	
	public static void palindrome(int num)
	{
		int rev=0;
		int tem=num;
		while(num !=0)
		{
			int ld=num % 10;
			rev=rev*10+ld;
			num=num/10;
		}
		
		if(tem==rev)
			System.out.println(tem+" is a palindrome number :");
		else
			System.out.println(tem+" is not a palindrome number :");
	}
	
	public static void main(String[] args)
	{
		palindrome(121);
		palindrome(123);
	}

}
