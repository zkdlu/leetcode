package zkdlu.leetcode.twopointer.medium;

import zkdlu.leetcode.Problem;

public class TwoSum2InputArrayIsSorted extends Problem {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            if (numbers[low] + numbers[high] > target) {
                high--;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                break;
            }
        }

        return new int[]{low + 1, high + 1};
    }

    @Override
    public void run() {
        int[] input = new int[]{2, 7, 11, 15};
        printArray(twoSum(input, 9));

        input = new int[]{2,3,4};
        printArray(twoSum(input, 6));

        input = new int[]{-1, 0};
        printArray(twoSum(input, -1));
    }
}
