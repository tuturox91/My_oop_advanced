package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double _shorterBase, _longerBase, _leg;

    public IsoscelesTrapezoid(double shorterBase, double longerBase, double leg, Color color) {
        super("isosceles trapezoid", color);
        this._shorterBase = shorterBase;
        this._longerBase = longerBase;
        this._leg = leg;
    }

    @Override
    public double calculateArea() {
        double h = Math.pow(_leg, 2) - (Math.pow(_longerBase - _shorterBase, 2)) / 4;
        return (_shorterBase+_longerBase) * h/2;
    }

    @Override
    public String drawFigure() {
        return ("Figure: " + super.getName() + ", area: "+ calculateArea() + " sq.units, shorter base: " + _shorterBase + ", longer base: " + _longerBase + ", leg: " + _leg  + " color: " + getColor().toString());
    }
}
