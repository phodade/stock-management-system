package practice;

import java.util.Arrays;

public class K 
{
	public static void main(String[] args) {
		int arr[]= {23,67,54,3,1,2,99,34,66};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
