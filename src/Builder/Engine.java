package Builder;

public class Engine {

    private String engineName;

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "Engine{" + engineName + "}";
    }
}
