public class Robot extends Participant {

    final int restrictOfRun = 1000;
    final int restrictOfJump = 1;

    public Robot(String name) {
        super(name);
    }

    @Override
    public String run() {
        return "Робот може бігати";
    }

    @Override
    public String jump() {
        return "Робот може стрибати";
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
