package abstractfactory;

import abstractfactory.circle.ICircle;
import abstractfactory.square.ISquare;

public interface IShapeFactory {
    ISquare createSquare();
    ICircle createCircle();
}
