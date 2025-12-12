package arrays;

public class PrintOddNumber {
	public static void main(String[]args)
	{
		int [] b= {33,18,1,7,45};
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==1)
			{
				System.out.println(b[i]);
			}
		}
	}

}
