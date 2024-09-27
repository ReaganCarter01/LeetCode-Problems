package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumSameValues() {
        TwoSum solution = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumWithNoSolution() {
        TwoSum solution = new TwoSum();
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = solution.twoSum(nums, target);

        assertNull(result); // Expecting null if no solution is found
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        TwoSum solution = new TwoSum();
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result); // Asserting the result with negative numbers
    }

    @Test
    public void testTwoSumWithMultiplePairs() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 3, 4, 5};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result); // Check if multiple pairs still return correct indices
    }

}
