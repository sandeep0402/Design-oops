package Decorator;

abstract class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void flavour() {
        cake.flavour();
    }

    @Override
    public int getAmount() {
        return cake.getAmount();
    }
}
