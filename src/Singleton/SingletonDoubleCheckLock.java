package Singleton;

// Thread safe, only synchronized if Singleton is not instantiated yet
public class SingletonDoubleCheckLock {
    private volatile static SingletonDoubleCheckLock uniqueInstance;

    private SingletonDoubleCheckLock() { }

    public static SingletonDoubleCheckLock getInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckLock();
                }
            }
        }
        return uniqueInstance;
    }
}
