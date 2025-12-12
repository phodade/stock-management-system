package practice;

public class L 
{
	public static void main(String[] args) {
		int arr[]= {19,90,99,98,1,34,56};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
