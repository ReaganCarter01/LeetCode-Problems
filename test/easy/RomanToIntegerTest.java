package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {
    @Test
    public void testRomanI() {
        RomanToInteger romanToInt = new RomanToInteger();
        String s = "III";
        int expected = 3;
        int result = romanToInt.romanToInt(s);

        assertEquals(expected, result);
    }

    @Test
    public void testRomanIV() {
        RomanToInteger romanToInt = new RomanToInteger();
        String s = "IV";
        int expected = 4;
        int result = romanToInt.romanToInt(s);

        assertEquals(expected, result);
    }

    @Test
    public void testRomanMCMXCIV() {
        RomanToInteger romanToInt = new RomanToInteger();
        String s = "MCMXCIV";
        int expected = 1994;
        int result = romanToInt.romanToInt(s);

        assertEquals(expected, result);
    }

    @Test
    public void testRomanEmpty() {
        RomanToInteger romanToInt = new RomanToInteger();
        String s = "";
        int expected = 0;
        int result = romanToInt.romanToInt(s);

        assertEquals(expected, result);
    }

}
