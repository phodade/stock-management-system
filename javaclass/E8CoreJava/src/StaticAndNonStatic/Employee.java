package StaticAndNonStatic;

//constructor overloading
public class Employee{
	
	Employee()
	{
		System.out.println("Employee() constructor");
	}
	Employee(String name,int empid)
	{
		System.out.println("Employee(name,id) constructor");
	}
	Employee(String name,int empid,double salary)
	{
		System.out.println("Employee(name,id,sal) constructor");
	}
	
	
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee();
		System.out.println(e2);
		Employee e3=new Employee("revati",23);
		System.out.println(e3);
		Employee e4=new Employee("pratiksha",78,98765);
		System.out.println(e4);	
	}
}
