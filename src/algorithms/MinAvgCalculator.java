package algorithms;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MinAvgCalculator {

    public double minimumAverage(int[] nums) {
        // Sort the array to easily remove smallest and largest elements
        Arrays.sort(nums);
        ArrayList<Double> averages = new ArrayList<>();
        int n = nums.length;

        // Perform the operation n/2 times
        for (int i = 0; i < n / 2; i++) {
            // Remove smallest and largest elements
            int minElement = nums[i];
            int maxElement = nums[n - i - 1];

            // Calculate their average and add it to the list
            double avg = (minElement + maxElement) / 2.0;
            averages.add(avg);
        }

        // Return the smallest value in averages list
        return Collections.min(averages);
    }

    public static void main(String[] args) {
        MinAvgCalculator minAvgCalculator = new MinAvgCalculator();

        // Test case 1
        int[] nums1 = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(minAvgCalculator.minimumAverage(nums1));  // Output: 5.5

        // Test case 2
        int[] nums2 = {1, 9, 8, 3, 10, 5};
        System.out.println(minAvgCalculator.minimumAverage(nums2));  // Output: 5.5

        // Test case 3
        int[] nums3 = {1, 2, 3, 7, 8, 9};
        System.out.println(minAvgCalculator.minimumAverage(nums3));  // Output: 5.0
    }
}
