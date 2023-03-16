import figures.*;

public class Main {

    public static void main(String[] args) {
        GeometryFigure figures[] = new GeometryFigure[3];
        figures[0] = new Circle(5);
        figures[1] = new Square(2);
        figures[2] = new Triangle(5, 4);
        Member members[] = new Member[3];
        members[0] = new Human("Sam");
        members[1] = new Cat("Huggy");
        members[2] = new Robot("B-El8");
        Obstacle obstacles[] = new Obstacle[2];
        obstacles[0] = new JoggingTrack(15);
        obstacles[1] = new Wall(4);

        System.out.println("Площа кола: " + figures[0].areaOfFigure());
        System.out.println("Площа квадрата: " + figures[1].areaOfFigure());
        System.out.println("Площа трикутника: " + figures[2].areaOfFigure());

        System.out.println();

        System.out.println("Сумарна площа всіх фігур: " + TotalArea.totalArea(figures));

        System.out.println();

        System.out.println("Ім'я людини: " + members[0].getName());
        System.out.println("Ім'я кота: " + members[1].getName());
        System.out.println("Назва робота: " + members[2].getName());

        System.out.println();

        System.out.println(members[0].run() + "\n" + members[0].jump());
        System.out.println(members[1].run() + "\n" + members[1].jump());
        System.out.println(members[2].run() + "\n" + members[2].jump());

        System.out.println();

        System.out.println(obstacles[0].overcome(members[0]));
        System.out.println(obstacles[1].overcome(members[0]));
        System.out.println(obstacles[0].overcome(members[1]));
        System.out.println(obstacles[1].overcome(members[1]));
        System.out.println(obstacles[0].overcome(members[2]));
        System.out.println(obstacles[1].overcome(members[2]));

        System.out.println();

        System.out.println(SportSeries.startSeries(members[0], obstacles[0], obstacles[1]));
        System.out.println();
        System.out.println(SportSeries.startSeries(members[1], obstacles[0], obstacles[1]));
        System.out.println();
        System.out.println(SportSeries.startSeries(members[2], obstacles[0], obstacles[1]));
    }
}