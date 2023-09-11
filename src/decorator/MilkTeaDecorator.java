package decorator;

public abstract class MilkTeaDecorator implements IMilkTea {

    private IMilkTea wrapee;

    public MilkTeaDecorator(IMilkTea wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public int getCost() {
        return wrapee.getCost();
    }
}
