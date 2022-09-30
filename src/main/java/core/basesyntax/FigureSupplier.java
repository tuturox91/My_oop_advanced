package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSuplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0: {
                return new Circle(10. * random.nextDouble(), Color.black);
            }
            case 1: {
                return new Square(10. * random.nextDouble(), Color.black);
            }
            case 2: {
                return new Rectangle(10. * random.nextDouble(), 20. * random.nextDouble() + 5, Color.black);
            }
            case 3: {
                return new RightTriangle(5. * random.nextDouble(),5. * random.nextDouble(), Color.black);
            }
            case 4: {
                return new IsoscelesTrapezoid(5. * random.nextDouble(), 10.*random.nextDouble() + 5, 10. * random.nextDouble() +5, Color.black);
            }
        }
        return  null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }

}
