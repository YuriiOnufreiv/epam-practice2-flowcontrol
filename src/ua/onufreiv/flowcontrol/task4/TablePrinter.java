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
    private static StringBuilder builder;
    /**
     * Prints table in form of left - sided pyramid
     * @param rows amount of rows
     */
    public static void printLeftSided(int rows) {
        builder = new StringBuilder();
        outer:
        for (int i = 0; i < rows; i++) {
            builder.append("\n");
            for (int j = i; ; j--) {
                if (j < 0) {
                    continue outer;
                }
                builder.append(j).append(" ");
            }
        }
        System.out.println(builder.toString());
    }

    /**
     * Prints table in form of right - sided pyramid
     * @param rows amount of rows
     */
    public static void printRightSided(int rows) {
        builder = new StringBuilder();
        int i = 1;
        while (i <= rows) {
            builder.append("\n");
            for (int j = rows; j > 0; j--) {
                if (j <= i) {
                    builder.append(j);
                } else {
                    builder.append(" ");
                }
                builder.append(" ");
            }
            i++;
        }
        System.out.println(builder.toString());
    }
}
