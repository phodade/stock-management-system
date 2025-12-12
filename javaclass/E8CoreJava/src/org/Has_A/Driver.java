package org.Has_A;

public class Driver 
{
	public static void main(String[] args) {
		Car car=new Car("Maruti 800",40000);
		
		System.out.println(car);
		System.out.println(car.modelName);
		System.out.println(car.price);
		System.out.println(car.getEngine());
		System.out.println(car.getEngine().getCc());
					
	}

}
