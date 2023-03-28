package figures;

public class Square implements GeometryFigure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        if (side < 0) {
            return 0;
        }
        return side * side;
    }
}
