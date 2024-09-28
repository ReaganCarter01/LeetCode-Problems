package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testLCPEmpty() {
        LongestCommonPrefix longest = new LongestCommonPrefix();
        String[] words = {};
        String expected = "";
        String result = longest.longestCommonPrefix(words);

        assertEquals(expected, result);
    }

    @Test
    public void testLCPValid() {
        LongestCommonPrefix longest = new LongestCommonPrefix();
        String[] words = {"Car","Carshop","Cars"};
        String expected = "Car";
        String result = longest.longestCommonPrefix(words);

        assertEquals(expected, result);
    }

    @Test
    public void testLCPInvalid() {
        LongestCommonPrefix longest = new LongestCommonPrefix();
        String[] words = {"Dog","Carshop","Cars"};
        String expected = "";
        String result = longest.longestCommonPrefix(words);

        assertEquals(expected, result);
    }

}
