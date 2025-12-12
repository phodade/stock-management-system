package methods;

public class CalculatePower {
	public static int XPowerN(int x,int n)
	{
		int res=1;
		
		for(int i=1;i<=n;i++)
		{
			res=res*x;
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		System.out.println(XPowerN(2,10));
		System.out.println(XPowerN(0,0));
		System.out.println(XPowerN(5,4));
		System.out.println(XPowerN(2,2));
		
	}

}
