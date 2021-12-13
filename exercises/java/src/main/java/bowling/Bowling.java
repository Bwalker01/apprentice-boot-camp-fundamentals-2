package bowling;

public class Bowling {

    public int calcScore(int[] rolls) {
        int sum = 0;

        for (int frame = 0; frame < rolls.length; frame += 2) {
            int frameScore;

            if (rolls[frame] == 10) {
                frameScore = 10 + rolls[frame + 1] + rolls[frame + 2];

                frame--;
            } else {
                frameScore = rolls[frame] + rolls[frame + 1];

                if (frameScore == 10) {
                    frameScore += rolls[frame + 2];
                }
            }

            sum += frameScore;
        }

        return sum;
    }

}
