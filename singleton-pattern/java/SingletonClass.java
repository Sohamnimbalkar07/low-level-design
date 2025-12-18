public class SingletonClass {

    private volatile static SingletonClass instance;

    private SingletonClass() {
        // Private constructor to prevent instantiation
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();

                }
            }
        }
        return instance;
    }
}

