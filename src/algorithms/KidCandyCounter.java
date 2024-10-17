package algorithms;

import java.util.ArrayList;
import java.util.List;

class KidCandyCounter {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies any kid has
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Create a result list to store boolean values
        List<Boolean> result = new ArrayList<>();

        // For each kid, check if they can have the greatest number of candies after getting extraCandies
        for (int candy : candies) {
            // Check if current kid's candies + extraCandies >= maxCandies
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2,3,5,1,3}; int extraCandies1 = 3;
        System.out.println("Input: candies = [2,3,5,1,3], extraCandies = 3");
        System.out.println("Output:" + kidsWithCandies(candies1, extraCandies1));
        System.out.println();

        int[] candies2 = {4,2,1,1,2}; int extraCandies2 = 1;
        System.out.println("Input: candies = [4,2,1,1,2], extraCandies = 1");
        System.out.println("Output:" + kidsWithCandies(candies2, extraCandies2));
        System.out.println();

        int[] candies3 = {12,1,12}; int extraCandies3 = 10;
        System.out.println("Input: candies = [12,1,12], extraCandies = 10");
        System.out.println("Output:" + kidsWithCandies(candies3, extraCandies3));

    }
}
