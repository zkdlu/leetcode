package zkdlu.leetcode.twopointer.medium;

import zkdlu.leetcode.Problem;

public class RotateArray extends Problem {

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] clone = nums.clone();

        for (int i = 0; i < size; i++) {
            nums[(i + k) % size] = clone[i];
        }
    }

    @Override
    public void run() {
        int[] input = new int[]{1,2,3,4,5,6,7};
        rotate(input, 3);
        printArray(input);

        input = new int[]{-1,-100,3,99};
        rotate(input, 2);
        printArray(input);

        input = new int[]{1, 2};
        rotate(input, 3);
        printArray(input);
    }
}
