package core.basesyntax;

public class Rectangle extends Figure {

    private double _shorterBase, _longerBase;


    public Rectangle(double shorterBase, double longerBase, Color color) {
        super("rectangle", color);
        this._shorterBase = shorterBase;
        this._longerBase = longerBase;
    }

    @Override
    public double calculateArea() {
        return _shorterBase * _longerBase;
    }

    @Override
    public String drawFigure() {
        return ("Figure: " + super.getName() + ", area: "+ calculateArea() + " sq.units, Side A: " + _shorterBase + ", Side B: " + _longerBase + " color: " + getColor().toString());
    }
}
