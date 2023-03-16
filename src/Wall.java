public class Wall extends Obstacle {

    public Wall(int height) {
        super(height);
    }

    @Override
    public String overcome(Member member) {
        return member.getName() + " перестрибнув стінку";
    }

    @Override
    public String obstacleName() {
        return "Стіна";
    }
}