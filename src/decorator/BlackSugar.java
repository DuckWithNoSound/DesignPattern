package decorator;

public class BlackSugar extends MilkTeaDecorator{
    public BlackSugar(IMilkTea wrapee) {
        super(wrapee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 7;
    }
}
