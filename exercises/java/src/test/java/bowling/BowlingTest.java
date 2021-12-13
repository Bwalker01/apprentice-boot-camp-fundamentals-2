package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {
    @Test
    public void checkingEmptyScore() {
        int[] rolls = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(0);
    }

    @Test
    public void gameOfNoSpecialCases() {
        int[] rolls = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(20);
    }

    @Test
    public void noSpecialCasesAndDifferentEachRoll() {
        int[] rolls = { 4, 5, 6, 3, 4, 5, 7, 2, 8, 1, 2, 4, 7, 1, 5, 2, 7, 1, 3, 2 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(79);
    }
}
