package Singleton;

public class SingletonTest {

    /**
     * This function used to test Singleton Design Pattern.
     */
    public static void run() {

        // Create instance 1
        Singleton singleton1 = Singleton.getInstance();
        // Do staff by instance 1
        singleton1.doStaff();

        // Create instance 2
        Singleton singleton2 = Singleton.getInstance();
        // Do staff by instance 2
        singleton2.doStaff();

        // The output is only one instance do staff 2 times
    }

}
