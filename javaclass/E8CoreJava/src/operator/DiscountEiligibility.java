package operator;

public class DiscountEiligibility {
	
	public static void main(String[] args)
	{
		double amount=5000;
		
		double c1Bill=7890;
		boolean c1MEMBER=false;
		
		double c2Bill=500;
		boolean c2MEMBER=false;
		
		double c3Bill=3000;
		boolean c3MEMBER =true;
		
		double c4Bill=8976;
		boolean c4MEMBER=true;
		
		System.out.println(c1Bill > amount || c1MEMBER);
		System.out.println(c2Bill > amount || c2MEMBER);
		System.out.println(c3Bill > amount || c3MEMBER);
		System.out.println(c4Bill > amount || c4MEMBER);
			
		
		
	}

}
