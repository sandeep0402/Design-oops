package Decorator;

/**
 * Decorator Design Pattern
 * http://javabypatel.blogspot.in/2016/06/decorator-design-pattern-java.html
 * Say we are opening a Cake shop and planning to sell many flavours of cake.
Also, custom cake order will be accepted as per Customer needs. 
How to design a class for this purpose. Decorator pattern is helpful for this kind of requirement.
 */
public class Main {

    public static void main(String[] args) {
        VanillaCake vanillaStrawberryCake = new VanillaCake(new StrawberyCake(new BasicCake()));
        vanillaStrawberryCake.flavour();
        System.out.println(vanillaStrawberryCake.getAmount());
    }
}
