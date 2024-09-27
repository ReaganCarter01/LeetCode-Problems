package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    @Test
    public void testPositivePalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(121), "121 should be a palindrome.");
        assertTrue(PalindromeNumber.isPalindrome(12321), "12321 should be a palindrome.");
        assertTrue(PalindromeNumber.isPalindrome(1221), "1221 should be a palindrome.");
    }

    @Test
    public void testNegativePalindrome() {
        assertFalse(PalindromeNumber.isPalindrome(-121), "-121 should not be a palindrome.");
        assertFalse(PalindromeNumber.isPalindrome(-12321), "-12321 should not be a palindrome.");
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeNumber.isPalindrome(10), "10 should not be a palindrome.");
        assertFalse(PalindromeNumber.isPalindrome(123), "123 should not be a palindrome.");
        assertFalse(PalindromeNumber.isPalindrome(1000021), "1000021 should not be a palindrome.");
    }

    @Test
    public void testSingleDigit() {
        assertTrue(PalindromeNumber.isPalindrome(0), "0 should be a palindrome.");
        assertTrue(PalindromeNumber.isPalindrome(1), "1 should be a palindrome.");
        assertTrue(PalindromeNumber.isPalindrome(9), "9 should be a palindrome.");
    }

    @Test
    public void testPalindromeWithZeros() {
        assertTrue(PalindromeNumber.isPalindrome(1001), "1001 should be a palindrome.");
        assertFalse(PalindromeNumber.isPalindrome(100), "100 should not be a palindrome.");
    }
}
