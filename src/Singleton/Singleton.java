package Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    /**
     * Singleton Design Pattern
     * Only one instance of class can be existed on all the time program running.
     * The instance of class is global access.
     * The instance of class is initialized only when it's requested for the first time.
     * @return an instance of Singleton class
     */
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String doStaff () {
        return ": Do staff.";
    }

}
