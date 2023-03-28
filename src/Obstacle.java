abstract class Obstacle {
    private int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public abstract String overcome(Participant participant);

    public abstract String getObstacleName();
}
