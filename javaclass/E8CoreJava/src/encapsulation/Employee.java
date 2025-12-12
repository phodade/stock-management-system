package encapsulation;

public class Employee 
{
	String name;
	int empid;
	double salary;
	String designation;
	
	public void working()
	{
		System.out.println(name+ " is working" + designation);
	}
	
	Employee(String name,int empid,double salary,String designation)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}
	

}
