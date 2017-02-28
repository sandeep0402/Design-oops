package Abstract;

public class CarSedan extends Car
{
    public CarSedan(Location location)
    {
        super(CarType.SEDAN, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building Sedan car");
        //add accessories
    }
}