package core.basesyntax;

public abstract class Figure implements iDrawable, iAreaComparable{

    private Color _color;
    private String _name;

    protected Color  getColor() {
        return _color;
    }

    protected String getName() {
        return  _name;
    }

    protected Figure(String name, Color color) {
        this._color = color;
        this._name = name;
    }
}
