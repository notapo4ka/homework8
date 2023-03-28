package figures;

public class Circle implements GeometryFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius < 0) {
            return 0;
        }
        return Math.PI * radius * radius;
    }
}
