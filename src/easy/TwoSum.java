package easy;


// Problem: https://leetcode.com/problems/two-sum/
// Approach: Use a hashmap to find the two numbers that add up to the target.

/*
Constraints:
- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
Only one valid answer exists.

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int [] nums = {3,2,4};
        int target = 6;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        //implement solution here

        // Return null since it doesn't fit requirements
        if(nums.length == 0) return null;

        // Create HashMap for {key,value} pair
        HashMap<Integer,Integer> map = new HashMap<>();

        // Loop through nums
        for (int i = 0; i < nums.length; i++) {
            // Find the compliment from target and current num (ie; 3 = 6 - 3;
            int compliment = target - nums[i];

            //
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }

            map.put(nums[i],i);

        }

        return null;
    }

}
