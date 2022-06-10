package zkdlu.leetcode;

import zkdlu.utils.PrintUtils;

public abstract class Problem {

    public abstract void run();

    public void print(int num) {
        PrintUtils.print(num);
    }
    public void print(String str) {
        PrintUtils.print(str);
    }

    public void printArray(int[] array) {
        PrintUtils.printArray(array);
    }

    public void printArray(char[] array) {
        PrintUtils.printArray(array);
    }

    public void printArray(double[] array) {
        PrintUtils.printArray(array);
    }

    public void printArray(Object[] array) {
        PrintUtils.printArray(array);
    }
}
