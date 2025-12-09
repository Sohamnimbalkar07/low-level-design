package pizza;

public class VeggiePizza extends Pizza{

    public VeggiePizza() {
        description = "Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + description);
    }
}
