public class Cat extends Participant {

    public Cat(String name, int restrictOfRun, int restrictOfJump) {
        super(name, restrictOfRun, restrictOfJump);
    }


    @Override
    public String run() {
        return "Кіт може бігати";
    }

    @Override
    public String jump() {
        return "Кіт може стрибати, але не високо";
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
