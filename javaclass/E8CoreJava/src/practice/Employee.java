package practice;

public class Employee
{

	Employee()
	{
		System.out.println("Employee() constructor");
	}
	
	Employee(String name,int id)
	{
		System.out.println("Employee(name,id)constructor");
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		System.out.println(e1);
		
		Employee e2=new Employee("partiksha",22);
		
		System.out.println(e2);
		
		
		
	}
	

}
