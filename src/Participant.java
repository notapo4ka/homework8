import java.util.Objects;

abstract class Participant {
    String name;
    int restrictOfRun;
    int restrictOfJump;

    public Participant(String name, int restrictOfRun, int restrictOfJump) {
        Objects.requireNonNull(name, "Parameter [name] must not be null");
        if (restrictOfRun <= 0 || restrictOfJump <= 0) {
            System.out.println("Parameters [restrictOfRun] and [restrictOfJump] must be greater than 0");
        }
        this.name = name;
        this.restrictOfRun = restrictOfRun;
        this.restrictOfJump = restrictOfJump;
    }

    public String getName() {
        return name;
    }

    public abstract String run();

    public abstract String jump();

    public boolean canRun(int length) {
        return length <= restrictOfRun;
    }

    public boolean canJump(int height) {
        return height <= restrictOfJump;
    }
}
