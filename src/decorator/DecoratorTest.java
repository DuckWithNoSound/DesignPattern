package decorator;

import java.util.logging.Logger;

public class DecoratorTest {

    private static final Logger logger = Logger.getLogger(DecoratorTest.class.getName());

    private DecoratorTest(){}

    public static void run() {

        IMilkTea milkTea = new BlackSugar(new SaltEgg(new Bubble(new Puddin(new MilkTea()))));

        logger.info("Price: " + milkTea.getCost());

    }
}
