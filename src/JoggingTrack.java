public class JoggingTrack extends Obstacle {

    public JoggingTrack(int length) {
        super(length);
    }

    @Override
    public String overcome(Member member) {
        return member.getName() + " пробіг бігову доріжку";
    }

    @Override
    public String obstacleName() {
        return "Бігова доріжка";
    }
}