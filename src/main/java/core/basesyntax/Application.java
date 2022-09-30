package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier fSuplier = new FigureSupplier();
        iDrawable[] figures = new iDrawable[] {
                fSuplier.getRandomFigure(),
                fSuplier.getRandomFigure(),
                fSuplier.getRandomFigure(),
                new Circle(10, Color.green),
                new Square(5, Color.black),
                fSuplier.getDefaultFigure()
        };

        for (var figure: figures)
        {
            System.out.println(figure.drawFigure());
        }
    }
}
