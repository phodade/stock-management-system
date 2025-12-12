package org.Has_A;

public class Driver2 
{
	public static void main(String[] args) {
		Car2 car2=new Car2("Tata punch",700000);
		System.out.println(car2);
		System.out.println(car2.modelName);
		System.out.println(car2.price);
		System.out.println(car2.getSoundSystem());
		
		//Lazy instantiation
		car2.addSoundSusyem("Boat 8085");
		System.out.println(car2.getSoundSystem());
		System.out.println(car2.getSoundSystem().getName());
		
	}

}
