package StaticAndNonStatic;

public class Bike {
	String modelName;
	int engineCC;
	double price;
	
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		Bike b2=new Bike();
		
		b1.modelName="jawa 42 Bobber";
		b1.engineCC=3500;
		b1.price=30000;
		
		b2.modelName="Lord Splender";
		b2.engineCC=97;
		b2.price=980000;
		
		
		System.out.println(b1.modelName);
		System.out.println(b1.price);
		System.out.println(b1.engineCC);
		
		System.out.println(b2.modelName);
		System.out.println(b2.price);
		System.out.println(b2.engineCC);
	}

}
