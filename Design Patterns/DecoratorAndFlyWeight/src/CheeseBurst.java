public class CheeseBurst implements ToppingsDecorator {

    Pizza pizza;

    public CheeseBurst(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+80;
    }

    @Override
    public void getDescription() {
        pizza.getDescription();
        System.out.println("Added cheese burst");
    }
}
