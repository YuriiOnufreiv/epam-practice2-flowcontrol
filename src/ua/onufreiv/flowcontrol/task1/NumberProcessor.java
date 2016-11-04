package ua.onufreiv.flowcontrol.task1;

/**
 * Created by yurii on 11/3/16.
 */
public class NumberProcessor {
    public static int getAmountOfDigitPresence(int number, int digit) {
        if(digit < 0 || digit > 9) {
            throw new IllegalArgumentException("Second argument " +
                    "should be from the [0; 9] range");
        }

        int amount = 0;
        number = Math.abs(number);

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            if (lastDigit == digit) {
                amount++;
            }
        }

        return amount;
    }
}
