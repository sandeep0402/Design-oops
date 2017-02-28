package Abstract;

public class CarLuxury extends Car
{
    public CarLuxury(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}