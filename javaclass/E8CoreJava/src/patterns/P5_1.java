package patterns;

public class P5_1
{
	public static void main(String[] args)
	{
		int n=3;
		int num=2;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r<=c)
				{
					System.out.print(num+"  ");
					
					num+=2;
				}
			}
			System.out.println();
		}
	}
		

}
