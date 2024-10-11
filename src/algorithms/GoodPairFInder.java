package algorithms;

import java.util.HashMap;
import java.util.Map;

public class GoodPairFInder {
    public static int numIdenticalPairs(int[] nums) {
        // To store the frequency of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the map, it means we can form a good pair
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num);
            }
            // Update the count of this number in the map
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1)); // Output: 4

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2)); // Output: 6

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3)); // Output: 0
    }
}
