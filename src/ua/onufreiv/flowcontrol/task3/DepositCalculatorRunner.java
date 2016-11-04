/**
 * Flow control. Task 3
 */
package ua.onufreiv.flowcontrol.task3;

/**
 * Runner class for demonstrating the solution for Task 3 - finding minimal integer amount of years
 * for getting required profit from the deposit
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class DepositCalculatorRunner {
    public static void main(String[] args) {
        double initialAmount = 100;
        double percent = 10;
        int yearsDuration = 3;
        int targetAmount = 133;

        DepositCalculator depositCalculator = new DepositCalculator(initialAmount, percent, yearsDuration);
        System.out.println("Years required to achieve the target amount: " + targetAmount);
        System.out.printf("For: %8d\n", depositCalculator.getDurationWithFor(targetAmount));
        System.out.printf("While: %6d\n", depositCalculator.getDurationWithWhile(targetAmount));
        System.out.printf("Do While: %3d\n", depositCalculator.getDurationWithDoWhile(targetAmount));
    }
}
