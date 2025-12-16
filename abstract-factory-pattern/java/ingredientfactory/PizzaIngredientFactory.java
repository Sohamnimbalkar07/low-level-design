package ingredientfactory;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();
}
