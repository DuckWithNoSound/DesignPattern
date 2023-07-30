package builder;

import java.util.logging.Logger;

public class BuilderTest {

    private static final Logger logger = Logger.getLogger(BuilderTest.class.getName());

    private BuilderTest(){}

    /**
     * This function used to test Builder Design Pattern.
     */
    public static void run() {
        Car car = new CarBuilder()
                .setCarName("Porsche")
                .setDoor(new Door("Sport Door"))
                .setWheel(new Wheel("Sport Wheel"))
                .setEngine(new Engine("Porsche Engine"))
                .build();

        logger.info(car.toString());
    }
}
