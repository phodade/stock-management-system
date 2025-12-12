package arrays;

public class SmallestElementInAnArray {
	public static void main(String[]args)
	{
		int [] arr= {12,45,78,90,99,87,1};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min=arr[i];
			}
				
		}
		
		System.out.println("The smallest element in an array is "+ min);
		
	}

}
