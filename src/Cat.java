public class Cat extends Participant {

    final int restrictOfRun = 15;
    final int restrictOfJump = 2;

    public Cat(String name) {
        super(name);
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
        return length <= restrictOfRun;
    }

    @Override
    public boolean canJump(int height) {
        return height <= restrictOfJump;
    }
}
