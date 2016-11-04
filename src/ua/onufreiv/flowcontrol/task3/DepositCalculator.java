/**
 * Flow control. Task 3
 */
package ua.onufreiv.flowcontrol.task3;

/**
 * Class encapsulates data about deposit and allows to find minimal integer amount of years
 * for getting required profit from the deposit
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class DepositCalculator {
    private double initialAmount;
    private double percent;
    private int yearsDuration;

    /**
     * Parametrized constructor. Initializes the object fields with the specified data
     * @param initialAmount amount, that was put into deposit
     * @param percent percent of profit, that customer receives every year
     * @param yearsDuration duration of deposit in years
     */
    public DepositCalculator(double initialAmount, double percent, int yearsDuration) {
        if(initialAmount < 0 || percent < 0 || yearsDuration < 0) {
            throw new IllegalArgumentException("Input data can't be negative");
        }

        this.initialAmount = initialAmount;
        this.percent = percent;
        this.yearsDuration = yearsDuration;
    }

    /**
     * Calculates the amount of years, needed for receiving of specified amount of money.
     * <p> Uses {@code while} cycle and {@code return} statement
     * @param targetAmount amount of money, that should be received
     * @return required amount of years, or -1 if the required amount of years is greater
     *         than total duration of deposit in ({@code yearsDuration} value}
     */
    public int getDurationWithWhile(double targetAmount) {
        int yearsRequired = 0;
        double tempAmount = initialAmount;

        while (tempAmount < targetAmount) {
            yearsRequired++;
            tempAmount += tempAmount * percent / 100;
            if (yearsRequired > yearsDuration) {
                return -1;
            }
        }

        return yearsRequired;
    }

    /**
     * Calculates the amount of years, needed for receiving of specified amount of money.
     * <p> Uses {@code do...while} cycle and {@code System.exit()} statement
     * @param targetAmount amount of money, that should be received
     * @return required amount of years
     */
    public int getDurationWithDoWhile(double targetAmount) {
        int yearsRequired = 0;
        double tempAmount = initialAmount;

        do {
            yearsRequired++;
            if (yearsRequired > yearsDuration) {
                System.exit(0);
            }
            tempAmount += tempAmount * percent / 100;
        } while (tempAmount < targetAmount);

        return yearsRequired;
    }

    /**
     * Calculates the amount of years, needed for receiving of specified amount of money.
     * <p> Uses {@code for} cycle and {@code break} statement
     * @param targetAmount amount of money, that should be received
     * @return required amount of years, or -1 if the required amount of years is greater
     *         than total duration of deposit in ({@code yearsDuration} value}
     */
    public int getDurationWithFor(double targetAmount) {
        int yearsRequired = 0;
        double tempAmount = initialAmount;

        for (int i = 0; i < yearsDuration; i++) {
            if (tempAmount >= targetAmount) {
                break;
            }
            yearsRequired++;
            tempAmount += tempAmount * percent / 100;
        }

        return (tempAmount >= targetAmount) ? yearsRequired : -1;
    }
}
