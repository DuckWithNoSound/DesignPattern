package Builder;

public class Wheel {

    private String wheelName;

    public Wheel(String wheelName) {
        this.wheelName = wheelName;
    }

    @Override
    public String toString() {
        return "Wheel{" + wheelName + "}";
    }
}
