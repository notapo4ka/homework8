public class Wall extends Obstacle {

    public Wall(int height) {
        super(height);
    }

    @Override
    public String overcome(Participant participant) {
        return participant.getName() + " перестрибнув стінку";
    }

    @Override
    public String getObstacleName() {
        return "Стіна";
    }
}
