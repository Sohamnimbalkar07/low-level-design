package factorymethod.pizzaStore;

import factorymethod.pizza.NYStyleCheesePizza;
import factorymethod.pizza.NYStylePepperoniPizza;
import factorymethod.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }  else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
