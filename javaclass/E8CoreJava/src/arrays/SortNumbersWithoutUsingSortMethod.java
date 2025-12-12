package arrays;

import java.util.Arrays;

public class SortNumbersWithoutUsingSortMethod {
	public static void main(String[]args)
	{
		int [] arr= {10,9,-3,-9,90,2,45,-1};
		System.out.println("Before sorting: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]> arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("aftre sorting: "+Arrays.toString(arr));
	}

}
