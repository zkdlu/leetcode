package zkdlu.leetcode.twopointer.easy;

import zkdlu.leetcode.Problem;

public class ReverseString extends Problem {
    public void reverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < size / 2; i++) {
            char temp = s[size - 1 - i];
            s[size - 1 - i] = s[i];
            s[i] = temp;
        }
    }
    @Override
    public void run() {
        char[] input = new char[]{'h','e','l','l','o'};
        reverseString(input);
        printArray(input);
    }
}
