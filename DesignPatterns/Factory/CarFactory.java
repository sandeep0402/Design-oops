package Factory;

public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case SMALL:
            car = new CarSmall();
            break;
 
        case SEDAN:
            car = new CarSedan();
            break;
 
        case LUXURY:
            car = new CarLuxury();
            break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }
}