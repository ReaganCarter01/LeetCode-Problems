package easy;

// Problem: https://leetcode.com/problems/roman-to-integer/description/
// Approach: Use a hashmap based on Key value and check if the currentVal is less than the next value

/*
- I can be placed before V (5) and X (10) to make 4 and 9.
- X can be placed before L (50) and C (100) to make 40 and 90.
- C can be placed before D (500) and M (1000) to make 400 and 900.
 */
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentVal = romanMap.get(s.charAt(i));

            if(i < s.length() -1 && currentVal < romanMap.get(s.charAt(i+1))){
                result -= currentVal;
            }else{
                result += currentVal;
            }
        }

        return result;
    }
}