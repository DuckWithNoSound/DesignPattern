package decorator;

public class SaltEgg extends MilkTeaDecorator{
    public SaltEgg(IMilkTea wrapee) {
        super(wrapee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 15;
    }
}
