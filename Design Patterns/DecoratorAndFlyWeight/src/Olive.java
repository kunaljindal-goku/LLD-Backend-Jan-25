public class Olive implements ToppingsDecorator {
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+30;
    }

    public double getDiscount() {
        return 0.7;
    }

    @Override
    public void getDescription() {
        pizza.getDescription();
        System.out.println("Olives have been added");
    }
}
