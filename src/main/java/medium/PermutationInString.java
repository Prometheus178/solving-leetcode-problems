package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Time complexity O(N)
 * Space complexity O(k)
 * Author: Sergey.
 */
public class PermutationInString {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("a", "ab")); // true
        System.out.println(checkInclusion("adc", "dcda")); // true
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int windowSize = s1.length();
        for (int i = 0; i < windowSize; i++) {
            char c = s2.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
        }

        if (freqMap.equals(windowMap)) {
            return true;
        }

        for (int i = windowSize; i < s2.length(); i++) {
            char leftChar = s2.charAt(i - windowSize);

            char rightChar = s2.charAt(i);
            windowMap.put(leftChar, windowMap.get(leftChar) - 1);
            if (windowMap.get(leftChar) == 0) {
                windowMap.remove(leftChar);
            }
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);
            if (freqMap.equals(windowMap)) {
                return true;
            }
        }
        return false;
    }
}
