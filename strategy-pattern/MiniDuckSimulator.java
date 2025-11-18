import ducks.MallardDuck;
import ducks.ModelDuck;
import behaviors.fly.FlyWithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        ModelDuck model = new ModelDuck();
        model.performFly();

        System.out.println("Changing model duck's behavior at runtime...");
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
