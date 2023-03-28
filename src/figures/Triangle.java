package figures;

public class Triangle implements GeometryFigure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (base < 0 || height < 0) {
            return 0;
        }
        return 0.5 * base * height;
    }
}
