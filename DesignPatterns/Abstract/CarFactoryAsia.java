package Abstract;

public class CarFactoryAsia
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SMALL:
            car = new CarSmall(Location.ASIA);
            break;
 
            case SEDAN:
            car = new CarSedan(Location.ASIA);
            break;
 
            case LUXURY:
            car = new CarLuxury(Location.ASIA);
            break;
 
            default:
            //throw some exception
            break;
        }
        return car;
    }
}