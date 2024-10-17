package algorithms;

import java.util.Arrays;

class RunningSumCalculator {
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];  // The first element is the same as the original array

        // Calculate running sum for each element
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        System.out.println("Running sum of " + Arrays.toString(nums1) + " is " +
                Arrays.toString(runningSum(nums1)));
        System.out.println();

        int[] nums2 = {1,1,1,1,1};
        System.out.println("Running sum of " + Arrays.toString(nums2) + " is " +
                Arrays.toString(runningSum(nums2)));
        System.out.println();

        int[] nums3 = {3,1,2,10,1};
        System.out.println("Running sum of " + Arrays.toString(nums3) + " is " +
                Arrays.toString(runningSum(nums3)));
     }
}
