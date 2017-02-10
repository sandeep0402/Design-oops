package Decorator;

class BasicCake implements Cake {

    @Override
    public void flavour() {
        System.out.println("Basic Cake");
    }

    @Override
    public int getAmount() {
        return 50;
    }
}
