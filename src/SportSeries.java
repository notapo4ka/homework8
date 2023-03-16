public class SportSeries {

    public static String startSeries(Member members, Obstacle track, Obstacle wall) {
        boolean isKicked = false;
        String firstResult = "";
        String secondResult = "";
        int countOfSuccess = 0;

        if (track.getLengthOrHeight() > 0) {
            if (members.obstacleRun(track.getLengthOrHeight())) {
                countOfSuccess++;
                firstResult = "Учасник " + members.getName() + " пройшов перешкоду " + track.obstacleName() + " на дистанції " + track.getLengthOrHeight() + "м.";
            } else {
                firstResult = "Учасник " + members.getName() + " не пройшов перешкоду " + track.obstacleName() + " на дистанції " + track.getLengthOrHeight() + "м." + " Він вибуває!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и";
                isKicked = true;
            }
        } else {
            return "All Parameters must be non-negative and greater than zero";
        }

        if (wall.getLengthOrHeight() > 0) {
            if (members.obstacleJump(wall.getLengthOrHeight()) && isKicked == false) {
                countOfSuccess++;
                secondResult = "Учасник " + members.getName() + " перестрибнув перешкоду " + wall.obstacleName() + " на висоті " + wall.getLengthOrHeight() + "м." + " Він перемагає!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и";
            } else if (isKicked == false){
                secondResult = "Учасник " + members.getName() + " не перестрибнув перешкоду " + wall.obstacleName() + " на висоті " + wall.getLengthOrHeight() + "м." + " Він вибуває!" + "\n" + "Пройдено: " + countOfSuccess + " перешкод/и";
            }
            return firstResult + "\n" + secondResult;
        } else {
            return "All Parameters must be non-negative and greater than zero";
        }
    }
}