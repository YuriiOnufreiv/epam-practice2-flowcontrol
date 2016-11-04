/**
 * Flow control. Task 1
 */
package ua.onufreiv.flowcontrol.task1;

/**
 * Class has method for counting the amount of particular digit presence in the specified number
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class NumberProcessor {

    /**
     * Counts the amount of particular digit presence in the specified number
     * @param number number to search digit in
     * @param digit digit to search
     * @return amount of digit presence
     */
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
