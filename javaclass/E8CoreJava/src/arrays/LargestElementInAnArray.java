package arrays;

public class LargestElementInAnArray {
	public static void main(String[]args)
	{
		int [] arr= {12,45,78,90,99,87};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
				
		}
		
		System.out.println("The largest element in an array is "+ max);
		
	}

}
