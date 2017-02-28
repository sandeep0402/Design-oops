package Abstract;

public class CarFactory
{
    private CarFactory() {
        //Prevent instantiation
    }
 
    public static Car buildCar(CarType type)
    {
        Car car = null;
        Location location = Location.ASIA; //Read location property somewhere from configuration
        //Use location specific car factory
        switch(location)
        {
            case USA:
            car = CarFactoryUSA.buildCar(type);
            break;
            case ASIA:
            car = CarFactoryAsia.buildCar(type);
            break;
            default:
            car = CarFactoryDefault.buildCar(type);
        }
    return car;
    }
}