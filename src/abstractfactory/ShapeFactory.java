package abstractfactory;

import abstractfactory.circle.ConcreteCircle;
import abstractfactory.circle.ICircle;
import abstractfactory.square.ConcreteSquare;
import abstractfactory.square.ISquare;

public class ShapeFactory implements IShapeFactory{
    @Override
    public ISquare createSquare() {
        return new ConcreteSquare();
    }

    @Override
    public ICircle createCircle() {
        return new ConcreteCircle();
    }
}
