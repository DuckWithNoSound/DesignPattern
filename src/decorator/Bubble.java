package decorator;

public class Bubble extends MilkTeaDecorator{
    public Bubble(IMilkTea wrapee) {
        super(wrapee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
