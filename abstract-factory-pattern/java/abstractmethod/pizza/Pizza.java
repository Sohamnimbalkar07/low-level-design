package abstractmethod.pizza;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;

    abstract public void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Placing pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
