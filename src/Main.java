import figures.*;

public class Main {

    public static void main(String[] args) {
        GeometryFigure[] figures = new GeometryFigure[3];
        figures[0] = new Circle(5);
        figures[1] = new Square(2);
        figures[2] = new Triangle(5, 4);
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Sam", 200, 5);
        participants[1] = new Cat("Huggy", 15, 4);
        participants[2] = new Robot("B-El8", 1000, 6);
        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new JoggingTrack(15);
        obstacles[1] = new Wall(4);

        System.out.println("Площа кола: " + figures[0].getArea());
        System.out.println("Площа квадрата: " + figures[1].getArea());
        System.out.println("Площа трикутника: " + figures[2].getArea());

        System.out.println();

        System.out.println("Сумарна площа всіх фігур: " + GeometryFigure.calculateTotalArea(figures));

        System.out.println();

        System.out.println("Ім'я людини: " + participants[0].getName());
        System.out.println("Ім'я кота: " + participants[1].getName());
        System.out.println("Назва робота: " + participants[2].getName());

        System.out.println();

        System.out.println(participants[0].run() + "\n" + participants[0].jump());
        System.out.println(participants[1].run() + "\n" + participants[1].jump());
        System.out.println(participants[2].run() + "\n" + participants[2].jump());

        System.out.println();

        System.out.println(obstacles[0].overcome(participants[0]));
        System.out.println(obstacles[1].overcome(participants[0]));
        System.out.println(obstacles[0].overcome(participants[1]));
        System.out.println(obstacles[1].overcome(participants[1]));
        System.out.println(obstacles[0].overcome(participants[2]));
        System.out.println(obstacles[1].overcome(participants[2]));

        System.out.println();

        System.out.println(Competition.start(participants, obstacles));
    }
}
