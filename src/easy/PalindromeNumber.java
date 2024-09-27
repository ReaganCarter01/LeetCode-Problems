package easy;
// Problem: https://leetcode.com/problems/palindrome-number/
// Approach:

/*
Constraints:
-2^31 <= x <= 2^31 - 1

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        // Test cases
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;
        int test4 = 12321;

        // Calling the method to check if the numbers are palindromes
        System.out.println("Is " + test1 + " a palindrome? " + isPalindrome(test1));
        System.out.println("Is " + test2 + " a palindrome? " + isPalindrome(test2));
        System.out.println("Is " + test3 + " a palindrome? " + isPalindrome(test3));
        System.out.println("Is " + test4 + " a palindrome? " + isPalindrome(test4));
    }

    public static boolean isPalindrome(int value){

        // A negative number is not a palindrome
        if(value < 0) return false;

        // A number ending in 0 (except 0 itself) is not a palindrome
        if( value != 0 && value % 10 == 0) return false;

        int reverseHalf = 0;

        // Reverse half of the number
        while(value > reverseHalf){
            reverseHalf = reverseHalf * 10 + value % 10;
            value /= 10;
        }


        // Compare the original half (x) with the reversed half
        // When the number has an odd number of digits, the middle digit is ignored
        return value == reverseHalf || value == reverseHalf /10;
    }

}
