package super_call_statement;

public class Employee extends Person
{
	int empid;
	double salary;
	
	Employee()
	{
		super();
		System.out.println("Employee() constructor");
	}
	
	Employee(String name,int age,int empid,double salary)
	{
		super(name,age);
		this.empid=empid;
		this.salary=salary;
		System.out.println("Employee(name,age,empid,salary)constructor");
	}

}
