package tightly_encapsulated_example;

public class Employee 
{
	private String name;
	private int empid;
	private double salary;
	private String designation;
	
	public void working()
	{
		System.out.println(name+" is working"+ designation);
	}
	
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int geEmpid()
	{
		return empid;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getDesignation()
	{
		return designation;
	}
	
	//setters
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public void setempid(int empid)
    {
    	this.empid=empid;
    }
    
    public void salary(double salary)
    {
    	this.salary=salary;
    }
    
    public void setDesignation(String designation)
    {
    	this.designation=designation;
    }
    
    
    Employee(String name,int empid,double salary,String designation)
    {
    	this.name=name;
    	this.empid=empid;
    	this.salary=salary;
    	this.designation=designation;
    }
}
