/**
 * Flow control. Task 4
 */
package ua.onufreiv.flowcontrol.task4;

/**
 * Class contains methods for printing tables in form of left-sided or right-sided pyramids
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class TablePrinter {
    /**
     * Prints table in form of left - sided pyramid
     * @param rows amount of rows
     */
    public static void printLeftSided(int rows) {
        outer:
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = i; ; j--) {
                if (j < 0) {
                    continue outer;
                }
                System.out.print(j + " ");
            }
        }
    }

    /**
     * Prints table in form of right - sided pyramid
     * @param rows amount of rows
     */
    public static void printRightSided(int rows) {
        int i = 1;
        while (i <= rows) {
            System.out.println();
            for (int j = rows; j > 0; j--) {
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
