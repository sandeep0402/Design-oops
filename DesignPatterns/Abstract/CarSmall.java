package Abstract;

public class CarSmall extends Car
{
    public CarSmall(Location location)
    {
        super(CarType.SMALL, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
        //add accessories
    }
}