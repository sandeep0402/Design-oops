package Factory;

import Abstract.*;

public class CarSmall extends Car
{
    public CarSmall()
    {
        super(CarType.SMALL);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
        //add accessories
    }
}