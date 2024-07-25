Maximum Product of Three Numbers

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Get the length of the array
        int n = nums.length;

        // The maximum product of the three largest numbers
        int max1 = nums[n-1] * nums[n-2] * nums[n-3];

        // The maximum product of the two smallest numbers and the largest number
        int max2 = nums[0] * nums[1] * nums[n-1];

        // Return the maximum of the two computed products
        return Math.max(max1, max2);
    }
}
