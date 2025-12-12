package abstraction_1;

public class CarDriver 
{
    public static void main(String[] args) {
        HybridCar car = new HybridCar();
        car.refuel();
        car.drive();
        car.chargeBettery();

        FuelCar fc = car;
        fc.refuel();

        ElectricCar ec = (ElectricCar)fc;   
        ec.chargeBettery();
    }
}

