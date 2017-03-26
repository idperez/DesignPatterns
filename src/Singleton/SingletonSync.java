package Singleton;

// Thread safe, synchronized overhead
public class SingletonSync {
    private static SingletonSync singletonSync;

    private SingletonSync() { }

    public static synchronized SingletonSync getInstance() {
        if(singletonSync == null) {
            singletonSync = new SingletonSync();
        }
        return singletonSync;
    }
}
