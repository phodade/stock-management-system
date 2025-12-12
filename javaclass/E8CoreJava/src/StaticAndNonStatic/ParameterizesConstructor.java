package StaticAndNonStatic;

public class ParameterizesConstructor {
	String name;
	int rollno;

	ParameterizesConstructor()
	{
		
	}
	
	public static void main(String[] args)
	{
		ParameterizesConstructor s1= new ParameterizesConstructor();
		s1.name="Pratiksha";
		s1.rollno=22;
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		
		ParameterizesConstructor s2= new ParameterizesConstructor();
		s2.name="jaii";
		s2.rollno=21;
		
		System.out.println(s2.name);
		System.out.println(s2.rollno);
		
		ParameterizesConstructor s3= new ParameterizesConstructor();
		s3.name="Purva";
		s3.rollno=10;
		
		System.out.println(s3.name);
		System.out.println(s3.rollno);
		
		
	}
}
