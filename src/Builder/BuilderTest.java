package Builder;

public class BuilderTest {

    private BuilderTest(){};

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

        System.out.println(car);
    }
}
