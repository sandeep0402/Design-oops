package Factory;

/*
http://howtodoinjava.com/design-patterns/creational/implementing-factory-design-pattern-in-java/
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
