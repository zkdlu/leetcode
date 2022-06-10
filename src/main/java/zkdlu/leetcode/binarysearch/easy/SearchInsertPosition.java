package zkdlu.leetcode.binarysearch.easy;

import zkdlu.leetcode.Problem;

public class SearchInsertPosition extends Problem {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    @Override
    public void run() {
        int[] input = new int[]{1,3,5,6};
        print(searchInsert(input, 5));
    }
}
