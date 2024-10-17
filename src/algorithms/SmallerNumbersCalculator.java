package algorithms;

import java.util.Arrays;

class SmallerNumbersCalculator {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        // Loop through each number in nums
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            // Compare nums[i] with every other number in the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            // Store the count of numbers smaller than nums[i]
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {8,1,2,2,3};
        System.out.println("Numbers smaller than current of " + Arrays.toString(nums1) + " are " +
                Arrays.toString(smallerNumbersThanCurrent(nums1)));
        System.out.println();

        int[] nums2 = {6,5,4,8};
        System.out.println("Numbers smaller than current of " + Arrays.toString(nums2) + " are " +
                Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println();

        int[] nums3 = {7,7,7,7};
        System.out.println("Numbers smaller than current of " + Arrays.toString(nums3) + " are " +
                Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }

}
