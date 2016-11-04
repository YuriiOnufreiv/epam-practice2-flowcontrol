/**
 * Flow control. Task 4
 */
package ua.onufreiv.flowcontrol.task4;

/**
 * Runner class for demonstrating the solution for Task 4 - printing tables in form of  pyramid
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class TablePrinterRunner {
    public static void main(String[] args) {
        TablePrinter.printLeftSided(5);
        System.out.println();
        TablePrinter.printRightSided(5);
    }
}
