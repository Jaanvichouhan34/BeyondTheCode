package leetocde;
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;  // Left pointer: start of the window
        int max = 0; // Longest valid window found so far

        // HashSet stores unique characters in the current window
        Set<Character> set = new HashSet<>();

        // Right pointer expands the window one character at a time
        for (int r = 0; r < s.length(); r++) {

            // If the current character is already in the window,
            // remove characters from the left until the duplicate is gone
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            // Add the current character only after removing duplicates
            set.add(s.charAt(r));

            // Window length: +1 because both l and r are included
            int length = r - l + 1;

            // Keep the maximum length found so far
            max = Math.max(max, length);
        }

        return max;
    }
}
