package factorymethod.pizzaStore;

import factorymethod.pizza.ChicagoStyleCheesePizza;
import factorymethod.pizza.ChicagoStylePepperoniPizza;
import factorymethod.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new ChicagoStyleCheesePizza();
            } else if (item.equals("pepperoni")) {
                return new ChicagoStylePepperoniPizza();
            }  else return null;
    }
}
