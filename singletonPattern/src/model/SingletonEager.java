package model;

// eager
public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();
    String name;

    public static SingletonEager getUniqueInstance() {
        return uniqueInstance;
    }
}

// lazy
class SingletonLazy {
    private static SingletonLazy uniqueInstance;
    String name;

    public static synchronized SingletonLazy getUniqueInstance() {
        if (uniqueInstance == null) {
            return new SingletonLazy();
        }
        return uniqueInstance;
    }
}

// double check
class SingletonDoubleCheck {
    // volatile是一个thread改变了值,另一个马上就看到
    private static volatile SingletonDoubleCheck uniqueInstance;
    String name;

    public static SingletonDoubleCheck getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;

    }
}