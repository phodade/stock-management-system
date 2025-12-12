package loosly_encapsulated_Example;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee("Avinash",12,67890,"Java Trainer");
		
		Employee e2=new Employee("Collin",22,98675,"Sql Trainer");
		
		Employee e3=new Employee("Rohit",43,23456,"WebTec Trainer");
		
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);
	}
	
	public static void displayDetails(Employee e)
	{
		System.out.println("Name:"+e.name);
		System.out.println("empid:"+e.empid);
		System.out.println("salary:"+e.salary);
        System.out.println("designation:"+e.designation);

        e.working();
		System.out.println("===================================");

	}

}
