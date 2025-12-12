package super_keyword;

public class Son extends Father
{
	String name="Johnson";
	
	public void displayName()
	{
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	public static void main(String[] args)
	{
		Son s=new Son();
		s.displayName();
	}
	

}
