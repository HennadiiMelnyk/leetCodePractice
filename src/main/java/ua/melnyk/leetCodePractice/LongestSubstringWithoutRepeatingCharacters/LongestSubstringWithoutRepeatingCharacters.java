package ua.melnyk.leetCodePractice.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String example = "abcabcbb";
        String example2 = "bbbbb";
        String example3 = "pwwkew";
        String example4 = "dvdf";
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring(example4));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        char[] arr = s.toCharArray();
        int start = 0;
        int result = 0;
        HashMap<Character, Integer> notRepeatableMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (notRepeatableMap.containsKey(arr[i])) {

                start = Math.max(start, notRepeatableMap.get(arr[i]) + 1);
                notRepeatableMap.put(arr[i], i);
            } else {
                notRepeatableMap.put(arr[i], i);
            }
            result = Math.max(result, i - start + 1);

        }
        return result;
    }
}
