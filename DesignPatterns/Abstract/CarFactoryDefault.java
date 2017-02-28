
import Abstract.Car;
import Abstract.CarType;
import Abstract.Location;
import Abstract.CarLuxury;
import Abstract.CarSedan;
import Abstract.CarSmall;

public class CarFactoryDefault
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SMALL:
            car = new CarSmall(Location.DEFAULT);
            break;
 
            case SEDAN:
            car = new CarSedan(Location.DEFAULT);
            break;
 
            case LUXURY:
            car = new CarLuxury(Location.DEFAULT);
            break;
 
            default:
            //throw some exception
            break;
        }
        return car;
    }
}