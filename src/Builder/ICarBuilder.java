package Builder;

public interface ICarBuilder {

    CarBuilder setCarName(String carName);

    CarBuilder setWheel(Wheel wheel);

    CarBuilder setDoor(Door door);

    CarBuilder setEngine(Engine engine);

    Car build();

}
