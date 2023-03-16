import java.util.Objects;

abstract class Member {
    String name;

    public Member(String name) {
        Objects.requireNonNull(name, "Parameter [name] must not be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String run();

    public abstract String jump();

    public abstract boolean obstacleRun(int length);

    public abstract boolean obstacleJump(int height);
}