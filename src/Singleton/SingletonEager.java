package Singleton;

// Thread safe, JVM creation
public class SingletonEager {
    private static SingletonEager unniqueInstance = new SingletonEager();

    private SingletonEager() { }

    public static SingletonEager getInstance() {
        return unniqueInstance;
    }
}
