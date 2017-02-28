package Abstract;

public class CarFactoryUSA
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SMALL:
            car = new CarSmall(Location.USA);
            break;
 
            case SEDAN:
            car = new CarSedan(Location.USA);
            break;
 
            case LUXURY:
            car = new CarLuxury(Location.USA);
            break;
 
            default:
            //throw some exception
            break;
        }
    return car;
    }
}