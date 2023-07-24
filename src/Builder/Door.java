package Builder;

public class Door {

    private String wheelName;

    public Door(String wheelName) {
        this.wheelName = wheelName;
    }

    @Override
    public String toString() {
        return "Door{" + wheelName + "}";
    }
}
