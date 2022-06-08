package zkdlu.leetcode.twopointer.easy;

import zkdlu.leetcode.Problem;

public class SquaresOfaSortedArray extends Problem {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        int l = 0;
        int h = size - 1;
        int count = 0;

        while (l <= h) {
            if (Math.pow(nums[l], 2) < Math.pow(nums[h], 2)) {
                result[size - count - 1] = (int)Math.pow(nums[h], 2);
                h--;
            } else {
                result[size - count - 1] = (int)Math.pow(nums[l], 2);
                l++;
            }
            count++;
        }



        return result;
    }

    @Override
    public void run() {
        int[] inputs = new int[]{-4, -1, 0, 3, 10};
        int[] output = sortedSquares(inputs);

        for (int i : output) {
            System.out.println("i = " + i);
        }
    }
}