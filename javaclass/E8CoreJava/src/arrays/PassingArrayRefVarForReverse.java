package arrays;

import java.util.Arrays;

public class PassingArrayRefVarForReverse {
	public static void reverse(int [] arr)
	{
		int k=arr.length-1;
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
			k--;
		}
	}
	public static void main(String[] args)
	{
		int [] a= {56,90,87,34,67};
		System.out.println("before reversing"+ Arrays.toString(a));
		reverse(a);
		System.out.println("after reversing"+ Arrays.toString(a));
		int [] b= {98,56,10,23};
		System.out.println("before reversing"+ Arrays.toString(b));
		reverse(b);
		System.out.println("after reversing"+ Arrays.toString(b));
		
	}

}
