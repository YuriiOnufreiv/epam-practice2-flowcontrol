package ua.onufreiv.flowcontrol.task1;

import java.util.Random;

/**
 * Created by yurii on 11/3/16.
 */
public class NumberProcessorRunner {
    public static final int TESTS_AMOUNT = 5;

    public static void main(String[] args) {
        System.out.println("ASSIGNMENT #1");
        Random random = new Random();

        for (int i = 0; i < TESTS_AMOUNT; i++) {
            int number = random.nextInt(Integer.MAX_VALUE);
            int digit = random.nextInt(10);
            System.out.printf("Number: %10d; amount of '%d' - %d\n", number, digit,
                    NumberProcessor.getAmountOfDigitPresence(number, digit));
        }
    }

}
