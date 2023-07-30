package FactoryMethod;

import java.util.logging.Logger;

public class FactoryMethodTest {
    private FactoryMethodTest(){}

    private static final Logger logger = Logger.getLogger(FactoryMethodTest.class.getName());

    /**
     * This function used to test Factory Method Design Pattern.
     */
    public static void run() {

        AnimalFactory animalFactory = new AnimalFactory();

        IAnimal animal;

        // get an animal by request
        animal = animalFactory.createAnimalByType(AnimalType.DOG);
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalByType(AnimalType.CAT);
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalByType(AnimalType.DUCK);
        logger.info(animal.sayHi());

        // get an animal by sequence
        animal = animalFactory.createAnimalBySequence();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalBySequence();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalBySequence();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalBySequence();
        logger.info(animal.sayHi());

        // get an animal by random
        animal = animalFactory.createAnimalByRandom();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalByRandom();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalByRandom();
        logger.info(animal.sayHi());

        animal = animalFactory.createAnimalByRandom();
        logger.info(animal.sayHi());

    }
}
