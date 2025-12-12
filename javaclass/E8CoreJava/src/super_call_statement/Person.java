package super_call_statement;

public class Person
{

	String name;
	int age;
	
	Person()
	{
		System.out.println("Person() constructor");
	}
	
	Person(String name,int age)
	{
		super();
		this.name=name;
		this.age=age;
		
		System.out.println("Person(name,age) constructor");
	}
}
