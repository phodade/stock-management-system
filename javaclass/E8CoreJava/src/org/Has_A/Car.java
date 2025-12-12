package org.Has_A;

public class Car 
{
	String modelName;
	double price;
	              
	                     //early instantiation
	private Engine engine=new Engine(800);
	
	public Engine getEngine()
	{
		return engine;
	}
	
	public Car(String modelName,double price)
	{
		this.modelName=modelName;
		this.price=price;
	}

}
