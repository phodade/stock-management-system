package StaticAndNonStatic;

public class NonStaticVar {
	String name;
	int rollno;
	
	NonStaticVar()
	{
		
	}
	
	public static void main(String[] args)
	{
		NonStaticVar s1=new NonStaticVar();
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		s1.name="pratiksha";
		s1.rollno=22;
		System.out.println(s1.name);
		System.out.println(s1.rollno);
	}

}
