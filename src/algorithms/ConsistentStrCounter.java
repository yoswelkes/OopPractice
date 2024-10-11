package algorithms;

import java.util.Arrays;
import java.util.HashSet;

class ConsistentStrCounter {
    public static int countConsistentStrings(String allowed, String[] words) {
        // Create a set for allowed characters
        HashSet<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int consistentCount = 0;

        // Loop through each word in words array
        for (String word : words) {
            boolean isConsistent = true;

            // Check if each character in the word is in the allowed set
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;  // If character is not allowed, mark as inconsistent
                    break;
                }
            }

            // If the word is consistent, increment the count
            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }

    public static void main(String[] args) {
        String allowed1 = "ab"; String[] words1 = {"ad","bd","aaab","baa","badab"};

        System.out.println("Number of consistent '" +
                allowed1 + "' strings in " +
                Arrays.toString(words1) + ": " +
                countConsistentStrings(allowed1, words1));

        String allowed2 = "abc"; String[] words2 = {"a","b","c","ab","ac","bc","abc"};

        System.out.println("Number of consistent '" +
                allowed2 + "' strings in " +
                Arrays.toString(words2) + ": " +
                countConsistentStrings(allowed2, words2));

        String allowed3 = "cad"; String[] words3 = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println("Number of consistent '" +
                allowed3 + "' strings in " +
                Arrays.toString(words3) + ": " +
                countConsistentStrings(allowed3, words3));

    }
}
