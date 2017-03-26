package singleton;

// Thread Unsafe
public class SingletonSingleThread {
    private static SingletonSingleThread uniqueInstance;

    private SingletonSingleThread() { }

    public static SingletonSingleThread getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonSingleThread();
        }
        return uniqueInstance;
    }
}
