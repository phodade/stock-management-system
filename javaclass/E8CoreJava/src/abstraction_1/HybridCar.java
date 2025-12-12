package abstraction_1;

public class HybridCar implements FuelCar,ElectricCar
{
	public void refuel()
	{
		System.out.println("Refual car with petrol");
	}
	
	public void chargeBettery()
	{
		System.out.println("Recharge the electric bettery");
	}

	public void drive()
	{
		System.out.println("HybridCar can be driven using fual as well as better");
	}

}
