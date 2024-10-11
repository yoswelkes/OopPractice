package algorithms;

import java.util.ArrayList;
import java.util.List;

public class WordFinder {
    public List<Integer> findWordsContainingChar(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();

        // Loop through all words
        for (int i = 0; i < words.length; i++) {
            // Check if the word contains the character x
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        WordFinder wordFinder = new WordFinder();

        // Test case 1
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        System.out.println("Indices for test case 1: " + wordFinder.findWordsContainingChar(words1, x1));  // Expected: [0, 1]

        // Test case 2
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        System.out.println("Indices for test case 2: " + wordFinder.findWordsContainingChar(words2, x2));  // Expected: [0, 2]

        // Test case 3
        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        System.out.println("Indices for test case 3: " + wordFinder.findWordsContainingChar(words3, x3));  // Expected: []

    }
}

/*
2942. Find Words Containing Character

You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.

Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.


Constraints:

1 <= words.length <= 50
1 <= words[i].length <= 50
x is a lowercase English letter.
words[i] consists only of lowercase English letters.
 */