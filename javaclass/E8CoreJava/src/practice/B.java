package practice;

import methods.CountDigits;

public class B 
{
	public static void countDigits(int num)
	{
		int tem=num;
		int count=0;
		
		do {
			count++;
			num=num/10;
		}
		while(num !=0);
			System.out.println("count of digit "+ tem + "is "+count);
	}
	public static void main(String[] args) 
	{
		countDigits(123);
		
	}

}
