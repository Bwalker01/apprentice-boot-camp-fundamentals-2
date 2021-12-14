package bowling;

// import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {
    @Test
    public void gutterGame() {
        int[] rolls = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(0);
    }

    @Test
    public void gameOfNoSpecialCases() {
        int[] rolls = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(20);
    }

    @Test
    public void gameWithSingleSpare() {
        int[] rolls = { 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(12);
    }

    @Test
    public void gameWithMultipleSpares() {
        int[] rolls = { 5, 5, 1, 0, 5, 5, 1, 0, 5, 5, 1, 0, 5, 5, 1, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(48);
    }

    @Test
    public void gameWithSuccessiveSpares() {
        int[] rolls = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(65);
    }

    @Test
    public void gameWithSingleStrike() {
        int[] rolls = { 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(14);
    }

    @Test
    public void gameWithMultipleStrikes() {
        int[] rolls = { 10, 1, 1, 10, 1, 1, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(42);
    }

    @Test
    public void gameWithSuccessiveStrikes() {
        int[] rolls = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 1, 1 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(245);
    }

    @Test
    public void successiveStrikesAndSpares() {
        int[] rolls = { 10, 5, 5, 10, 5, 5, 10, 5, 5, 10, 5, 5, 1, 1, 0, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(153);
    }

    @Test
    public void allStrikes() {
        int[] rolls = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(300);
    }

    @Test
    public void strikesOnlyAtLastFrame() {
        int[] rolls = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 10, 5 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(25);
    }

    @Test
    public void nineZero() {
        int[] rolls = { 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0 };

        assertThat(new Bowling().calcScore(rolls)).isEqualTo(90);
    }
}
