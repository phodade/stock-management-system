package arrays;

public class PassingArrayRefVarToArray {

	public static void main(String[] args)
	{
		int [] a= {4,5,87,65,44,32,11};
		System.out.println(max(a));
		
		int [] b= {-99,-9,-1,-90,-98};
		System.out.println(max(b));
	}
	
	public static int max(int [] arr)
	{
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}
