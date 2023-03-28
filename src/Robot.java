public class Robot extends Participant {

    public Robot(String name, int restrictOfRun, int restrictOfJump) {
        super(name, restrictOfRun, restrictOfJump);
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
        return super.canRun(length);
    }

    @Override
    public boolean canJump(int height) {
        return super.canJump(height);
    }
}
