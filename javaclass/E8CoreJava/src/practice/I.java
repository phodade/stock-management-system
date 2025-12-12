package practice;

import java.util.Arrays;

public class I 
{
	public static void main(String[] args)
	{
		int [] arr= {7,11,13,8,9,0,78,1};
		System.out.println("Before sorting"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting"+Arrays.toString(arr));
		
	}

}
