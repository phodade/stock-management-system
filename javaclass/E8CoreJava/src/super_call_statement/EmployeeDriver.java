package super_call_statement;

public class EmployeeDriver 
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.empid);
		System.out.println(e1.salary);
		
		
		Employee e2=new Employee("Pratiksha",18,32,9876);
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.empid);
		System.out.println(e2.salary);
				
	}

}
