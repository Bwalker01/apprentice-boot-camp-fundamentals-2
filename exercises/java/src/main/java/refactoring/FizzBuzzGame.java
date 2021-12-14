package refactoring;

// import org.apache.commons.codec.DecoderException;
// import org.apache.commons.codec.binary.Hex;

// import java.nio.charset.StandardCharsets;

class FizzBuzzGame {

    private static final int FIVE = 0b101;
    private static final int ZERO = 0b00;
    private static final int THREE = 0b11;
    private static final String EMPTY = "";
    private int currentNum;
    private int threeCount;
    private int fiveCount = ZERO;

    String play() {
        String gameString = EMPTY;
        for (; currentNum < 100; currentNum++)
            gameString += getValue(currentNum) + " ";
        String completeString = gameString.substring(0, gameString.length() - 1);
        return completeString;
    }

    private String getValue(int currentNum) {
        threeCount++;
        fiveCount++;
        String numValue = threeCount == THREE || fiveCount == FIVE ? EMPTY : String.valueOf(currentNum + 1);
        if (threeCount == THREE)
            numValue += fizz();
        if (fiveCount == FIVE)
            numValue += buzz();
        return numValue;
    }

    private String fizz() {
        threeCount = ZERO;
        return "Fizz";
    }

    private String buzz() {
        fiveCount = ZERO;
        return "Buzz";
    }

}
