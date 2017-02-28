package Factory;

import Abstract.*;

public class CarLuxury extends Car
{
    public CarLuxury()
    {
        super(CarType.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}