package Decorator;

class VanillaCake extends CakeDecorator {

    public VanillaCake(Cake cake) {
        super(cake);
    }

    @Override
    public void flavour() {
        super.flavour();
        System.out.println("Adding Vanilla falvour");
    }

    @Override
    public int getAmount() {
        return super.getAmount() + 10;
    }
}
