/**
 * Flow control. Task 2
 */
package ua.onufreiv.flowcontrol.task2;

import java.util.Random;

/**
 * Runner class for demonstrating the solution for Task 2 - finding amount of numbers,
 * minimal, maximal and average values for the randomly generated array
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class ArrayProcessorRunner {
    private static final int TESTS_AMOUNT = 3;
    private static final int MAX_ARRAY_LENGTH = 15;
    private static final int MIN_BOUNDARY = -50;
    private static final int MAX_BOUNDARY = 50;

    public static void main(String[] args) {
        Random random = new Random();
        ArrayProcessor arrayProcessor;

        System.out.println("ASSIGNMENT #2");
        for (int i = 0; i < TESTS_AMOUNT; i++) {
            int lengthOfArray = random.nextInt(MAX_ARRAY_LENGTH + 1) + 1;
            int[] array = random.ints(lengthOfArray, MIN_BOUNDARY, MAX_BOUNDARY).toArray();
            arrayProcessor = new ArrayProcessor(array);
            System.out.println("\nResult of precessing:");
            System.out.println(arrayProcessor);
        }
    }

}
