package ua.onufreiv.flowcontrol.task3;

/**
 * Created by yurii on 11/4/16.
 */
public class DepositCalculator {
    private double initialAmount;
    private double percent;
    private int yearsDuration;

    public DepositCalculator(double initialAmount, double percent, int yearsDuration) {
        if(initialAmount < 0 || percent < 0 || yearsDuration < 0) {
            throw new IllegalArgumentException("Input data can't be negative");
        }

        this.initialAmount = initialAmount;
        this.percent = percent;
        this.yearsDuration = yearsDuration;
    }

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
