abstract class Obstacle {
    public int lengthOrHeight = 0;

    public Obstacle(int lengthOrHeight) {
        this.lengthOrHeight = lengthOrHeight;
    }

    public int getLengthOrHeight() {
        return lengthOrHeight;
    }

    public abstract String overcome(Member member);

    public abstract String obstacleName();
}