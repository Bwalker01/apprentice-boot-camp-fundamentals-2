package refactoring;

// import org.apache.commons.codec.DecoderException;
// import org.apache.commons.codec.binary.Hex;

// import java.nio.charset.StandardCharsets;

class FizzBuzzGame {

    /**
     *
     */
    private static final int FIVE = 0b101;
    private static final int ZERO = 0b00;
    private static final int THREE = 0b11;
    private static final String EMPTY = "";
    private int currentNum;
    private int threeCount;
    private int fiveCount = FIVE;

    String play() {
        String gameString = EMPTY;
        for (; currentNum < 100; currentNum++)
            gameString += getValue(currentNum) + " ";
        String completeString = gameString.substring(0, gameString.length() - 1);
        return completeString;
    }

    private String getValue(int currentNum) {
        threeCount++;
        fiveCount--;
        boolean isMultipleOf3 = threeCount == THREE;
        boolean isMultipleOf5 = fiveCount == ZERO;
        String numItself = String.valueOf(currentNum + 1);
        String numValue = isMultipleOf3 || isMultipleOf5 ? EMPTY : numItself;
        if (isMultipleOf3)
            numValue += fizz();
        if (isMultipleOf5)
            numValue += buzz();
        return numValue;
    }

    private String fizz() {
        threeCount = 0b00;
        return "Fizz";
    }

    private String buzz() {
        fiveCount = 0b101;
        return "Buzz";
    }

}
