package ua.onufreiv.flowcontrol.task4;

/**
 * Created by yurii on 11/4/16.
 */
public class PyramidPrinter {
    public static void printLeftSided(int size) {
        outer:
        for (int i = 0; i <= size; i++) {
            System.out.println();
            for (int j = i; ; j--) {
                if (j < 0) {
                    continue outer;
                }
                System.out.print(j + " ");
            }
        }
    }

    public static void printRightSided(int size) {
        int i = 1;
        while (i <= size) {
            System.out.println();
            for (int j = size; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            i++;
        }
    }
}
