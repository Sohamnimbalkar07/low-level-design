package pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        description = "Cheese Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + description);
    }
}
