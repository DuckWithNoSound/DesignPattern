package abstractfactory;

import abstractfactory.circle.ICircle;
import abstractfactory.square.ISquare;

import java.util.logging.Logger;

public class AbstractFactoryTest {

    private static final Logger logger = Logger.getLogger(AbstractFactoryTest.class.getName());

    private AbstractFactoryTest(){}

    /**
     * This function used to test Abstract Factory Design Pattern.
     */
    public static void run() {
        IShapeFactory shapeFactory = new ShapeFactory();

        ISquare square = shapeFactory.createSquare();
        logger.info(square.getSquareName());

        ICircle circle = shapeFactory.createCircle();
        logger.info(circle.getCircleName());
    }
}
