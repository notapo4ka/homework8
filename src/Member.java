import java.util.Objects;

abstract class Participant {
    String name;

    public Participant(String name) {
        Objects.requireNonNull(name, "Parameter [name] must not be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String run();

    public abstract String jump();

    public abstract boolean canRun(int length);

    public abstract boolean canJump(int height);
}
