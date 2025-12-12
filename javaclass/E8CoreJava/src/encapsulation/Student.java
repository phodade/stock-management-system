package encapsulation;

public class Student
{
	String name;
	int sid;
	String course;
	
	public void studying()
	{
		System.out.println(name+" is studying" + course);
	}
	
	Student(String name,int sid,String course)
	{
		this.name=name;
		this.sid=sid;
		this.course=course;
	}

}
