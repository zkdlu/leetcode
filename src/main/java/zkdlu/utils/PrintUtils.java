package zkdlu.utils;

import java.util.Arrays;
import java.util.StringJoiner;

public class PrintUtils {

    public static void prints(char... chars) {
        printArray(chars);
    }

    public static void prints(int... nums) {
        printArray(nums);
    }
    public static void print(int num) {
        System.out.println("num = " + num);
    }
    public static void print(String str) {
        System.out.println(str);
    }

    public static void printArray(int[] array) {
        printArray(Arrays.stream(array)
                .boxed()
                .toArray());
    }

    public static void printArray(char[] array) {
        printArray(new String(array).split(""));
    }

    public static void printArray(double[] array) {
        printArray(Arrays.stream(array)
                .boxed()
                .toArray());
    }

    public static void printArray(Object[] array) {
        StringJoiner joiner = new StringJoiner(",");
        for (Object obj: array) {
            joiner.add(obj.toString());
        }

        System.out.println("[" + joiner.toString() + "]");
    }
}
