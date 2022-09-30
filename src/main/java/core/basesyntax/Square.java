package core.basesyntax;

public class Square extends Figure {

    private double _side;

    public Square(double side, Color color) {
        super("square", color);
        this._side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(_side, 2);
    }

    @Override
    public String drawFigure() {
        return ("Figure: " + super.getName() + ", area: "+ calculateArea() + " sq.units, side: " + _side + " color: " + getColor().toString());
    }
}
