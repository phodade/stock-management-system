package practice;

public class Student
{
	String name;
	int id;
	
	Student()
	{
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s1.id);
		
		s1.name="pratu";
		s1.id=22;
		
		System.out.println(s1.name);
		System.out.println(s1.id);
	}
}
