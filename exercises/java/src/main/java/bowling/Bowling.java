package bowling;

public class Bowling {

    public int calcScore(int[] rolls) {
        int sum = 0;

        for (int score : rolls) {
            sum += score;
        }

        return sum;
    }

}
