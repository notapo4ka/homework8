package figures;

public interface GeometryFigure {
    double getArea();

    static double calculateTotalArea(GeometryFigure[] figures) {
        double totalArea = 0.0;

        for (int i = 0; i < figures.length; i++) {
            totalArea += figures[i].getArea();
        }
        return totalArea;
    }
}
