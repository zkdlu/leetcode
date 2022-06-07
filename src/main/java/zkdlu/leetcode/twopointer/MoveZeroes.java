package zkdlu.leetcode.twopointer;

import zkdlu.leetcode.Problem;

import java.util.Arrays;

public class MoveZeroes extends Problem {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        Arrays.fill(nums, idx, nums.length, 0);
    }

    @Override
    public void run() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        moveZeroes(input);
        printArray(input);
    }
}
