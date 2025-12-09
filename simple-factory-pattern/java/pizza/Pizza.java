package pizza;

public abstract class Pizza {

    protected String description = "Unknown Pizaa";

    public String getDescription() {
        return description;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking " + description);
    }

    public void cut() {
        System.out.println("Cutting " + description);
    }

    public void box() {
        System.out.println("Boxing " + description);
    }
}
