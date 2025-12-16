package abstractmethod.pizzaStore;

import abstractmethod.pizza.CheesePizza;
import abstractmethod.pizza.ClamPizza;
import abstractmethod.pizza.Pizza;
import ingredientfactory.ChicagoIngredientFactory;
import ingredientfactory.NYPizzaIngredientFactory;
import ingredientfactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }
        return pizza;
    }
}
