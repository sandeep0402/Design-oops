package Factory;

import Abstract.*;

public class CarSedan extends Car
{
    public CarSedan()
    {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building Sedan car");
        //add accessories
    }
}