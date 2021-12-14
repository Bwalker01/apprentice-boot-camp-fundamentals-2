package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzzGame {

    private int currentNum;
    private int threeCount;
    private int fiveCount = 5;

    String play() {
        String gameString = "";
        for (; currentNum < 100; currentNum++)
            gameString += getValue(currentNum) + " ";
        return gameString.substring(0, gameString.length() - 1);
    }

    private String getValue(int currentNum) {
        threeCount++;
        fiveCount--;
        String numValue = threeCount == 3 || fiveCount == 0 ? "" : String.valueOf(currentNum + 1);
        if (threeCount == 3)
            numValue += fizz();
        if (fiveCount == 0)
            numValue += buzz();
        return numValue;
    }

    private String fizz() {
        threeCount = 0;
        return "Fizz";
    }

    private String buzz() {
        fiveCount = 5;
        return "Buzz";
    }

}
