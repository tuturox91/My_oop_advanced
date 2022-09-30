package core.basesyntax;

public class RightTriangle extends Figure {

    private double _firstLeg, _secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super("right triangle", color);
        this._firstLeg = firstLeg;
        this._secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return  0.5 * (_firstLeg * _secondLeg);
    }

    @Override
    public String drawFigure() {
        return ("Figure: " + super.getName() + ", area: "+ calculateArea() + " sq.units, first leg: " + _firstLeg + ", second leg: " + _secondLeg + " color: " + getColor());
    }
}
