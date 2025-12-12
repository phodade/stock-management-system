package this_call_statement;

public class Student
{
	String name;
	int age;
	int sid;
	String course;
	
	{
		System.out.println("IIB of student");
	}
	
	Student()
	{
		System.out.println("Student() constructor");
	}
	
	Student(String name,int age)
	{
		this();
		this.name=name;
		this.age=age;
		System.out.println("Student(name,age)constructor");
	}
	
	Student(String name,int age,int sid,String course)
	{
		this.sid=sid;
		this.course=course;
		System.out.println("Student(name,age,sid,course)constructor");
	}
	

}
