package arrays;

public class PrintOddNoInEvenPlaces {
	
	public static void main(String[] args)
	{
		int [] c= {1,10,18,17,7,45};
		
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0 && c[i]%2==1)
			{
				System.out.println(c[i]);
			}
		}
	}

}
