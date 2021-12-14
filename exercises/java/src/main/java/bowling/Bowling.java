package bowling;

public class Bowling {

    public int calcScore(int[] rolls) {
        int sum = 0;

        for (int rollNum = 0; rollNum < rolls.length; rollNum += 2) {
            int frameScore;

            if (rolls[rollNum] == 10 && rollNum < rolls.length - 2) {
                frameScore = 10 + rolls[rollNum + 1] + rolls[rollNum + 2];

                rollNum--;
            } else {
                frameScore = rolls[rollNum] + rolls[rollNum + 1];

                if (frameScore == 10 && rollNum < rolls.length - 2) {
                    frameScore += rolls[rollNum + 2];
                }
            }
            sum += frameScore;
        }

        return sum;
    }

}
