import abstractmethod.pizza.Pizza;
import abstractmethod.pizzaStore.ChicagoPizzaStore;
import abstractmethod.pizzaStore.NYPizzaStore;
import abstractmethod.pizzaStore.PizzaStore;

public class AbstractFactoryMethod {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a" + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a" + pizza + "\n");

    }
}
