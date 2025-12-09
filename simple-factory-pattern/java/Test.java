import pizza.Pizza;

public class Test {

    public static void main(String[] args) {
        // Create a SimplePizzaFactory
        SimplePizzaFactory factory = new SimplePizzaFactory();

        // Create a PizzaStore with the factory
        PizzaStore store = new PizzaStore(factory);

        // Order a Cheese Pizza
        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println("Ordered a " + pizza1.getDescription() + "\n");

        // Order a Veggie Pizza
        Pizza pizza2 = store.orderPizza("veggie");
        System.out.println("Ordered a " + pizza2.getDescription() + "\n");
    }
}
