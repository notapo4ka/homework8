import java.util.ArrayList;
import java.util.List;

public class Competition {

    public static String start(Participant[] participants, Obstacle[] obstacles) {
        int countOfSuccess = 0;

        List<String> results = new ArrayList<>();
        for (int i = 0; i < participants.length; i++) {
            boolean isKicked = false;
            countOfSuccess = 0;
            for (int j = 0; j < obstacles.length - 1; j++) {
                if (obstacles[j].getDifficulty() <= 0) {
                    return "All Parameters must be non-negative and greater than zero";
                }

                if (obstacles[j].getDifficulty() > 0) {
                    if (participants[i].canRun(obstacles[j].getDifficulty())) {
                        countOfSuccess++;
                        results.add("Учасник " + participants[i].getName() + " пройшов перешкоду " + obstacles[j].getObstacleName() + " на дистанції " + obstacles[j].getDifficulty() + "м.");
                    } else {
                        results.add("Учасник " + participants[i].getName() + " не пройшов перешкоду " + obstacles[j].getObstacleName() + " на дистанції " + obstacles[j].getDifficulty() + "м." + " Він вибуває!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и");
                        isKicked = true;
                    }
                }

                if (obstacles[j + 1].getDifficulty() > 0) {
                    if (participants[i].canJump(obstacles[j + 1].getDifficulty()) && !isKicked) {
                        countOfSuccess++;
                        results.add("Учасник " + participants[i].getName() + " перестрибнув перешкоду " + obstacles[j + 1].getObstacleName() + " на висоті " + obstacles[j + 1].getDifficulty() + "м." + " Він перемагає!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и");
                    } else if (!isKicked) {
                        results.add("Учасник " + participants[i].getName() + " не перестрибнув перешкоду " + obstacles[j + 1].getObstacleName() + " на висоті " + obstacles[j + 1].getDifficulty() + "м." + " Він вибуває!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и");
                    }
                }
            }
        }
        return String.join("\n", results);
    }
}
