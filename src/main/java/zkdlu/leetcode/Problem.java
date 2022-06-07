package zkdlu.leetcode;

import java.util.Arrays;
import java.util.StringJoiner;

public abstract class Problem {

    public abstract void run();

    public void printArray(int[] array) {
        printArray(Arrays.stream(array)
                .boxed()
                .toArray());
    }

    public void printArray(double[] array) {
        printArray(Arrays.stream(array)
                .boxed()
                .toArray());
    }

    public void printArray(Object[] array) {
        StringJoiner joiner = new StringJoiner(",");
        for (Object obj: array) {
            joiner.add(obj.toString());
        }

        System.out.println("[" + joiner.toString() + "]");
    }
}
