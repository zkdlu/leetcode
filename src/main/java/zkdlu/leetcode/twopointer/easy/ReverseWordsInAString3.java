package zkdlu.leetcode.twopointer.easy;

import zkdlu.leetcode.Problem;

public class ReverseWordsInAString3 extends Problem {
    public String reverseWords(String s) {
        String[] elems = s.split(" ");
        String[] result = new String[elems.length];

        for (int i = 0; i < elems.length; i++) {
            String elem = elems[i];
            int size = elem.length();

            char[] cs = elem.toCharArray();
            for (int j = 0; j < size / 2; j++) {
                char temp = cs[size - 1 - j];
                cs[size - 1 - j] = cs[j];
                cs[j] = temp;
            }

            result[i] = new String(cs);
        }

        return String.join(" ", result);
    }

    @Override
    public void run() {
        String input = "Let's take LeetCode contest";
        String output = reverseWords(input);
        print(output);
    }
}
