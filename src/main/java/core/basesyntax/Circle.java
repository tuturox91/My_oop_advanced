package core.basesyntax;

public class Circle extends Figure {
    private double _radius;

    public Circle(double radius , Color color) {
        super( "circle",color);
        this._radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(_radius,2));
    }


    @Override
    public String drawFigure() {
        return ("Figure: " + super.getName() + ", area: "+ calculateArea() + " sq.units, radius: " + _radius + " color: " + getColor().toString());
    }
}
