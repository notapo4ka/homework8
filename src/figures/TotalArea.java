package figures;

public class TotalArea {

    public static double totalArea(GeometryFigure figures[]) {
        double totalArea = 0.0;

        for (int i = 0; i < figures.length; i++) {
            totalArea += figures[i].areaOfFigure();
        }
        return totalArea;
    }
}