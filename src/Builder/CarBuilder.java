package Builder;

public class CarBuilder implements ICarBuilder{

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public CarBuilder setCarName(String carName) {
        car.setCarName(carName);
        return this;
    }

    @Override
    public CarBuilder setWheel(Wheel wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public CarBuilder setDoor(Door door) {
        car.setDoor(door);
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
