package StaticAndNonStatic;

public class ThisKeyword {
	String team="Mi";
	
	public void test()
	{
		String team="CSK";
		System.out.println(team);
		System.out.println(this.team);
	}
	
	public static void main(String[] args)
	{
		ThisKeyword obj1= new ThisKeyword();
		obj1.test();
	}

}
