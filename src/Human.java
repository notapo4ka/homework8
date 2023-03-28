public class Human extends Participant {

    public Human(String name, int restrictOfRun, int restrictOfJump) {
        super(name, restrictOfRun, restrictOfJump);
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
        return super.canRun(length);
    }

    @Override
    public boolean canJump(int height) {
        return super.canJump(height);
    }
}
