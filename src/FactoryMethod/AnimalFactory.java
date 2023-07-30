package FactoryMethod;

import java.security.SecureRandom;

public class AnimalFactory implements IAnimalFactory{

    private final SecureRandom random = new SecureRandom();

    private int animalSeq = 0;

    @Override
    public IAnimal createAnimalByType(AnimalType animalType) {

        if(animalType.equals(AnimalType.DOG)) {
            return new Dog();
        } else if (animalType.equals(AnimalType.CAT)) {
            return new Cat();
        } else if (animalType.equals(AnimalType.DUCK)) {
            return new Duck();
        } else {
            return null;
        }
    }

    @Override
    public IAnimal createAnimalBySequence() {

        if(this.animalSeq == 0) {
            this.animalSeq++;
            return new Dog();
        } else if (this.animalSeq == 1) {
            this.animalSeq++;
            return new Cat();
        } else if (this.animalSeq == 2) {
            this.animalSeq = 0;
            return new Duck();
        } else {
            return null;
        }
    }

    @Override
    public IAnimal createAnimalByRandom() {

        int randomAnimalIndex = this.random.nextInt(3);

        if(randomAnimalIndex == 0) {
            this.animalSeq++;
            return new Dog();
        } else if (randomAnimalIndex == 1) {
            this.animalSeq++;
            return new Cat();
        } else if (randomAnimalIndex == 2) {
            this.animalSeq = 0;
            return new Duck();
        } else {
            return null;
        }
    }
}
