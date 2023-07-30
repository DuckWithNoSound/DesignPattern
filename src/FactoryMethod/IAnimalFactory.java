package FactoryMethod;

public interface IAnimalFactory {

    IAnimal createAnimalByType(AnimalType animalType);

    IAnimal createAnimalBySequence();

    IAnimal createAnimalByRandom();

}
