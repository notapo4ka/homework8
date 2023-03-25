public class Human extends Participant {

    final int restrictOfRun = 500;
    final int restrictOfJump = 4;

    public Human(String name) {
        super(name);
    }

    @Override
    public String run() {
        return "Людина може бігати";
    }

    @Override
    public String jump() {
        return "Людина може стрибати";
    }

    @Override
    public boolean canRun(int length) {
        return length <= restrictOfRun;
    }

    @Override
    public boolean canJump(int height) {
        return height <= restrictOfJump;
    }
}
