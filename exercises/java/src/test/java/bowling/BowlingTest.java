package bowling;

import org.junit.Ignore;
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
    @Ignore
    public void gameWithSingleSpare() {
        int[] rolls = { 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(12);
    }
}
