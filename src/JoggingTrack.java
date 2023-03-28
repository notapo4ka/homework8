public class JoggingTrack extends Obstacle {

    public JoggingTrack(int length) {
        super(length);
    }

    @Override
    public String overcome(Participant participant) {
        return participant.getName() + " пробіг бігову доріжку";
    }

    @Override
    public String getObstacleName() {
        return "Бігова доріжка";
    }
}
