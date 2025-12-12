package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElementInArray {
	public static void main(String[] args)
	{
		int[] input= {16,8,10,8,7,18};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value which you want to delete from the array:"+ Arrays.toString(input));
		int value=sc.nextInt();
		int count=0;
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==value)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("The value"+value+"is not present in the array. Deletion is not possible!!");
		}
		else
		{
			int [] output=new int[input.length-count];
			int k=0;
			
			for(int i=0;i<input.length;i++)
			{
				if(input[i]!=value)
				{
					output[k]=input[i];
					k++;
				}
			}
			System.out.println(Arrays.toString(output));
		}
	}

}
