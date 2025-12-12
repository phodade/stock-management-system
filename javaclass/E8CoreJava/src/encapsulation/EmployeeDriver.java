package encapsulation;

public class EmployeeDriver 
{
	public static void main(String[] args) {
		Employee e1=new Employee("Avinash",12,67890,"java Trainer");
		
		Employee e2=new Employee("Collin",24,7896,"SQL Trainer");
		
		Employee e3=new Employee("Rohit",45,65489,"WebTech Trainer");
		
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);
	}
	
	
	public static void displayDetails(Employee e)
	{
		System.out.println("name:"+e.name);
		System.out.println("empid:"+e.empid);
		System.out.println("salary:"+e.salary);
		System.out.println("Designation:"+e.designation);
		
		e.working();
		System.out.println("===================================");
	}

}
