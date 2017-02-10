package Decorator;

class StrawberyCake extends CakeDecorator {

    public StrawberyCake(Cake cake) {
        super(cake);
    }

    @Override
    public void flavour() {
        super.flavour();
        System.out.println("Adding Strawberry falvour");
    }

    @Override
    public int getAmount() {
        return super.getAmount() + 10;
    }
}
