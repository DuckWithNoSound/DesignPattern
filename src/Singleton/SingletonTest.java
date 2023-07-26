package Singleton;

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
        logger.info(singleton1 + singleton1.doStaff());

        // Create instance 2
        Singleton singleton2 = Singleton.getInstance();
        // Do staff by instance 2
        logger.info(singleton2 + singleton2.doStaff());

        // The output is only one instance do staff 2 times
    }

}
