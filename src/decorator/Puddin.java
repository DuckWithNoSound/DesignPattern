package decorator;

public class Puddin extends MilkTeaDecorator{
    public Puddin(IMilkTea wrapee) {
        super(wrapee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 12;
    }
}
