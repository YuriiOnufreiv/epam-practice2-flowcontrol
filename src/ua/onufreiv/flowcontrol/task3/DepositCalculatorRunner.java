package ua.onufreiv.flowcontrol.task3;

/**
 * Created by yurii on 11/4/16.
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
