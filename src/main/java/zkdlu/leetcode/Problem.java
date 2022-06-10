package zkdlu.leetcode;

public abstract class Problem {

    public abstract void run();

    public void print(int num) {
        Utils.print(num);
    }
    public void print(String str) {
        Utils.print(str);
    }

    public void printArray(int[] array) {
        Utils.printArray(array);
    }

    public void printArray(char[] array) {
        Utils.printArray(array);
    }

    public void printArray(double[] array) {
        Utils.printArray(array);
    }

    public void printArray(Object[] array) {
        Utils.printArray(array);
    }
}
