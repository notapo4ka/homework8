public class Cat extends Member {

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
    public boolean obstacleRun(int length) {
        return length <= restrictOfRun;
    }

    @Override
    public boolean obstacleJump(int height) {
        return height <= restrictOfJump;
    }
}