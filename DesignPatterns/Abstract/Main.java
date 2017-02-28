package Abstract;

/*
http://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
*/
public class Main {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
