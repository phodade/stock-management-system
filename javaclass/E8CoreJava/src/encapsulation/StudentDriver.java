package encapsulation;

public class StudentDriver 
{
	public static void main(String[] args) {
		Student s1=new Student("Pratiksha",21,"SDE");
		System.out.println(s1);
		System.out.println("name: "+s1.name);
		System.out.println("sid: "+s1.sid);
		s1.studying();
		
	}

}
