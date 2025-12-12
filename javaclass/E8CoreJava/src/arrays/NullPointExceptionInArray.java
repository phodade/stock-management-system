package arrays;

public class NullPointExceptionInArray {
	
	static boolean[] b;
	
	public static void main(String[] args) 
	{
		int [] a=null;
		System.out.println(a[0]);
		System.out.println(b);
		b[2]=true;
	}

}
