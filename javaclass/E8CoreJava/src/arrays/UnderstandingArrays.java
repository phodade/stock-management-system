package arrays;

import java.util.Scanner;
public class UnderstandingArrays {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter the size of integer array: ");
		int size=sc.nextInt();
		int [] arr = new int [size];
		
		System.out.println("Enter the values: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The values present in array are: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
