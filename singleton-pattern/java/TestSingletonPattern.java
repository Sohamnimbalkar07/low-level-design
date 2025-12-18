public class TestSingletonPattern {

    public static void main(String[] args) {
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed!");
        }
    }
}
