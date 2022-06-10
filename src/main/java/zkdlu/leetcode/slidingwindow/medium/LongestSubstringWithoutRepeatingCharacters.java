package zkdlu.leetcode.slidingwindow.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> substring = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (substring.contains(s.charAt(j))) {
                    break;
                }
                substring.add(s.charAt(j));
            }

            if (substring.size() > longest) {
                longest = substring.size();
            }
        }

        return longest;
    }
}
