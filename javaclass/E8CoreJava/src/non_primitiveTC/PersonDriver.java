package non_primitiveTC;

public class PersonDriver
{
	public static void main(String[] args)
	{
		Student s1=new Student("BhanuPrakash",32,12,"SDET");
		
		System.out.println(s1);
		
		System.out.println(s1.course);
		
		System.out.println(s1.name);
		
		Person p1=s1;
		
		System.out.println(p1.name);
		
		//System.out.println(p1.course);
		//System.out.println(p1.sid);
	}

}
