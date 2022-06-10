package zkdlu.leetcode.binarysearch.easy;

import zkdlu.leetcode.Problem;

import java.util.Arrays;

public class BinarySearch extends Problem {
    public int search(int[] nums, int target) {
        int a = Arrays.binarySearch(nums, target);
        if (a < 0)
            return -1;
        return a;
    }

    @Override
    public void run() {
        int[] input = new int[]{-1,0,3,5,9,12};
        print(search(input, 9));
    }
}
