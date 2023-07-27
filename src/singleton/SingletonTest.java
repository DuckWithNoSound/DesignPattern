package singleton;

import java.util.logging.Logger;

public class SingletonTest {

    private static final Logger logger = Logger.getLogger(SingletonTest.class.getName());

    private SingletonTest(){}

    /**
     * This function used to test Singleton Design Pattern.
     */
    public static void run() {

        // Create instance 1
        Singleton singleton1 = Singleton.getInstance();
        // Do staff by instance 1
        String instance1DoStaff = singleton1.toString().concat(singleton1.doStaff());
        logger.info(instance1DoStaff);

        // Create instance 2
        Singleton singleton2 = Singleton.getInstance();
        String instance2DoStaff = singleton2.toString().concat(singleton2.doStaff());
        // Do staff by instance 2
        logger.info(instance2DoStaff);

        // The output is only one instance do staff 2 times
    }

}